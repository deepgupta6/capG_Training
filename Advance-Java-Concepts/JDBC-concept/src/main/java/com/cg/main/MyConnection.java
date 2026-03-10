package com.cg.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MyConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("url", "username", "password");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/department", "root",
					"12345@Deep");
//			System.out.println("Connected....");
//			Statement stat = con.createStatement();
//			ResultSet rs = stat.executeQuery("SELECT* FROM emp");
//			while (rs.next())
//				System.out.println(rs.getString("ename") + "\t" + rs.getString("job"));

//			Scanner sc = new Scanner(System.in);
//			int cid = sc.nextInt();
//			String job = sc.next();
//			PreparedStatement ps = con.prepareStatement("SELECT* FROM EMP WHERE empno=? and job=?");
//			ps.setInt(1,cid);
//			ps.setString(2,job);
//			ResultSet  rs = stat.executeQuery("SELECT* FROM EMP WHERE empno= "+cid);
//			ResultSet  rs = ps.executeQuery();
//			if(rs.next())
//					System.out.println(rs.getString("ename") + "\t" + rs.getString("job"));
//			else 
//				System.out.println("Customer Not Found");

//			Write in database;

//			PreparedStatement ps = con.prepareStatement("insert into dept values(?,?,?)");
//			ps.setString(1, "50");
//			ps.setString(2, "Technical");
//			ps.setString(3, "Noida");
//			int rows = ps.executeUpdate();
//			if (rows > 0) {
//				System.out.println("Customer added in Database..");
//			} else
//				System.out.println("Customer Not Added..");

//         delete the data
//			PreparedStatement ps = con.prepareStatement("Delete From dept Where deptno=?");
//			ps.setString(1, "50");
//			int rows = ps.executeUpdate();
//			if (rows > 0) {
//				System.out.println("Customer deleted from Database..");
//			} else
//				System.out.println("Customer Not Deleted..");

//	         update the data
			PreparedStatement ps = con.prepareStatement("UPDATE dept SET loc = ? WHERE deptno=?");
			ps.setString(1,"Bangalore");
			ps.setString(2,"50");
			int rows = ps.executeUpdate();
			if (rows > 0) {
				System.out.println("Customer Updated Database..");
			} else
				System.out.println("Customer Not Updated..");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
