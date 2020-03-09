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

public class SignInUser extends JFrame {

    public static SignInUser frame;
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
					SignInUser frame = new SignInUser();
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
	public SignInUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER SIGN IN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(208, 25, 142, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(120, 100, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
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
		textField.setBounds(260, 97, 135, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(260, 152, 135, 26);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String username=textField.getText();
				String password=passwordField.getText().toString(); 
					   boolean username_status;
				       boolean password_status;
					try {
						 username_status=SignupDB.UservalidateUsername(username);
						 
						 password_status=SignupDB.UservalidatePassword(password);
						
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
							HomePageUser.main(new String[] {});
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
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(141, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				SignUp.main(new String[] {});
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(261, 214, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2.setBounds(381, 214, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
