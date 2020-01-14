package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.nt.model.Faculty;

@Repository
public class FacultyRepository {

	Connection con=null;
	PreparedStatement ps=null;
	public String addData(Faculty f) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","root");    
			ps=con.prepareStatement("insert into studentinformation.faculty values(?,?,?)");  
			System.out.println(f.getFacultyname());
			ps.setInt(1, f.getFacultyid());
			ps.setString(2, f.getFacultyname());
			ps.setString(3, f.getSubjectname());
			int i=ps.executeUpdate();
			if(i!=0) {
				System.out.println("Faculty data inserted successfully");
			}
			else {
				System.out.println("faculty data is not inserted successfully.");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(con!=null)
				con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
			
			
		}
		return null;
	}
}
