/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import vo.Clinic;
import vo.User;

/**
 *
 * @author jjimenez
 */
public class UsersPOP {

    DBConnection dbConnection = new DBConnection();

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
        String query = "INSERT INTO `petcare`.`users` (`username`, `email`, `password`, `name`, `surname`, `phone`, `vetdoc`) VALUES (?,?,?,?,?,?,?)";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getMail());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getName());
            ps.setString(5, usuario.getSurname());
            ps.setString(6, usuario.getPhone());
            ps.setInt(7, usuario.getVetDoc());

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

    public User checkUserLoginEscritorio(User usuario) {
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
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;

    }

    public ArrayList<User> getUsersForClinic(Clinic clinic) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM clinic WHERE clinic_id = ?";
        ArrayList<User> users = new ArrayList<>();
        User aux;
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, clinic.getCliniId());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                aux = new User();
                aux.setUsername(rs.getString("username"));
                aux.setName(rs.getString("name"));
                aux.setSurname(rs.getString("surname"));
                aux.setMail(rs.getString("email"));
                aux.setPhone(rs.getString("phone"));

                users.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

}
