package com.adm.crmTeam1.modules;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CreateLeadsOwner extends JFrame {

    public static CreateLeadsOwner frame;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateLeadsOwner frame = new CreateLeadsOwner();
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
	public CreateLeadsOwner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateLeadOwner = new JLabel("CREATE LEADS OWNER");
		lblCreateLeadOwner.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCreateLeadOwner.setBounds(5, 5, 419, 23);
		contentPane.add(lblCreateLeadOwner);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSave.setBounds(142, 140, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancel.setBounds(268, 140, 89, 23);
		contentPane.add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(142, 74, 215, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblName.setBounds(60, 73, 58, 26);
		contentPane.add(lblName);
	}

}
