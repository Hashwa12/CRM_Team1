package com.adm.crmTeam1.modules;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UserDB 
{
	public static ResultSet rs;

	public static void Campaignowner() throws Exception
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team1","root","Mysql@1234");
		PreparedStatement ps= con.prepareStatement("select * from campaignowner");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			CreateCampaign.comboBox.addItem(rs.getString(1));
		}
		
	}
	
	public static int CreateCampaign(String ownername, String name, String startdate, String enddate, String campaigntype, String stat, String discription) throws Exception 
	{
		int status=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team1","root","Mysql@1234");
		PreparedStatement ps= con.prepareStatement("insert into campaign(campaignowner,campaignname,startdate,enddate,typeofcampaign,status,discription) values(?,?,?,?,?,?,?)");
		ps.setString(1, ownername);
		ps.setString(2, name);
		ps.setString(3, startdate);
		ps.setString(4, enddate);
		ps.setString(5, campaigntype);
		ps.setString(6, stat);
		ps.setString(7, discription);
		status =ps.executeUpdate();
		
		return status;
	}
	
	public static void Campaigntable() throws Exception
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team_4","root","0");
		PreparedStatement ps= con.prepareStatement("select * from campaign");
		rs=ps.executeQuery();
		
	}
}
