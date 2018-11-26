package Ojt;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class registerDb {
	private static final Component JFrame = null;
	private Connection con;
	private PreparedStatement ps = null;
	private ResultSet rs;
	private boolean counter = true;
	private int index = 0;

	public registerDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busdb", "root", "");
			con.createStatement();
		} catch (Exception ex) {
			System.out.println("Error" + ex);
		}
	}

	public void isempty(String name, String nrc, String birthday, String address, String gmail, String pass, String conpass) {
		String array[] = new String[] { "name", "nrc", "birthday", "address", "gmail", "Pass", "Confin pass", };
		ArrayList<String> data = new ArrayList<String>();
		//System.out.println(name+nrc+birthday+address+gmail+pass+conpass);
		data.add(name);
		data.add(nrc);
		data.add(birthday);
		data.add(address);
		data.add(gmail);
		data.add(pass);
		data.add(conpass);
		String regex = "^[a-zA-Z]";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(name);
		System.out.println(matcher.matches());
		while (counter) {
			if (data.get(index).equals("")) {
				JOptionPane.showMessageDialog(JFrame, array[index] + "Should not be empty");
				counter = false;
			} else {
				if (true) {
					JOptionPane.showMessageDialog(JFrame, array[index] + "Should be character");
					counter = false;
				}
			}
			if (index == 7) {
				counter = false;
			}
			index++;
		}

	}

}
