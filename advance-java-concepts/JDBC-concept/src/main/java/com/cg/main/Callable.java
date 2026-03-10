package com.cg.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Callable {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java_project",
                    "root",
                    "12345@Deep");

            CallableStatement cs = con.prepareCall("{call del_employee(?)}");

            cs.setString(1, "Ram422");

            int rows = cs.executeUpdate();

            if (rows > 0) {
                System.out.println("Customer deleted from Database..");
            } else {
                System.out.println("No record found.");
            }

            cs.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}