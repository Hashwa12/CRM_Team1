package com.adm.crmTeam1.modules;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class CreateQuotes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateQuotes frame = new CreateQuotes();
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
	public CreateQuotes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1134, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(10, 49, 112, 25);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		btnHome.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnHome);
		
		
		
		JButton btnCampaingn = new JButton("Campaign");
		btnCampaingn.setBounds(122, 49, 130, 25);
		btnCampaingn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCampaingn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnCampaingn);
		
		JButton btnNewButton_1 = new JButton("Leads");
		btnNewButton_1.setBounds(251, 49, 112, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent  e) {
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(btnNewButton_1);
		
		JButton btnQuotes = new JButton("Quotes");
		btnQuotes.setBounds(362, 49, 112, 25);
		btnQuotes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnQuotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent  e) {
			}
		});
		contentPane.add(btnQuotes);
		
		JButton btnNewButton_2 = new  JButton("Sales Order");
		btnNewButton_2.setBounds(473, 49, 130, 25);
		btnNewButton_2.setFont(new Font("Constantia", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Invoice");
		btnNewButton_3.setBounds(602, 49, 101, 25);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnProduct = new JButton("Products");
		btnProduct.setBounds(703, 49, 112, 25);
		btnProduct.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnProduct);
		
		JButton btnPurchaseOrder = new JButton("LOGOUT");
		btnPurchaseOrder.setBounds(921, 46, 130, 28);
		btnPurchaseOrder.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnPurchaseOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnPurchaseOrder);
		
		JLabel lblCreateQuotes = new JLabel("CREATE QUOTES");
		lblCreateQuotes.setBounds(10, 123, 192, 35);
		lblCreateQuotes.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblCreateQuotes);
		
		JLabel lblNewLabel = new JLabel("Quote No");
		lblNewLabel.setBounds(809, 274, 75, 35);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(921, 283, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Quote Date");
		lblNewLabel_1.setBounds(809, 327, 75, 35);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(921, 335, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Quote Name");
		lblNewLabel_2.setBounds(101, 194, 101, 25);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 195, 248, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Lead Name");
		lblNewLabel_3.setBounds(101, 242, 122, 25);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(236, 370, 245, 23);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Email ID");
		lblNewLabel_4.setBounds(101, 283, 75, 25);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(236, 281, 248, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setBounds(101, 332, 101, 25);
		lblMobileNo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblMobileNo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(236, 327, 248, 25);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Product");
		lblNewLabel_5.setBounds(101, 368, 75, 25);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(236, 243, 248, 25);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_6 = new  JLabel("Unit Price");
		lblNewLabel_6.setBounds(101, 418, 101, 25);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Quantity");
		lblNewLabel_7.setBounds(101, 466, 101, 25);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Quote Valid Till");
		lblNewLabel_8.setBounds(101, 517, 122, 20);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(236, 419, 245, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(236, 468, 245, 23);
		contentPane.add(comboBox_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(236, 516, 248, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		Button button = new Button("Save");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(132, 602, 70, 35);
		contentPane.add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_1.setBounds(251, 602, 70, 35);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Reset");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_2.setBounds(362, 602, 70, 35);
		contentPane.add(button_2);
		
		Button button_3 = new Button("Generate Sales order");
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_3.setForeground(new Color(0, 0, 0));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(473, 602, 170, 35);
		contentPane.add(button_3);

	}

}
