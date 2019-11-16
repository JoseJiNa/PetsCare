/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import vo.Clinic;
import vo.User;

/**
 *
 * @author jjimenez
 */
public class ClinicPOP {
    
    DBConnection dbConnection = new DBConnection();
    
    public void insertClinica(Clinic clinica){
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO `petcare`.`clinic` (`clinic_name`, `phone`, `address`) VALUES (?,?,?)";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, clinica.getName());
            ps.setString(2, clinica.getPhone());
            ps.setString(3, clinica.getAdress());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteClinic(Clinic clinica){
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "DELETE FROM `petcare`.`clinic` WHERE clinic_id = ?";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, clinica.getCliniId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
