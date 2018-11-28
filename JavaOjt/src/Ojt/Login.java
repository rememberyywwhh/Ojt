/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ojt;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
	public static String sId="";
	public Login() {
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		btnLogin = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jCheckBox1 = new javax.swing.JCheckBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Login & Register");
		setBackground(new java.awt.Color(255, 102, 51));

		jPanel1.setBackground(new java.awt.Color(248, 148, 6));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Login");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel2.setBackground(new java.awt.Color(44, 62, 80));

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("GMAIL :");

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("PASSWORD:");

		btnLogin.setBackground(new java.awt.Color(34, 167, 240));
		btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btnLogin.setForeground(new java.awt.Color(255, 255, 255));
		btnLogin.setText("Login");
		btnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (!jTextField2.getText().equals("") && !new String(jPasswordField1.getPassword()).equals("")) {

					if (jCheckBox1.isSelected()) {
						StaffLogindb db = new StaffLogindb();
						db.setTfUser(jTextField2.getText());
						db.setPfPass(new String(jPasswordField1.getPassword()));
						db.staffLogin();
						if (true == db.s) {
							sId=db.sId;
						}
					} else {
						
					}
				} else {
					if (jTextField2.getText().equals("") && new String(jPasswordField1.getPassword()).equals("")) {
						JOptionPane.showMessageDialog(null, "Email and Password is empty");
					}

					else if (jTextField2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Email is empty");
					} else if (new String(jPasswordField1.getPassword()).equals("")) {
						JOptionPane.showMessageDialog(null, "Password is empty");
					}

				}
			}
		});

		jButton2.setBackground(new java.awt.Color(255, 0, 0));
		jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("Cancel");

		jTextField2.setBackground(new java.awt.Color(102, 118, 137));
		jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextField2.setForeground(new java.awt.Color(255, 255, 255));

		jPasswordField1.setBackground(new java.awt.Color(102, 118, 137));
		jPasswordField1.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField1ActionPerformed(evt);
			}
		});

		jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
		jCheckBox1.setText("Staff");
		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addGap(22, 22, 22)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel5).addComponent(jLabel6).addComponent(jCheckBox1,
												javax.swing.GroupLayout.PREFERRED_SIZE, 99,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38,
										Short.MAX_VALUE)
								.addGroup(jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 296,
												Short.MAX_VALUE)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(27, 27, 27)
												.addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(43, 43, 43).addComponent(jButton2,
														javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jPasswordField1))
								.addGap(24, 24, 24)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(74, 74, 74)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5))
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(43, 43, 43).addComponent(jLabel6)
										.addGap(41, 41, 41))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel2Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE,
														47, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(31, 31, 31)))
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(76, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
		this.setLocationRelativeTo(null);
	
	}
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	
	public void start() {
		this.setVisible(true);
	}
	
	public static String getsId() {
		return sId;
	}
	

	// Variables declaration - do not modify
	private javax.swing.JButton btnLogin;
	private javax.swing.JButton jButton2;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration
}
