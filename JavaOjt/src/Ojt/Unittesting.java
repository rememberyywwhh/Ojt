package Ojt;

public class Unittesting {
	static String staffid = "";
	static boolean register = false;
	static boolean regi = false;
	static boolean updateprofile = false;
	static boolean viewhistory = false;
	static boolean viewexit = false;
	public static Login l = new Login();
	public static Staff s = new Staff();
	public static Register r = new Register();
	public static History v=new History();
	private static boolean allcounter = true;
	private static boolean logincounter = true;
	static boolean staffcounter = true;
	private static boolean registercounter = true;
	private static boolean viewhistorycounter = true;
	private static char status = 'L';

	public static void main(String[] args) {
		while (allcounter) {
			switch (status) {
			case 'L':
				l.start();
				while (logincounter) {
					System.out.println(Login.getsId());
					staffid = Login.getsId();
					if (!staffid.equals("")) {
						l.setVisible(false);
						status = 'S';
						logincounter = false;
					}
				}
				break;
			case 'S':
				s.start();
				while (staffcounter) {
					System.out.println(s.register);
					register = s.register;
					viewhistory=s.Viewhistory;
					if (register) {
						s.setVisible(false);
						status = 'R';
						staffcounter = false;
					}
					if (viewhistory) {
						s.setVisible(false);
						status = 'V';
						staffcounter = false;
					}
				}
				break;
			case 'R':
				r.start();
				while (registercounter) {
					System.out.println(Register.regi);
					regi = Register.regi;
					if (regi) {
						r.setVisible(false);
						status = 'S';
						registercounter = false;
						staffcounter = true;
					}
				}
				break;
			case 'V':
				v.start();
				while (viewhistorycounter) {
					System.out.println(History.exit);
					viewexit = History.exit;
					if (regi) {
						v.setVisible(false);
						status = 'S';
						viewhistorycounter = false;
						staffcounter = true;
					}
				}
				break;
			default:
				System.out.println("Invalid grade");
			}
		}

		/*while (logincounter) {
			while (staffcounter) {
				System.out.println(l.sId);
				staffid = l.sId;
				if (!staffid.equals("")) {
					l.dispose();
					u.staffprofile();
					staffcounter = false;
					registercounter = true;
					while (registercounter) {
						System.out.println(s.register);
						register = s.register;
						if (register) {
							s.dispose();
							r.start();
							
							staffcounter = false;
							logincounter = false;
						}
						while (r.regi) {
							System.out.println(s.register);
							register = s.register;
						}
					}
				}
		
			}
		}*/

	}

}
