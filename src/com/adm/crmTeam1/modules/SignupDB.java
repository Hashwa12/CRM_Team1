package com.adm.crmTeam1.modules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDB {
	
	public static int AdminSignUp(String username, String password, String email, String mobile, String role) throws Exception 
	{
		int status=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team1","root","Mysql@1234");
		PreparedStatement ps= con.prepareStatement("insert into signup_admin(UserName,Password,Email,Mobile,role) values(?,?,?,?,?)");
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setString(4, mobile);
		ps.setString(5, role);
		
		status =ps.executeUpdate();
		
		return status;
	}
 
	public static int UserSignUp(String username, String password, String email, String mobile, String role) throws Exception 
	{
		int status=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team1","root","Mysql@1234");
		PreparedStatement ps= con.prepareStatement("insert into signup_user(username,password,email,mobile,role) values(?,?,?,?,?)");
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setString(4, mobile);
		ps.setString(5, role);
		
		status =ps.executeUpdate();
		
		return status;
	}
	
	public static boolean AdminvalidateUsername(String username) throws Exception 
	{
		boolean user=false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team1","root","Mysql@1234");
		PreparedStatement ps= con.prepareStatement("select * from signup_admin where username=?");
		ps.setString(1, username);
		ResultSet rs=ps.executeQuery();
		user=rs.next();
		return user;
	}
	public static boolean AdminvalidatePassword(String password) throws Exception 
	{
		boolean pass=false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team1","root","Mysql@1234");
		PreparedStatement ps= con.prepareStatement("select * from signup_admin where password=?");
		ps.setString(1, password);
		ResultSet rs=ps.executeQuery();
		pass=rs.next();
		return pass;
	}
	
	public static boolean UservalidateUsername(String username) throws Exception 
	{
		boolean user=false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team1","root","Mysql@1234");
		PreparedStatement ps= con.prepareStatement("select * from signup_user where username=?");
		ps.setString(1, username);
		ResultSet rs=ps.executeQuery();
		user=rs.next();
		return user;
	}
	public static boolean UservalidatePassword(String password) throws Exception 
	{
		boolean pass=false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team1","root","Mysql@1234");
		PreparedStatement ps= con.prepareStatement("select * from signup_user where password=?");
		ps.setString(1, password);
		ResultSet rs=ps.executeQuery();
		pass=rs.next();
		return pass;
	}
}

