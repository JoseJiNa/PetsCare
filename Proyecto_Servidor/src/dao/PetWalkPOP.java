/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DBConnection;
import vo.Single.PetWalk;
import vo.Multiple.PetWalks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author jjimenez
 */
public class PetWalkPOP {
    DBConnection dbConnection = new DBConnection();
    
    public boolean insertPetWalk(PetWalk walkIn) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO pet_walks (`pet`, `start_time`, `end_time`, `steps`) VALUES (?,?,?,?)";

        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1, walkIn.getPetId());
            ps.setDate(2, walkIn.getStart());
            ps.setDate(3, walkIn.getEnd());
            ps.setString(4, walkIn.getSteps());

            ResultSet rs = ps.executeQuery();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public PetWalks getPetWalksById(int petId) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM pet_walks WHERE pet_id = ? ORDER BY start_time DESC";
        PetWalks petWalks = new PetWalks();
        PetWalk petWalk;
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1,petId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                petWalk = new PetWalk();
                petWalk.setPetId(rs.getInt("pet_id"));
                petWalk.setStart(rs.getDate("start_time"));
                petWalk.setEnd(rs.getDate("end_time"));
                petWalk.setSteps(rs.getString("steps"));
                petWalks.add(petWalk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return petWalks;
    }
}
