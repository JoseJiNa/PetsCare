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
import vo.PetDaylog;
import vo.User;

/**
 *
 * @author jjimenez
 */
public class PetPOP {

    DBConnection dbConnection = new DBConnection();

    public void insertPet(Pet pet) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO `petcare`.`pets` (`pet_name`, `pet_born_date`, `pet_type`, `owner_id`, `clinic_id`) VALUES (?,?,?,?,?)";

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setString(1, pet.getName());
            ps.setDate(2, pet.getBirthDate());
            ps.setInt(3, pet.getPetType());
            ps.setInt(4, pet.getOwnerId());
            ps.setInt(5, pet.getClincId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletePet(Pet pet) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "DELETE FROM `petcare`.`pets` WHERE pet_id = ? ";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, pet.getPetId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Pet> getPetsForUser(User user) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM `petcare`.`pets` WHERE owner_id = ?";
        ArrayList<Pet> pets = new ArrayList<>();
        Pet aux;

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, user.getUserId());

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux = new Pet(user.getUserId());
                aux.setPetId(rs.getInt("pet_id"));
                aux.setName(rs.getString("pet_name"));
                aux.setBirthDate(rs.getDate("pet_born_date"));
                aux.setPetType(rs.getInt("pet_type"));
                aux.setClincId(rs.getInt("clinic_id"));

                pets.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pets;
    }
}
