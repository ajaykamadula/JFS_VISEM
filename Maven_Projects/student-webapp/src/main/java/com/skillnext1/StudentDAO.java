package com.skillnext1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/skillnext_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; // change if needed

    public void addStudent(Student student) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql = "INSERT INTO students (name, sem, dept) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getSem());
            ps.setString(3, student.getDept());

            ps.executeUpdate();

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
