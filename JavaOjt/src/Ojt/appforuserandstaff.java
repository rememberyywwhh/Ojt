package Ojt;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class appforuserandstaff {
	JLabel lblemp = new JLabel();
	JFrame frame = new JFrame("Bus App");
	JLabel lblUser = new JLabel("User name");
	JTextField tfUser = new JTextField();
	JLabel lblpass = new JLabel("Password");
	JPasswordField pfPass = new JPasswordField();
	JButton btnlogin=new JButton("Login");
	
	public appforuserandstaff(int width, int height) {
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblpass.setHorizontalAlignment(SwingConstants.CENTER);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3, 2, 10, 30));
		frame.add(lblUser);
		frame.add(tfUser);
		frame.add(lblpass);
		frame.add(pfPass);
		frame.add(lblemp);
		frame.add(btnlogin);
		frame.setVisible(true);
		
		
		btnlogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Db db=new Db();
				db.setTfUser(tfUser.getText());
				db.setPfPass(new String(pfPass.getPassword()));
				System.out.println(db.getPfPass());
				
			}
		});
	}

	public static void main(String[] args) {
		new appforuserandstaff(400, 250);
	}
}
