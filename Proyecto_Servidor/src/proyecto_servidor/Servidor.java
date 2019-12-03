package proyecto_servidor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sun.corba.se.impl.io.IIOPInputStream;
import connection.DBConnection;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author jjimenez
 */
public class Servidor {

    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket socket;
        ObjectOutputStream oos;
        ObjectInputStream ois;
        DataInputStream dis;
        DataOutputStream dos;
        DBConnection connection = new DBConnection();

        try {
            servidor = new ServerSocket(connection.getPort());

        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            System.out.println("Esperado conexion en servidor");
            try {
                socket = servidor.accept();
                dis = new DataInputStream(socket.getInputStream());
                dos = new DataOutputStream(socket.getOutputStream());
                HiloServidor hilo = new HiloServidor(socket, dos, dis);
                hilo.start();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}
