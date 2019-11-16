/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_servidor;

import Utils.Utils;
import dao.UsersPOP;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.PackageInfo;
import vo.User;

/**
 *
 * @author jjimenez
 */
public class HiloServidor extends Thread{
    ObjectOutputStream salida;
    ObjectInputStream entrada;
    PackageInfo packageInfo;
    Socket socket = null;
    Utils utils = new Utils();
    
    

    HiloServidor(Socket usuario, ObjectOutputStream salida, ObjectInputStream entrada) {
        this.socket = usuario;
        this.entrada = entrada;
        this.salida = salida;
    }

    @Override
    public void run() {
        try {
            packageInfo = (PackageInfo) entrada.readObject();
            System.out.println("Objeto leido: " + packageInfo.getTipo());
            int tipo = packageInfo.getTipo();
            
            if(tipo == utils.COMPROBAR_USUARIO_ESCRITORIO){
                User usuario = (User) packageInfo.getObjeto();
                UsersPOP userPOP = new UsersPOP();
                salida.writeObject(userPOP.checkUserLoginEscritorio(usuario));
            }
            
            if(tipo == utils.INSERTAR_USUARIO){
                User usuario = (User) packageInfo.getObjeto();
                UsersPOP usersPOP = new UsersPOP();
                usersPOP.insertUserEscritorio(usuario);
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.run(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
