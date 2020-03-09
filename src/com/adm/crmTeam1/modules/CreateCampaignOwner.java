package com.adm.crmTeam1.modules;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CreateCampaignOwner extends JFrame {

    public static CreateCampaignOwner frame;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCampaignOwner frame = new CreateCampaignOwner();
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
	public CreateCampaignOwner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateLeadOwner = new JLabel("CREATE CAMPAIGN OWNER");
		lblCreateLeadOwner.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCreateLeadOwner.setBounds(5, 5, 419, 23);
		contentPane.add(lblCreateLeadOwner);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String campaignownername=textField.getText();
				int status;
			    try {
				    status=AdminDB.AddCampaignOwner(campaignownername);
				    if(status>0)
				    {
				    	JOptionPane.showMessageDialog(null, "CampaignOwner name has been saved");
				    	frame.dispose();
				    	HomePageAdmin.main(new String[] {});
				    }
				    else 
				    {
				    	JOptionPane.showMessageDialog(null, "CampaignOwner name is not saved");
				    	
				    }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			}
		});
		btnSave.setBounds(142, 140, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
		    	HomePageAdmin.main(new String[] {});
			}
		});
		btnCancel.setBounds(268, 140, 89, 23);
		contentPane.add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(142, 74, 215, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblName.setBounds(60, 73, 58, 26);
		contentPane.add(lblName);
	}

}
