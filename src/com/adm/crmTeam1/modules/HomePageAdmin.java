package com.adm.crmTeam1.modules;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class HomePageAdmin extends JFrame {

    public static HomePageAdmin frame;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageAdmin frame = new HomePageAdmin();
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
	public HomePageAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1100, 1500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 69, 105, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create Camaign Owner");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CreateCampaignOwner.main(new String[] {});
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(113, 69, 261, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Create Leads Owner");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CreateLeadsOwner.main(new String[] {});
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2.setBounds(373, 69, 231, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add Products");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddProduct.main(new String[] {});
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_3.setBounds(602, 69, 169, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Purchase Order");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				PurchaseOrder.main(new String[] {});
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_4.setBounds(768, 69, 193, 35);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("GST");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CreateGST.main(new String[] {});
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_5.setBounds(959, 69, 115, 35);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("LOGOUT");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SignUp.main(new String[] {});
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_6.setBounds(959, 14, 115, 35);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("View Campaign");
		btnNewButton_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_7.setBounds(56, 174, 139, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("View Leads");
		btnNewButton_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_8.setBounds(375, 174, 105, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("View Quotes");
		btnNewButton_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_9.setBounds(675, 174, 105, 23);
		contentPane.add(btnNewButton_9);
		
		table = new JTable();
		table.setBounds(10, 208, 281, 169);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(301, 208, 281, 169);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(592, 208, 269, 169);
		contentPane.add(table_2);
		
		JButton btnNewButton_10 = new JButton("View Salesorder");
		btnNewButton_10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_10.setBounds(56, 421, 139, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("View Invoice");
		btnNewButton_11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_11.setBounds(354, 421, 126, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("View Products");
		btnNewButton_12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_12.setBounds(651, 421, 139, 23);
		contentPane.add(btnNewButton_12);
		
		table_3 = new JTable();
		table_3.setBounds(10, 464, 281, 169);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(301, 464, 281, 169);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setBounds(592, 464, 269, 169);
		contentPane.add(table_5);
		
		JLabel lblNewLabel = new JLabel("ADMIN HOMEPAGE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(28, 11, 231, 35);
		contentPane.add(lblNewLabel);	}

}
