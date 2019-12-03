/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pepe
 */
public class DBConnection {
    
    /**Parametros de conexion*/
   static String bd = "petcare";
   static String login = "root";
   static String password = "admin";
   static String url = "jdbc:mysql://localhost/"+bd;
   static int port = 4444;
   
   Connection connection = null;
 
   /** Constructor de DbConnection */
   public DBConnection() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.cj.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url + "?serverTimezone=UTC",login,password);
 
         if (connection!=null){
            //System.out.println("Conexión a base de datos "+bd+" OK\n");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
   
   public int getPort(){
       return port;
   }
}

 
