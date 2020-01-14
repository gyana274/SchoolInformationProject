package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.nt.model.Student;

@Repository
public class StudentRepository {
	
	Connection con;
	PreparedStatement ps;
	public String add(Student st) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinformation","root","root");    
			ps=con.prepareStatement("insert into studentinformation.student values(?,?,?,?,?,?,?,?,?)");  
			ps.setInt(1, st.getAdno());
			ps.setString(2, st.getFname());
			ps.setString(3, st.getLname());
			ps.setString(4, st.getFathername());
			ps.setString(5, st.getMothername());
			ps.setString(6, st.getClassname());
			ps.setInt(7, st.getRollno());
			ps.setInt(8, st.getSection());
			ps.setString(9, st.getAddress());
			int i=ps.executeUpdate();
			if(i!=0) {
				System.out.println("Student data inserted successfully");
			}
			else {
				System.out.println("Student data is not inserted successfully.");
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
