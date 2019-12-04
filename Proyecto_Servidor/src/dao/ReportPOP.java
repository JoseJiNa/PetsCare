package dao;

import connection.DBConnection;
import vo.Single.Report;
import vo.Multiple.Reports;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReportPOP {
    DBConnection dbConnection = new DBConnection();


    public Report getLastReport(int petId) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM pet_report WHERE pet_id = ? ORDER BY date DESC LIMIT 1";
        Report report = null;
        
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1,petId);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                report = new Report();
                report.setPetId(rs.getInt("pet_id"));
                report.setDate(rs.getDate("date"));
                report.setContent(rs.getString("content"));
                report.setSummary(rs.getString("summary"));
                report.setVetId(rs.getInt("vet_id"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return report;
    }

    public Reports getReportsById(int petId) {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "SELECT * FROM pet_report WHERE pet_id = ? ORDER BY date DESC";
        Reports reports = new Reports();
        Report report;
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1,petId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                report = new Report();
                report.setPetId(rs.getInt("pet_id"));
                report.setDate(rs.getDate("date"));
                report.setContent(rs.getString("content"));
                report.setSummary(rs.getString("summary"));
                report.setVetId(rs.getInt("vet_id"));
                reports.add(report);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reports;
    }

    public boolean insertReport(Report reportIn){
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO pet_report (`pet_id`, `date`, `summary`, `content`, `vet_id`) VALUES (?,?,?,?,?)";
        try {
            connection = dbConnection.getConnection();
            ps = connection.prepareStatement(query);

            ps.setInt(1,reportIn.getPetId());
            ps.setDate(2,reportIn.getDate());
            ps.setString(3,reportIn.getSummary());
            ps.setString(4,reportIn.getContent());
            ps.setInt(5,reportIn.getVetId());

            ResultSet rs = ps.executeQuery();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
