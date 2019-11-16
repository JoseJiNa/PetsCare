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
import vo.Pet;
import vo.PetVaccine;

/**
 *
 * @author jjimenez
 */
public class PetVaccinePOP {

    DBConnection dbConnection = new DBConnection();

    public ArrayList<PetVaccine> getVaccinesForPet(Pet pet) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM pet_vaccines WHERE pet_id = ?";
        ArrayList<PetVaccine> petVaccines = new ArrayList<>();
        PetVaccine aux;
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, pet.getPetId());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                aux = new PetVaccine();
                aux.setVacDay(rs.getDate("date"));
                aux.setVacId(rs.getInt("vac_id"));
                aux.setPetId(pet.getPetId());

                petVaccines.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return petVaccines;
    }

    public void insertPetVaccine(PetVaccine petVaccine) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO `petcare`.`pet_vaccines` (`pet_id`, `vac_id`, `date`) VALUES (?,?,?)";

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, petVaccine.getPetId());
            ps.setInt(2, petVaccine.getVacId());
            ps.setDate(3, petVaccine.getVacDay());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public void deletePetVaccine(PetVaccine petVaccine){
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "DELETE FROM `petcare`.`pet_vaccines` WHERE pet_id = ? AND vac_id = ? AND date = ? ";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, petVaccine.getPetId());
            ps.setInt(2, petVaccine.getVacId());
            ps.setDate(3, petVaccine.getVacDay());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
