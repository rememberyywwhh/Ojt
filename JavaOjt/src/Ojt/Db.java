package Ojt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;

public class Db {
	private Connection con;
	private Statement st;
	private PreparedStatement ps = null;
	private ResultSet rs;
	private String id;
	private String amount = "";
	private String calculateamount = "";
	private String busNo = "";
	private String bLocation = "";
	private String btime = "";

	public Db() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busdb", "root", "");
			st = con.createStatement();
		} catch (Exception ex) {
			System.out.println("Error" + ex);
		}
	}

	public void getdata() {
		try {
			String query = "select amount from member where mid= ?";
			ps = con.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				amount = rs.getString("amount");
			}
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}

	public String getamount() {
		return this.amount;
	}

	public void updateamount() {
		try {
			String query = "UPDATE member set amount= ? WHERE mid= ? ";
			ps = con.prepareStatement(query);
			ps.setString(1, calculateamount);
			ps.setString(2, id);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}

	public void adddataHistory(String busNo, String bLocation, String btime) {
		this.busNo = busNo;
		this.bLocation = bLocation;
		this.btime = btime;

	}

	public void addHistory() {
		try {
			//INSERT INTO orders (order_item, order_date, order_delivery) 
			//VALUES ('iPhone 8Gb', NOW(), DATE_ADD(NOW(), INTERVAL 14 DAY));
			String query = "INSERT INTO bushistory (bhid, busNo, mId, bLocation, btime) VALUES (NULL,?, ?, ?, NOW())";
			ps = con.prepareStatement(query);
			ps.setString(1, busNo);
			ps.setString(2, id);
			ps.setString(3, bLocation);
			//ps.setString(4, btime);
			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setcalculateamount(String calculateamount) {
		this.calculateamount = calculateamount;

	}
}
