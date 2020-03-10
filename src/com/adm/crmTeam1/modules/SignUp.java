package com.adm.crmTeam1.modules;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class SignUp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2571667863447923704L;
	public static SignUp frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblWelcomeToCrm = new JLabel("WELCOME TO CRM APPLICATION");
		lblWelcomeToCrm.setForeground(Color.BLACK);
		lblWelcomeToCrm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblWelcomeToCrm.setBounds(285, 28, 332, 26);
		contentPane.add(lblWelcomeToCrm);

		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(377, 95, 75, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Email ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(220, 280, 79, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(220, 200, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(220, 240, 79, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Mobile Number");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(220, 320, 109, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Role");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(220, 360, 46, 14);
		contentPane.add(lblNewLabel_5);

		JLabel usermsg = new JLabel("");
		usermsg.setForeground(Color.blue);
		usermsg.setBounds(349, 163, 176, 14);
		contentPane.add(usermsg);

		JLabel passmsg = new JLabel("");
		passmsg.setForeground(Color.blue);
		passmsg.setBounds(349, 216, 311, 14);
		contentPane.add(passmsg);

		JLabel emailmsg = new JLabel("");
		emailmsg.setForeground(Color.blue);
		emailmsg.setBounds(349, 257, 311, 14);
		contentPane.add(emailmsg);

		JLabel mobilemsg = new JLabel("");
		mobilemsg.setForeground(Color.blue);
		mobilemsg.setBounds(360, 297, 269, 14);
		contentPane.add(mobilemsg);

		JLabel rolemsg = new JLabel("");
		rolemsg.setForeground(Color.blue);
		rolemsg.setBounds(349, 337, 198, 14);
		contentPane.add(rolemsg);

		JLabel adminmsg = new JLabel("");
		adminmsg.setForeground(Color.MAGENTA);
		adminmsg.setFont(new Font("Constantia", Font.BOLD, 15));
		adminmsg.setBounds(137, 494, 230, 14);
		contentPane.add(adminmsg);

		JLabel userlogmsg = new JLabel("");
		userlogmsg.setFont(new Font("Constantia", Font.BOLD, 15));
		userlogmsg.setForeground(Color.MAGENTA);
		userlogmsg.setBounds(500, 494, 253, 14);
		contentPane.add(userlogmsg);

		textField = new JTextField();
		textField.setBorder(new LineBorder(Color.darkGray, 1));
		textField.setBounds(350, 188, 175, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(Color.darkGray, 1));
		textField_1.setBounds(350, 231, 175, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(Color.darkGray, 1));
		textField_2.setBounds(350, 271, 175, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(Color.darkGray, 1));
		textField_3.setBounds(350, 311, 175, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new LineBorder(Color.darkGray, 1));
		comboBox.setBounds(350, 354, 175, 26);
		ArrayList<String> al = new ArrayList<String>();
		al.add("");
		al.add("ADMIN");
		al.add("SALES MANAGER");
		for (String s : al) {
			comboBox.addItem(s);
		}
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textField.getText();
				String password = textField_1.getText();
				String email = textField_2.getText();
				String mobile = textField_3.getText();
				String role = comboBox.getSelectedItem().toString();
				
				  Pattern p = Pattern.compile("\\d"); 
				  Matcher m = p.matcher(mobile);
				  boolean match = m.find();
				 
				int mobilenumber = mobile.length();
				
				System.out.println(username+"\t"+password+"\t"+email+"\t"+mobilenumber+"\t"+role+"\t"+match);

				int passlength = password.length();
				if (username.trim().isEmpty() || username.length() == 0) {
					usermsg.setText("* Please enter  username");
					textField.setBorder(new LineBorder(Color.RED, 1));
				} else {
					usermsg.setText("");
				}
				if ((passlength < 8 || passlength > 14)) {
					passmsg.setText("* password is min 8 and max 14 charaters");
					textField_1.setBorder(new LineBorder(Color.RED, 1));
				} else {
					passmsg.setText("");
				}
				if (email.endsWith("@gmail.com") || (email.endsWith("@yahoo.com"))) {
					emailmsg.setText("");
				} else {
					emailmsg.setText("* MailID should ends with gmail.com or yahoo.com");
					textField_2.setBorder(new LineBorder(Color.RED, 1));
				}
				if ((mobilenumber == 10)&&(match==true) ) {

					mobilemsg.setText("");
				} else {
					mobilemsg.setText("* Please enter valid mobile number");
					textField_3.setBorder(new LineBorder(Color.RED, 1));
				}
				if (role.length() == 0) {
					rolemsg.setText("* please select the role");
					comboBox.setBorder(new LineBorder(Color.RED, 1));
				} else if (role.length() > 0) {
					rolemsg.setText("");
				}

				if ((username.length() > 0) && (passlength > 8 && passlength < 15)
						&& (email.endsWith("@gmail.com") || email.endsWith("@yahoo.com"))
						&& ((mobilenumber == 10) && (match == true)) && (role.length() > 0)) {
					if (role.equals("ADMIN")) {
						int status;
						try {
							status = SignupDB.AdminSignUp(username, password, email, mobile, role);
							System.out.println(status);
							if (status > 0) {
								JOptionPane.showMessageDialog(null, " Admin Data Saved sucessfully");
								adminmsg.setText("Now you can SignIn as Admin");
								textField.setText("");
								textField.setBorder(new LineBorder(Color.darkGray, 1));
								usermsg.setText("");
								textField_1.setText("");
								textField_1.setBorder(new LineBorder(Color.darkGray, 1));
								passmsg.setText("");
								textField_2.setText("");
								textField_2.setBorder(new LineBorder(Color.darkGray, 1));
								emailmsg.setText("");
								textField_3.setText("");
								textField_3.setBorder(new LineBorder(Color.darkGray, 1));
								mobilemsg.setText("");
								comboBox.setSelectedIndex(0);
								comboBox.setBorder(new LineBorder(Color.darkGray, 1));
								rolemsg.setText("");
							}
						} catch (Exception e) {

							e.printStackTrace();
						}
					} else if(!role.equals("ADMIN")){
						int status;
						try {
							status = SignupDB.UserSignUp(username, password, email, mobile, role);
							if (status > 0) {
								JOptionPane.showMessageDialog(null, "User Data Saved sucessfully");
								userlogmsg.setText("Now you can SignIn as SalesManager");
								textField.setText("");
								textField.setBorder(new LineBorder(Color.darkGray, 1));
								usermsg.setText("");
								textField_1.setText("");
								textField_1.setBorder(new LineBorder(Color.darkGray, 1));
								passmsg.setText("");
								textField_2.setText("");
								textField_2.setBorder(new LineBorder(Color.darkGray, 1));
								emailmsg.setText("");
								textField_3.setText("");
								textField_3.setBorder(new LineBorder(Color.darkGray, 1));
								mobilemsg.setText("");
								comboBox.setSelectedIndex(0);
								comboBox.setBorder(new LineBorder(Color.darkGray, 1));
								rolemsg.setText("");
							}
						} catch (Exception e) {

							e.printStackTrace();
						}

					}

				} else {
					JOptionPane.showMessageDialog(null, "not saved");
				}

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(240, 412, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField.setBorder(new LineBorder(Color.darkGray, 1));
				usermsg.setText("");
				textField_1.setText("");
				textField_1.setBorder(new LineBorder(Color.darkGray, 1));
				passmsg.setText("");
				textField_2.setText("");
				textField_2.setBorder(new LineBorder(Color.darkGray, 1));
				emailmsg.setText("");
				textField_3.setText("");
				textField_3.setBorder(new LineBorder(Color.darkGray, 1));
				mobilemsg.setText("");
				comboBox.setSelectedIndex(0);
				comboBox.setBorder(new LineBorder(Color.darkGray, 1));
				rolemsg.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2.setBounds(500, 412, 89, 23);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_6 = new JLabel("Or Existing User");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_6.setBounds(376, 474, 115, 14);
		contentPane.add(lblNewLabel_6);

		JButton btnNewButton_3 = new JButton("Admin Sign In");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminSignIN.main(new String[] {});
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_3.setBounds(266, 519, 145, 23);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("User Sign In");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SignInUser.main(new String[] {});
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_4.setBounds(441, 519, 145, 23);
		contentPane.add(btnNewButton_4);

	}

}
