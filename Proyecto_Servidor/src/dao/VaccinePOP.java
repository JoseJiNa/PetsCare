/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import vo.User;
import vo.Vaccine;

/**
 *
 * @author jjimenez
 */
public class VaccinePOP {

    DBConnection dbConnection = new DBConnection();

    public void insertVaccine(Vaccine vac) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO `petcare`.`vaccines` (`vac_name`, `pet_type`, `renov_period`) VALUES (?,?,?)";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, vac.getName());
            ps.setInt(2, vac.getPetType());
            ps.setInt(3, vac.getRenovPeriod());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Vaccine> getVaccinesForPetType(int petType) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM vaccines WHERE pet_type = ?";
        ArrayList<Vaccine> vaccines = new ArrayList<>();
        Vaccine aux;
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, petType);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                aux = new Vaccine();
                aux.setName(rs.getString("vac_name"));
                aux.setPetType(rs.getInt("pet_type"));
                aux.setRenovPeriod(rs.getInt("renov_period"));

                vaccines.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vaccines;
    }

    public void deleteVaccine(Vaccine vac) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "DELETE FROM `petcare`.`vaccines` WHERE vac_id = ? ";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, vac.getVaccineId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Vaccine getVaccineById(int vaccineId) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM vaccines WHERE vac_id = ?";
        ArrayList<Vaccine> vaccines = new ArrayList<>();
        Vaccine aux = new Vaccine();
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, vaccineId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                aux.setVaccineId(vaccineId);
                aux.setName(rs.getString("vac_name"));
                aux.setPetType(rs.getInt("pet_type"));
                aux.setRenovPeriod(rs.getInt("renov_period"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }
}
