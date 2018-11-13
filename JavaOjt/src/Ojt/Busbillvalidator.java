package Ojt;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Busbillvalidator {
	JFrame frame = new JFrame("Busbillvalidator");
	JLabel lbltime = new JLabel();
	JComboBox cboid = new JComboBox<>();
	JComboBox cbolocation = new JComboBox<>();
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JLabel show = new JLabel();
	JLabel busNo = new JLabel("7E/2346");
	String cardid = "";
	String amount = "";
	String location="";
	public Busbillvalidator(int width, int height) {
		show.setOpaque(true);
		show.setBackground(Color.BLUE);
		cboid.addItem("1");
		cboid.addItem("2");
		cboid.addItem("3");
		cbolocation.addItem("l1");
		cbolocation.addItem("l2");
		cbolocation.addItem("l3");
		cboid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardid = (String) cboid.getSelectedItem();
				location= (String) cbolocation.getSelectedItem();
				Db db = new Db();
				db.setId(cardid);
				db.getdata();
				db.adddataHistory(busNo.getText(), (String) cbolocation.getSelectedItem(), lbltime.getText());
				amount = db.getamount();
				if (!amount.equals("")) {
					int calculateamount = Integer.parseInt(amount);
					if (calculateamount >= 200) {
						//db.addHistory(lbltime.getText());
						db.addHistory();
						calculateamount=calculateamount-200;
						db.setcalculateamount(calculateamount+"");
						db.updateamount();
						show.setBackground(Color.green);
						show.setText("Success");
					} else {
						show.setBackground(Color.red);
						show.setText("Not enought balance");
					}
				}
			}
		});
		;
		lbltime.setHorizontalAlignment(SwingConstants.CENTER);
		show.setHorizontalAlignment(SwingConstants.CENTER);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setLayout(new GridLayout(0, 2, 10, 10));
		p.setLayout(new BorderLayout());
		p.add(cboid, BorderLayout.NORTH);
		p.add(lbltime, BorderLayout.CENTER);
		p.add(cbolocation, BorderLayout.SOUTH);
		p.add(busNo, BorderLayout.EAST);
		frame.add(p);
		p1.setLayout(new BorderLayout());
		p1.add(show, BorderLayout.CENTER);
		frame.add(p1);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Busbillvalidator bus = new Busbillvalidator(400, 300);
		Runnable runnable = new Runnable() {
			public void run() {
				while (true) {
					Date date = new Date();
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					String s = formatter.format(date);
					bus.lbltime.setText(s);
				
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
