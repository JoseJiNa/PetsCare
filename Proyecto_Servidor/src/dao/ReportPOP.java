package dao;

import connection.DBConnection;
import vo.Report;
import vo.Reports;

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
}
