package Ojt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class StaffLogindb {
	private Connection con;
	private PreparedStatement ps = null;
	private ResultSet rs;
	private String tfUser = "";
	private String pfPass="";
	private String Email = "";
	private String Pass="";
	boolean s = false;
	String sId="";
	public StaffLogindb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busdb", "root", "");
			con.createStatement();
		} catch (Exception ex) {
			System.out.println("Error" + ex);
		}
	}

	public void staffLogin() {
		try {
			String query = "select sId,sEmail, sPass from staff where sEmail = ?";
			ps = con.prepareStatement(query);
			ps.setString(1, tfUser);
			rs =ps.executeQuery();
			while (rs.next()) {
				sId = rs.getString("sId");
				Email = rs.getString("sEmail");
				Pass = rs.getString("sPass");
				
			}
			if (Email.equals(tfUser)&& Pass.equals(pfPass)) {
				JOptionPane.showMessageDialog(null, "Login Successful");
				 s = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Login Fail");
				 s=false;
			}
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}

	public void setTfUser(String tfUser) {
		this.tfUser = tfUser;
	}

	public void setPfPass(String pfPass) {
		this.pfPass = pfPass;
	}
	
}
