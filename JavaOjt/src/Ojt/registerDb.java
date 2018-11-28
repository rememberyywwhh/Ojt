package Ojt;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.omg.CORBA.PUBLIC_MEMBER;

public class registerDb {
	private static final Component JFrame = null;
	private Connection con;
	private String Gender;
	private PreparedStatement ps = null;
	private ResultSet rs;
	private boolean counter = true;
	private int index = 0;
	private int regexcounter=0;
	private boolean update=false;
	private boolean register=false;
	private boolean passconfig=false;
	ArrayList<String> data = new ArrayList<String>();
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
		String regex[] = new String[] { "[a-zA-Z ]*","[0-9]*[/]+[a-zA-Z]*[(]+[A-Z]+[)]+[0-9]*","[0-9]*[/]+[0-9]*[/]+[0-9]*","[a-zA-Z0-9/. ]*","[a-zA-Z0-9]+[@]+[gmail.co]+[m]+","[a-zA-Z0-9@#$%^&+= ]*","[a-zA-Z0-9@#$%^&+= ]*"};
	
		//System.out.println(name+nrc+birthday+address+gmail+pass+conpass);
		data.add(name);
		data.add(nrc);
		data.add(birthday);
		data.add(address);
		data.add(gmail);
		data.add(pass);
		data.add(conpass);
		while (counter) {
			if (data.get(index).equals("")) {
				JOptionPane.showMessageDialog(JFrame, array[index] + "Should not be empty");
				counter = false;
				index=0;
				regexcounter=0;
			} else {
				Pattern pattern = Pattern.compile( regex[regexcounter]);
				Matcher matcher = pattern.matcher(data.get(index));
				if (!matcher.matches()) {
					JOptionPane.showMessageDialog(JFrame, array[index] + "Should be format");
					counter = false;
					index=0;
					regexcounter=0;
				}
			}
			if (index == 6) {
				update=true;
				counter = false;
				index=0;
				regexcounter=0;
			}
			index++;
			regexcounter++;
			
		}
		
		
	}
	public boolean updateable() {
		return update;
	}
	public boolean register() {
		try {
			String query = "INSERT INTO `member` (`mId`, `mName`, `mNRC`, `mGender`, `mbirthday`, `mAddress`, `mEmail`, `mPass`, `amount`) VALUES (NULL, ?, ?,?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(query);
			ps.setString(1, data.get(0));
			ps.setString(2, data.get(1));
			ps.setString(3, Gender);
			ps.setString(4, data.get(2));
			ps.setString(5, data.get(3));
			ps.setString(6, data.get(4));
			ps.setString(7, data.get(5));
			ps.setString(8, "1000");
			ps.executeUpdate();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(JFrame, ""+e);
		}
		register=true;
		return register;
	}
	public boolean passconfig() {
		if (data.get(5).equals(data.get(6))) {
			passconfig=true;
		}
		else {
			JOptionPane.showMessageDialog(JFrame, "Config pass r not same");
		}
		return passconfig;
		
	}
	public void setGender(String Gender) {
		this.Gender=Gender;
	}

	public boolean getRegister() {
		
		return register;
	}

}







