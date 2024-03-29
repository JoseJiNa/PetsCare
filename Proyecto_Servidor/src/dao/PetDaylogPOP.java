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

import vo.Multiple.PetDaylogs;
import vo.Single.Pet;
import vo.Single.PetDaylog;


/**
 * @author jjimenez
 */
public class PetDaylogPOP {

    DBConnection dbConnection = new DBConnection();

    public PetDaylogs getPetDaylogForPet(Pet pet) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM `petcare`.`pet_daylogs` WHERE pet_id = ?";
        PetDaylogs logs = new PetDaylogs();
        PetDaylog aux;

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, pet.getPetId());

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux = new PetDaylog(pet.getPetId());
                aux.setLogDate(rs.getDate("log_date"));
                aux.setActivity(rs.getInt("activity"));
                aux.setAppetite(rs.getInt("appetite"));
                aux.setThirst(rs.getInt("thirst"));

                logs.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return logs;
    }

    public boolean insertPetDaylog(PetDaylog log) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO `petcare`.`pet_daylogs` (`pet_id`, `log_date`, `activity`, `appetite`, `thirst`) VALUES (?,?,?,?,?)";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, log.getPetId());
            ps.setDate(2, log.getLogDate());
            ps.setInt(3, log.getActivity());
            ps.setInt(4, log.getAppetite());
            ps.setInt(5, log.getThirst());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deletePetdayLog(PetDaylog log) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "DELETE FROM `petcare`.`pet_daylogs` WHERE pet_id = ? AND log_date = ?";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, log.getPetId());
            ps.setDate(1, log.getLogDate());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
