/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import vo.Clinic;
import vo.User;

/**
 *
 * @author jjimenez
 */
public class MockDao {
    DBConnection dbConnection = new DBConnection();

    public MockDao() {
    }

    
    
    public void insertUserMovil(User usuario) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO `petcare`.`users` (`username`, `email`, `password`, `name`, `surname`, `phone`) VALUES (?,?,?,?,?,?,)";

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getMail());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getName());
            ps.setString(5, usuario.getSurname());
            ps.setString(6, usuario.getPhone());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertUserEscritorio(User usuario) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO `petcare`.`users` (`username`, `email`, `password`, `name`, `surname`, `phone`, `clinic_id`, `vetdoc`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getMail());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getName());
            ps.setString(5, usuario.getSurname());
            ps.setString(6, usuario.getPhone());
            ps.setInt(7, usuario.getClincId());
            ps.setInt(8, usuario.getVetDoc());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(User usuario) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "DELETE FROM `petcare`.`users` WHERE username = ?";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuario.getUsername());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User checkUserLogin(User usuario) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM users WHERE username = ?";

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuario.getUsername());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (usuario.getPassword().equals(rs.getString("password"))) {
                    usuario.setUserId(rs.getInt("user_id"));
                    usuario.setName(rs.getString("name"));
                    usuario.setSurname(rs.getString("surname"));
                    usuario.setPhone(rs.getString("phone"));
                    usuario.setMail(rs.getString("email"));
                    usuario.setClincId(rs.getInt("clinic_id"));
                    usuario.setVetDoc(rs.getInt("vetdoc"));
                } else {
                    System.out.println("Usuario nulo enviado por contraseña incorrecta");
                    usuario = null;
                }

            } else{
                System.out.println("Usuario nulo enviado por usuario incorrecto");
                usuario = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;

    }

    public ArrayList<User> getUsersForClinic(Clinic clinic) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM users WHERE clinic_id = ?";
        ArrayList<User> users = new ArrayList<>();
        User aux;
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, clinic.getCliniId());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                aux  = new User();
                aux.setUsername(rs.getString(2));
                aux.setName(rs.getString(5));
                aux.setSurname(rs.getString(6));
                aux.setMail(rs.getString(3));
                aux.setPhone(rs.getString(7));

                users.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    
        public User checkUserExist(User usuario) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM users WHERE username = ?";

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuario.getUsername());

            ResultSet rs = ps.executeQuery();
            
            //si la consulta devuelve algo el usuario no existe y retorna nulo
            if (rs.next()) {
                System.out.println("Usuario nulo enviado por usuario existente");
                usuario = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;

    }
        
        public User checkMailExist(User usuario) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM users WHERE email = ?";

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuario.getMail());

            ResultSet rs = ps.executeQuery();
            
            //si la consulta devuelve algo el mail no existe y retorna nulo
            if (rs.next()) {
                System.out.println("Usuario nulo enviado por mail existente");
                usuario = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;

    }
        
        public ArrayList<Clinic> getClinics() {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM clinic";
        ArrayList<Clinic> clinics = new ArrayList<>();
        Clinic aux;
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                aux  = new Clinic();
                aux.setName(rs.getString("clinic_name"));
                aux.setCliniId(rs.getInt("clinic_id"));
                aux.setPhone(rs.getString("phone"));
                aux.setAdress(rs.getString("address"));

                clinics.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clinics;
    }
    
        
    public Clinic getClinicFromId(int id){
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM clinic WHERE clinic_id = ?";
        Clinic aux = new Clinic();;
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            

            while (rs.next()) {  
                aux.setName(rs.getString("clinic_name"));
                aux.setCliniId(rs.getInt("clinic_id"));
                aux.setPhone(rs.getString("phone"));
                aux.setAdress(rs.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }
}
