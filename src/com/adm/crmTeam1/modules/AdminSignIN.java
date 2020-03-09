package com.adm.crmTeam1.modules;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class AdminSignIN extends JFrame {
    public static AdminSignIN frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSignIN frame = new AdminSignIN();
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
	public AdminSignIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN SIGN IN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(208, 25, 119, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User name");
		lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(120, 100, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Constantia", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(120, 155, 93, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel usermsg = new JLabel("");
		usermsg.setForeground(Color.BLUE);
		usermsg.setBounds(260, 81, 231, 14);
		contentPane.add(usermsg);
		
		JLabel passmsg = new JLabel("");
		passmsg.setForeground(Color.BLUE);
		passmsg.setBounds(260, 134, 231, 14);
		contentPane.add(passmsg);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(Color.darkGray,1 ));
		textField.setBounds(260, 97, 135, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(Color.darkGray,1 ));
		passwordField.setBounds(260, 152, 135, 26);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username=textField.getText();
				String password=passwordField.getText().toString(); 
					   boolean username_status;
				       boolean password_status;
					try {
						 username_status=SignupDB.AdminvalidateUsername(username);
						 
						 password_status=SignupDB.AdminvalidatePassword(password);
						
						 if((username_status==false) && (password_status==false))
							{
								usermsg.setText("* Please enter valid username");
								textField.setBorder(new LineBorder(Color.RED,1 ));
								passmsg.setText("* Please enter valid password");
								passwordField.setBorder(new LineBorder(Color.RED,1 ));
							}
						 else if((username_status==true) && (password_status==true))
						{
							usermsg.setText("");
							textField.setBorder(new LineBorder(Color.darkGray,1 ));
							passmsg.setText("");
							passwordField.setBorder(new LineBorder(Color.darkGray,1 ));
							frame.dispose();
							HomePageAdmin.main(new String[] {});
						}
						else if((username_status==false) && (password_status==true)) 
						{
							usermsg.setText("* Please enter valid username");
							textField.setBorder(new LineBorder(Color.RED,1 ));
							passmsg.setText("");
							passwordField.setBorder(new LineBorder(Color.darkGray,1 ));
						}
						else if((username_status==true) && (password_status==false))
						{
							usermsg.setText("");
							textField.setBorder(new LineBorder(Color.darkGray,1 ));
							passmsg.setText("* Please enter valid password");
							passwordField.setBorder(new LineBorder(Color.RED,1 ));
						}
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
 			
			
		});
		btnNewButton.setFont(new Font("Constantia", Font.PLAIN, 14));
		btnNewButton.setBounds(141, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SignUp.main(new String[] {});
			}
		});
		btnNewButton_1.setFont(new Font("Constantia", Font.PLAIN, 14));
		btnNewButton_1.setBounds(261, 214, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				usermsg.setText("");
				textField.setBorder(new LineBorder(Color.darkGray,1 ));
				passwordField.setText("");
				passmsg.setText("");
				passwordField.setBorder(new LineBorder(Color.darkGray,1 ));
			}
		});
		btnNewButton_2.setFont(new Font("Constantia", Font.PLAIN, 14));
		btnNewButton_2.setBounds(381, 214, 89, 23);
		contentPane.add(btnNewButton_2);
		
	}

}
