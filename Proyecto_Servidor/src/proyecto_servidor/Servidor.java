package proyecto_servidor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sun.corba.se.impl.io.IIOPInputStream;
import connection.DBConnection;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jjimenez
 */
public class Servidor {
    
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket socket;
        ObjectOutputStream oos;
        ObjectInputStream ois;
        DBConnection connection = new DBConnection();

        try {
            servidor = new ServerSocket(connection.getPort());

        } catch (Exception e) {
            e.printStackTrace();
        }
        while(true){

            try {
                socket = servidor.accept();

                oos = new ObjectOutputStream(socket.getOutputStream());
                ois = new ObjectInputStream(socket.getInputStream());
                HiloServidor hilo = new HiloServidor(socket, oos, ois);
                hilo.start();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}
