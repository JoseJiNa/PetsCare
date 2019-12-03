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
import vo.Pets;
import vo.User;

/**
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

    public Pets getPetsForUser(User user) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM `petcare`.`pets` WHERE owner_id = ?";
        Pets pets = new Pets();
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

    public Pets getPetsForOwner(int ownerId) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM `petcare`.`pets` WHERE owner_id = ?";
        Pets pets = new Pets();
        Pet aux;

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, ownerId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux = new Pet();
                aux.setPetId(rs.getInt("pet_id"));
                aux.setName(rs.getString("pet_name"));
                aux.setBirthDate(rs.getDate("pet_born_date"));
                aux.setPetType(rs.getInt("pet_type"));
                aux.setClincId(rs.getInt("clinic_id"));
                aux.setOwnerId(rs.getInt("owner_id"));

                pets.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pets;
    }

    public Pets getPetsForOwnerBelongsClinic(int ownerId, int clinicId) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT A1.*, A2.clinic_id FROM pets A1, pet_clinic A2 WHERE A1.pet_id = A2.pet_id AND A1.owner_id = ? AND A2.clinic_id = ?;";
        Pets pets = new Pets();
        Pet aux;

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, ownerId);
            ps.setInt(2, clinicId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux = new Pet();
                aux.setPetId(rs.getInt("pet_id"));
                aux.setName(rs.getString("pet_name"));
                aux.setBirthDate(rs.getDate("pet_born_date"));
                aux.setPetType(rs.getInt("pet_type"));
                aux.setClincId(rs.getInt("clinic_id"));
                aux.setOwnerId(rs.getInt("owner_id"));

                pets.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pets;
    }

    public Pets getPetsBelongsClinic(int clinicId) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT A1.*, A2.clinic_id FROM pets A1, pet_clinic A2 WHERE A1.pet_id = A2.pet_id AND A2.clinic_id = ?";
        Pets pets = new Pets();
        Pet aux;

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, clinicId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                aux = new Pet();
                aux.setPetId(rs.getInt("pet_id"));
                aux.setName(rs.getString("pet_name"));
                aux.setBirthDate(rs.getDate("pet_born_date"));
                aux.setPetType(rs.getInt("pet_type"));
                aux.setClincId(rs.getInt("clinic_id"));
                aux.setOwnerId(rs.getInt("owner_id"));
                aux.setPathologies(getPetPathologiesById(aux.getPetId()));
                pets.add(aux);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pets;
    }

    private String getPetPathologiesById(int id){
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT pathologies FROM pet_pathologies WHERE pet_id = ?";
        String pathologies = "";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pathologies = rs.getString("pathologies");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pathologies;
    }

    }


