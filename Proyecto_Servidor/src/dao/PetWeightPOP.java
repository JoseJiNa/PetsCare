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

import vo.Single.Pet;
import vo.Single.PetWeight;
import vo.Multiple.PetWeights;

/**
 *
 * @author jjimenez
 */
public class PetWeightPOP {

    DBConnection dbConnection = new DBConnection();

    public PetWeights getPetWeightsForPet(Pet pet) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM `petcare`.`pet_weight` WHERE pet_id = ? ORDER BY weight_date DESC";
        PetWeights weights = new PetWeights();
        PetWeight aux;

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, pet.getPetId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux = new PetWeight();
                aux.setPetId(pet.getPetId());
                aux.setWeightDate(rs.getDate("weight_date"));
                aux.setWeightValue(rs.getDouble("weight_value"));

                weights.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weights;
    }

    public boolean insertPetWeight(PetWeight petWeight) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO `petcare`.`pet_weight` (`pet_id`, `weight_date`, `weight_value`) VALUES (?,?,?)";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, petWeight.getPetId());
            ps.setDate(2, petWeight.getWeightDate());
            ps.setDouble(3, petWeight.getWeightValue());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deletePetWeight(PetWeight petWeight) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "DELETE FROM `petcare`.`pet_weight` WHERE pet_id = ? AND weight_date = ?";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, petWeight.getPetId());
            ps.setDate(1, petWeight.getWeightDate());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
