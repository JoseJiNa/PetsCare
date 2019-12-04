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
import java.sql.SQLException;

import vo.Single.Clinic;
import vo.Single.User;
import vo.Multiple.Users;

/**
 * @author jjimenez
 */
public class UsersPOP {

    DBConnection dbConnection = new DBConnection();

    public boolean insertUserMovil(User usuario) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO `petcare`.`owners` (`username`, `email`, `password`, `name`, `surname`, `phone`) VALUES (?,?,?,?,?,?,)";

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
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insertUser(User usuario) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "";
        switch (usuario.getUserType()) {
            case User.OWNER:
                query = "INSERT INTO `petcare`.`owners` (`username`, `email`, `password`, `name`, `surname`, `phone`) VALUES (?,?,?,?,?,?,?)";
                break;
            case User.VETDOC:
                query = "INSERT INTO `petcare`.`vetdocs` (`username`, `email`, `password`, `name`, `surname`, `phone`) VALUES (?,?,?,?,?,?,?)";
                break;
            case User.ADMIN:
                query = "INSERT INTO `petcare`.`admins` (`username`, `email`, `password`, `name`, `surname`, `phone`) VALUES (?,?,?,?,?,?,?)";
                break;
        }
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
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteUser(User usuario) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "DELETE FROM `petcare`.`users` WHERE username = ?";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuario.getUsername());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public User checkUserLoginMobile(User usuarioIn) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "";
        switch (usuarioIn.getUserType()) {
            case User.OWNER:
                query = "SELECT * FROM `petcare`.`owners` WHERE username = ?";
                break;
            case User.VETDOC:
                query = "SELECT * FROM `petcare`.`vetdocs`  WHERE username = ?";
                break;
            case User.ADMIN:
                query = "SELECT * FROM `petcare`.`admins` WHERE username = ?";
                break;
        }
        User usuarioOut;
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuarioIn.getUsername());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (usuarioIn.getPassword().equals(rs.getString("password"))) {
                    usuarioOut = new User();
                    usuarioOut.setUserId(rs.getInt("user_id"));
                    usuarioOut.setName(rs.getString("name"));
                    usuarioOut.setSurname(rs.getString("surname"));
                    usuarioOut.setPhone(rs.getString("phone"));
                    usuarioOut.setMail(rs.getString("email"));
                    usuarioOut.setClincId(rs.getInt("clinic_id"));
                    return usuarioOut;
                }
            }
        } catch (NullPointerException | SQLException ex) {
            return null;
        }
        return null;
    }

    public User checkUserLoginDesktopVet(User usuarioIn) {
        Connection connection = null;
        PreparedStatement ps = null;
        User usuarioOut;
        try {
            String query = "SELECT * FROM `petcare`.`vetdocs`  WHERE username = ?";
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuarioIn.getUsername());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (usuarioIn.getPassword().equals(rs.getString("password"))) {
                    usuarioOut = new User();
                    usuarioOut.setUserId(rs.getInt("user_id"));
                    usuarioOut.setName(rs.getString("name"));
                    usuarioOut.setSurname(rs.getString("surname"));
                    usuarioOut.setPhone(rs.getString("phone"));
                    usuarioOut.setMail(rs.getString("email"));
                    usuarioOut.setClincId(rs.getInt("clinic_id"));
                    usuarioOut.setUsername(rs.getString("username"));
                    usuarioOut.setUserType(User.VETDOC);
                    return usuarioOut;
                }
            }
        } catch (NullPointerException | SQLException ex) {
            return null;
        }
        return null;
    }
    public User checkUserLoginDesktopAdmin(User usuarioIn) {
        Connection connection = null;
        PreparedStatement ps = null;
        User usuarioOut;
        try {
            String query = "SELECT * FROM `petcare`.`admins`  WHERE username = ?";
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, usuarioIn.getUsername());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (usuarioIn.getPassword().equals(rs.getString("password"))) {
                    usuarioOut = new User();
                    usuarioOut.setUserId(rs.getInt("user_id"));
                    usuarioOut.setName(rs.getString("name"));
                    usuarioOut.setSurname(rs.getString("surname"));
                    usuarioOut.setPhone(rs.getString("phone"));
                    usuarioOut.setMail(rs.getString("email"));
                    usuarioOut.setUsername(rs.getString("username"));
                    usuarioOut.setUserType(User.VETDOC);
                    return usuarioOut;
                }
            }
        } catch (NullPointerException | SQLException ex) {
            return null;
        }
        return null;
    }

    public Users getOwnersForClinic(Clinic clinic) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT DISTINCT A1.* FROM owners A1, pets A2, pet_clinic A3 WHERE A2.pet_id = A3.pet_id AND A2.owner_id = A1.user_id AND A3.clinic_id = ?";
        Users users = new Users();
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
                aux.setUserId(rs.getInt("user_id"));
                aux.setClincId(clinic.getCliniId());
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
                usuario = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;

    }

    public String getOwnerNameById(int id){
        String name = "";
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT name, surname FROM owners WHERE user_id = ?";

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                name = rs.getString("name");
                name += " " + rs.getString("surname");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

}
