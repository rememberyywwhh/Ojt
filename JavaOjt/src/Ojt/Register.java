/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ojt;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MITS-User 2
 */
public class Register extends javax.swing.JFrame {
	String gender = "";
	public static boolean regi=false;
	public static boolean t=true;
	/**
	 * Creates new form RegisterForm
	 */
	public Register() {
		boolean register1=false;
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabelClose = new javax.swing.JLabel();
		jLabelMinus = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		tfBirth = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton1.setActionCommand("Male");
		jRadioButton1.setSelected(true);
		jRadioButton2 = new javax.swing.JRadioButton();
		jRadioButton2.setActionCommand("Female");
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		tfName = new javax.swing.JTextField();
		tfGmail = new javax.swing.JTextField();
		tfNRC = new javax.swing.JTextField();
		mPassConfirm = new javax.swing.JPasswordField();
		jPasswordField2 = new javax.swing.JPasswordField();
		btnBack = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(248, 148, 6));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Register");

		ButtonGroup bG = new ButtonGroup();
		bG.add(jRadioButton1);
		bG.add(jRadioButton2);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabelMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabelClose).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabelClose).addComponent(jLabelMinus)).addGap(0, 0, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE).addContainerGap()));

		jPanel2.setBackground(new java.awt.Color(44, 62, 80));

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("NAME");
		// tfName.getDocument().addDocumentListener();

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("NRC :");

		tfBirth.setBackground(new java.awt.Color(102, 118, 137));
		tfBirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		tfBirth.setForeground(new java.awt.Color(255, 255, 255));

		jButton1.setBackground(new java.awt.Color(34, 167, 240));
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("SUBMIT");

		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			
				registerDb db = new registerDb();
				db.isempty(tfName.getText(), tfNRC.getText(), tfBirth.getText(), jTextArea1.getText(), tfGmail.getText(), new String(jPasswordField2.getPassword()), new String(mPassConfirm.getPassword()));
				if (db.updateable()) {
					if (db.passconfig()) {
						gender=bG.getSelection().getActionCommand();
						db.setGender(gender);
						db.register();
						while(t) {
						if(db.getRegister()) {
							JFrame j = null;
							regi=true;
							t=false;
							JOptionPane.showMessageDialog( j,"Register Succefully" );
							dispose();
							
						}
						}
					}
				}

			}
		});

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText("GENDER :");

		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("BIRTHDAY :");

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("ADDREESS :");

		jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
		jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
		jRadioButton1.setText("MALE");

		jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
		jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
		jRadioButton2.setText("FEMALE");

		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(255, 255, 255));
		jLabel10.setText("GMAIL :");

		jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(255, 255, 255));
		jLabel11.setText("PASSWORD :");

		jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setText("CONFIRM");

		jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel13.setForeground(new java.awt.Color(255, 255, 255));
		jLabel13.setText("PASSWORD:");

		tfName.setBackground(new java.awt.Color(102, 118, 137));
		tfName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		tfName.setForeground(new java.awt.Color(255, 255, 255));

		tfGmail.setBackground(new java.awt.Color(102, 118, 137));
		tfGmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		tfGmail.setForeground(new java.awt.Color(255, 255, 255));

		tfNRC.setBackground(new java.awt.Color(102, 118, 137));
		tfNRC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		tfNRC.setForeground(new java.awt.Color(255, 0, 255));

		mPassConfirm.setBackground(new java.awt.Color(102, 118, 137));
		mPassConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		mPassConfirm.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mPassConfirmActionPerformed(evt);
			}
		});

		jPasswordField2.setBackground(new java.awt.Color(102, 118, 137));
		jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField2ActionPerformed(evt);
			}
		});

		btnBack.setBackground(new java.awt.Color(0, 255, 0));
		btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnBack.setForeground(new java.awt.Color(255, 255, 255));
		btnBack.setText("Back");
		btnBack.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
				//Staff sf = new Staff();
				//sf.setVisible(true);
				dispose();
			}
		});

		jTextArea1.setBackground(new java.awt.Color(102, 118, 137));
		jTextArea1.setColumns(20);
		jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(
						jPanel2Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel2Layout.createSequentialGroup().addGap(25, 25, 25).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel6).addComponent(jLabel5)).addGroup(jPanel2Layout.createSequentialGroup().addGap(2, 2, 2).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel7).addComponent(jLabel8).addComponent(jLabel9).addComponent(jLabel10).addComponent(jLabel11).addComponent(jLabel12).addComponent(jLabel13)))).addGap(24, 24, 24)
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING).addComponent(tfNRC, javax.swing.GroupLayout.Alignment.LEADING).addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING).addComponent(tfBirth, javax.swing.GroupLayout.Alignment.LEADING).addComponent(mPassConfirm, javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING).addComponent(tfGmail).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(36, 36, 36).addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup().addGap(17, 17, 17).addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(45, 45, 45).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(0, 32, Short.MAX_VALUE)))
												.addGap(26, 26, 26)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(22, 22, 22).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(tfNRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(22, 22, 22).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(jRadioButton1).addComponent(jRadioButton2))
						.addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(tfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(37, 37, 37).addComponent(jLabel9)).addGroup(jPanel2Layout.createSequentialGroup().addGap(27, 27, 27).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel10).addComponent(tfGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(24, 24, 24).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18).addComponent(jLabel12).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(mPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(48, 48, 48)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 0, 0).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
		
		pack();
		this.setLocationRelativeTo(null);
	
	
	}

	public void start() {
   	  this.setVisible(true);
	}      

	private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {
		System.exit(0);
	}

	private void jLabelMinusMouseClicked(java.awt.event.MouseEvent evt) {
		this.setState(JFrame.ICONIFIED);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void mPassConfirmActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}



	// Variables declaration - do not modify                     
	private javax.swing.JButton jButton1;
	private javax.swing.JButton btnBack;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabelClose;
	private javax.swing.JLabel jLabelMinus;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPasswordField mPassConfirm;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField tfBirth;
	private javax.swing.JTextField tfName;
	private javax.swing.JTextField tfGmail;
	private javax.swing.JTextField tfNRC;
	// End of variables declaration                   
}
