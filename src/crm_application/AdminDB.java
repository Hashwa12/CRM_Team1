package crm_application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminDB
{

	public static int AddCampaignOwner(String campaignownername) throws Exception
    {
		int status=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team_4","root","0");
		PreparedStatement ps= con.prepareStatement("insert into campaignowner(campaignownername) values(?)");
		ps.setString(1,campaignownername);
		status=ps.executeUpdate();
		return status;
	}
	
	public static int AddLeadOwner(String leadnownername) throws Exception
    {
		int status=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_team_4","root","0");
		PreparedStatement ps= con.prepareStatement("insert into leadnowner(leadownername) values(?)");
		ps.setString(1,leadnownername);
		status=ps.executeUpdate();
		return status;
	}
	
	
}
