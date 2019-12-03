/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_servidor;

import Utils.Utils;
import com.google.gson.Gson;
import dao.ClinicPOP;
import dao.PetPOP;
import dao.ReportPOP;
import dao.UsersPOP;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import vo.*;

/**
 *
 * @author jjimenez
 */
public class HiloServidor extends Thread{
    ObjectOutputStream oos;
    ObjectInputStream ois;
    DataOutputStream salida;
    DataInputStream entrada;
    PackageInfo packageInfo;
    Socket socket = null;
    Utils utils = new Utils();
    
    

    public HiloServidor(Socket usuario, ObjectOutputStream salida, ObjectInputStream entrada) {
        this.socket = usuario;
        this.ois = entrada;
        this.oos = salida;
    }

    public HiloServidor(Socket usuario, DataOutputStream salida, DataInputStream entrada) {
        this.socket = usuario;
        this.entrada = entrada;
        this.salida = salida;
    }

    @Override
    public void run() {
        System.out.println("Esperando conexion en hilo");
        try {
            Gson gson = new Gson();
            packageInfo = gson.fromJson(entrada.readUTF(), PackageInfo.class);
            System.out.println("*******************************************************************");
            System.out.println("CONSULTA A REALIZAR: " + packageInfo.getTipo());
            System.out.println("Objeto dentro: " + packageInfo.getObjeto());
            System.out.println("*******************************************************************");
            switch (packageInfo.getTipo()){
                case Utils.COMPROBAR_USUARIO:
                    salida.writeUTF(comprobarUsuario(gson, packageInfo));
                    break;
                case Utils.INSERTAR_USUARIO:
                    insertarUsuario(gson, packageInfo);
                    break;
                case Utils.OBTENER_CLIENTES_CLINICA:
                    salida.writeUTF(otenerClientesClinica(gson, packageInfo));
                    break;
                case Utils.OBTENER_MASCOTAS_USUARIO:
                    salida.writeUTF(otenerMascotasUsuario(gson, packageInfo));
                    break;
                case Utils.OBTENER_MASCOTAS_USUARIO_CLINICA:
                    salida.writeUTF(otenerMascotasUsuarioClinica(gson, packageInfo));
                    break;
                case Utils.OBTENER_CLINICA_ID:
                    salida.writeUTF(otenerClinicaId(gson, packageInfo));
                    break;
                case Utils.OBTENER_MASCOTAS_CLINICA:
                    salida.writeUTF(otenerMascotasClinica(gson, packageInfo));
                    break;
                case Utils.OBTENER_NOMBRE_PROPIETARIO_ID:
                    salida.writeUTF(otenerNombrePropietarioId(gson, packageInfo));
                    break;
                case Utils.OBTENER_ULTIMO_INFORME:
                    salida.writeUTF(otenerUltimoInforme(gson, packageInfo));
                    break;
                case Utils.OBTENER_INFORMES_MASCOTA:
                    salida.writeUTF(otenerInformesMascota(gson, packageInfo));
                    break;
            }
            System.out.println("PACKAGE ENVIADO " + packageInfo.getTipo() + " Objetos " + packageInfo.getObjeto());
            System.out.println("MAIN FINALIZADO");
        } catch (IOException ex) {
            Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String otenerInformesMascota(Gson gson, PackageInfo packageInfo) {
        int petId = gson.fromJson(packageInfo.getObjeto(), Integer.class);
        ReportPOP reportPOP = new ReportPOP();
        Reports reports = reportPOP.getReportsById(petId);
        packageInfo.setObjeto(gson.toJson(reports, Reports.class));
        return gson.toJson(packageInfo, PackageInfo.class);
    }

    private String otenerUltimoInforme(Gson gson, PackageInfo packageInfo) {
        int petId = gson.fromJson(packageInfo.getObjeto(), Integer.class);
        ReportPOP reportPOP = new ReportPOP();
        Report lastReport = reportPOP.getLastReport(petId);
        packageInfo.setObjeto(gson.toJson(lastReport, Report.class));
        return gson.toJson(packageInfo, PackageInfo.class);
    }

    private String otenerNombrePropietarioId(Gson gson, PackageInfo packageInfo) {
        int propietarioId = gson.fromJson(packageInfo.getObjeto(), Integer.class);
        UsersPOP usersPOP = new UsersPOP();
        String ownerName = usersPOP.getOwnerNameById(propietarioId);
        packageInfo.setObjeto(gson.toJson(ownerName, String.class));
        return gson.toJson(packageInfo, PackageInfo.class);
    }

    private String otenerMascotasClinica(Gson gson, PackageInfo packageInfo) {
        Clinic clinic = gson.fromJson(packageInfo.getObjeto(), Clinic.class);
        PetPOP petPOP = new PetPOP();
        Pets pets = petPOP.getPetsBelongsClinic(clinic.getCliniId());
        packageInfo.setObjeto(gson.toJson(pets, Pets.class));
        return gson.toJson(packageInfo, PackageInfo.class);
    }

    private String otenerClinicaId(Gson gson, PackageInfo packageInfo) {
        User user = gson.fromJson(packageInfo.getObjeto(), User.class);
        ClinicPOP clinicPOP = new ClinicPOP();
        Clinic clinic = clinicPOP.getClinicFromId(user.getClincId());
        packageInfo.setObjeto(gson.toJson(clinic, Clinic.class));
        return gson.toJson(packageInfo, PackageInfo.class);
    }

    private String otenerMascotasUsuarioClinica(Gson gson, PackageInfo packageInfo) {
        String ownerIdAndClinicId = gson.fromJson(packageInfo.getObjeto(), String.class);
        String[] splited = ownerIdAndClinicId.split("-");
        int ownerId = Integer.parseInt(splited[0]);
        int clinicId = Integer.parseInt(splited[1]);
        PetPOP petPOP = new PetPOP();
        Pets pets = petPOP.getPetsForOwnerBelongsClinic(ownerId, clinicId);
        packageInfo.setObjeto(gson.toJson(pets, Pets.class));
        return gson.toJson(packageInfo, PackageInfo.class);
    }

    private String otenerMascotasUsuario(Gson gson, PackageInfo packageInfo) {
        int ownerId = gson.fromJson(packageInfo.getObjeto(), Integer.class);
        PetPOP petPOP = new PetPOP();
        Pets pets = petPOP.getPetsForOwner(ownerId);
        packageInfo.setObjeto(gson.toJson(pets, Pets.class));
        return gson.toJson(packageInfo, PackageInfo.class);
    }

    private String otenerClientesClinica(Gson gson, PackageInfo packageInfo) {
        Clinic clinic = gson.fromJson(packageInfo.getObjeto(), Clinic.class);
        UsersPOP usersPOP = new UsersPOP();
        Users users = usersPOP.getOwnersForClinic(clinic);
        packageInfo.setObjeto(gson.toJson(users, Users.class));
        return gson.toJson(packageInfo, PackageInfo.class);
    }

    private void insertarUsuario(Gson gson, PackageInfo packageInfo) {
        User usuarioIn = gson.fromJson(packageInfo.getObjeto(), User.class);
        UsersPOP usersPOP = new UsersPOP();
        User usuarioOut = usersPOP.checkUserExist(usuarioIn);
        usersPOP.insertUser(usuarioOut);
    }

    public String comprobarUsuario(Gson gson, PackageInfo packageInfo){
        System.out.println("*******************************************************************");
        System.out.println("COMPROBANDO USUARIO...");
        System.out.println("*******************************************************************");
        User usuarioIn = gson.fromJson(packageInfo.getObjeto(), User.class);
        UsersPOP userPOP = new UsersPOP();
        User usuarioOut = userPOP.checkUserLoginDesktopVet(usuarioIn);
        if(usuarioOut == null) {
            System.out.println("*******************************************************************");
            System.out.println("COMPROBANDO ADMINISTRADOR...");
            System.out.println("*******************************************************************");
            usuarioOut = userPOP.checkUserLoginDesktopAdmin(usuarioIn);
        }
        if(usuarioOut != null){
            System.out.println("*******************************************************************");
            System.out.println("USUARIO EXISTE Y CONTRASEÑA CORRECTA");
            System.out.println("*******************************************************************");
            System.out.println("*******************************************************************");
            System.out.println("ENVIANDO DATOS DE USUARIO: " + usuarioOut.getUsername());
            System.out.println("*******************************************************************");
        } else{
            System.out.println("*******************************************************************");
            System.out.println("USUARIO NO EXISTE O CONTRASEÑA INCORRECTA");
            System.out.println("*******************************************************************");
        }
        try{
            packageInfo.setObjeto(gson.toJson(usuarioOut));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gson.toJson(packageInfo);
    }
}
