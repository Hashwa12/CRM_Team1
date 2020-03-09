package com.adm.crmTeam1.modules;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import com.toedter.calendar.JDateChooser;

public class CreateCampaign extends JFrame {

	java.util.Date date;
	
    public static CreateCampaign frame;
	private JPanel contentPane;
	private JTextField textField;
	public static JComboBox comboBox;
	private static JDateChooser dateChooser;
	private static JDateChooser dateChooser_1;
	private static JCheckBox chckbxNewCheckBox;
	private static	JCheckBox chckbxSchool;
	private static JCheckBox chckbxShoppingMall;
	private static	JCheckBox chckbxOnline;
	private static	JRadioButton rdbtnActuve;
	private static	JRadioButton rdbtnInactive;
	private static JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCampaign frame = new CreateCampaign();
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
	public CreateCampaign() {
		setBackground(UIManager.getColor("control"));
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 800);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("control"));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setBounds(13, 49, 122, 25);
		btnHome.setBackground(UIManager.getColor("control"));
		btnHome.setForeground(Color.BLACK);
		btnHome.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(btnHome);
		
		JButton btnCampaign = new JButton("Campaign");
		btnCampaign.setBounds(135, 49, 122, 25);
		btnCampaign.setBackground(UIManager.getColor("control"));
		btnCampaign.setForeground(Color.BLACK);
		btnCampaign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCampaign.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(btnCampaign);
		
		JButton btnLeads = new JButton("Leads");
		btnLeads.setBounds(257, 49, 122, 25);
		btnLeads.setBackground(UIManager.getColor("control"));
		btnLeads.setForeground(Color.BLACK);
		btnLeads.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnLeads.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnLeads);
		
		JButton btnQuotes = new JButton("Quotes");
		btnQuotes.setBounds(380, 49, 122, 25);
		btnQuotes.setBackground(UIManager.getColor("control"));
		btnQuotes.setForeground(Color.BLACK);
		btnQuotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuotes.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(btnQuotes);
		
		JButton btnSalesOrder = new JButton("Sales Order");
		btnSalesOrder.setBounds(502, 49, 122, 25);
		btnSalesOrder.setBackground(UIManager.getColor("control"));
		btnSalesOrder.setForeground(Color.BLACK);
		btnSalesOrder.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(btnSalesOrder);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.setBounds(625, 49, 122, 25);
		btnInvoice.setBackground(UIManager.getColor("control"));
		btnInvoice.setForeground(Color.BLACK);
		btnInvoice.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(btnInvoice);
		
		JLabel lblCustomerRelationshipManagemENT = new JLabel("CUSTOMER RELATIONSHIP MANAGEMENT");
		lblCustomerRelationshipManagemENT.setBounds(258, 0, 446, 47);
		lblCustomerRelationshipManagemENT.setBackground(UIManager.getColor("control"));
		lblCustomerRelationshipManagemENT.setForeground(Color.BLACK);
		lblCustomerRelationshipManagemENT.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblCustomerRelationshipManagemENT);
		
		
		
		JLabel lblCreateCampaign = new JLabel("CREATE CAMPAIGN");
		lblCreateCampaign.setBounds(29, 101, 187, 34);
		lblCreateCampaign.setBackground(UIManager.getColor("control"));
		lblCreateCampaign.setForeground(Color.BLACK);
		lblCreateCampaign.setFont(new Font("Constantia", Font.PLAIN, 17));
		contentPane.add(lblCreateCampaign);
		
		JLabel lblCampaignOwner = new JLabel("Campain Owner");
		lblCampaignOwner.setBounds(116, 148, 192, 47);
		lblCampaignOwner.setBackground(UIManager.getColor("control"));
		lblCampaignOwner.setForeground(Color.BLACK);
		lblCampaignOwner.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblCampaignOwner);
		
		comboBox = new JComboBox();
		comboBox.setBounds(416, 160, 300, 25);
		comboBox.setBackground(UIManager.getColor("control"));
		comboBox.setForeground(Color.BLACK);
		comboBox.addItem("");
		try {
			UserDB.Campaignowner();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		contentPane.add(comboBox);
		
		JLabel lblCampaignName = new JLabel("Campaign Name");
		lblCampaignName.setBounds(116, 221, 192, 47);
		lblCampaignName.setBackground(UIManager.getColor("control"));
		lblCampaignName.setForeground(Color.BLACK);
		lblCampaignName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblCampaignName);
		
		textField = new JTextField();
		textField.setBounds(416, 220, 300, 25);
		textField.setBackground(UIManager.getColor("control"));
		textField.setForeground(Color.BLACK);
		contentPane.add(textField);
		textField.setColumns(10);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(308, 280, 100, 22);
		contentPane.add(dateChooser);
		
		 dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(647, 280, 100, 22);
		contentPane.add(dateChooser_1);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(116, 270, 192, 47);
		lblStartDate.setBackground(UIManager.getColor("control"));
		lblStartDate.setForeground(Color.BLACK);
		lblStartDate.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setBounds(477, 270, 192, 47);
		lblEndDate.setBackground(UIManager.getColor("control"));
		lblEndDate.setForeground(Color.BLACK);
		lblEndDate.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblEndDate);
		
		JLabel lblTypesOf = new JLabel("TYPES OF CAMPAIGN");
		lblTypesOf.setBounds(116, 325, 192, 47);
		lblTypesOf.setBackground(UIManager.getColor("control"));
		lblTypesOf.setForeground(Color.BLACK);
		lblTypesOf.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblTypesOf);
		
		 chckbxOnline = new JCheckBox("ONLINE");
		chckbxOnline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxOnline.isSelected()) 
				{
					chckbxNewCheckBox.setSelected(false);
					chckbxSchool.setSelected(false);
					chckbxShoppingMall.setSelected(false);
				}
			}
		});
		chckbxOnline.setBounds(209, 381, 113, 36);
		chckbxOnline.setBackground(UIManager.getColor("control"));
		chckbxOnline.setForeground(Color.BLACK);
		contentPane.add(chckbxOnline);
		
		 chckbxNewCheckBox = new JCheckBox("COLLEGE");
		 chckbxNewCheckBox.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(chckbxNewCheckBox.isSelected()) 
				{
		 			chckbxOnline.setSelected(false);
					chckbxSchool.setSelected(false);
					chckbxShoppingMall.setSelected(false);
				}
		 		
		 	}
		 });
		chckbxNewCheckBox.setBounds(345, 381, 113, 36);
		chckbxNewCheckBox.setBackground(UIManager.getColor("control"));
		chckbxNewCheckBox.setForeground(Color.BLACK);
		contentPane.add(chckbxNewCheckBox);
		
		 chckbxSchool = new JCheckBox("SCHOOL");
		 chckbxSchool.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(chckbxSchool.isSelected()) 
				{
		 			chckbxOnline.setSelected(false);
		 			chckbxNewCheckBox.setSelected(false);
					chckbxShoppingMall.setSelected(false);
				}	
		 		
		 	}
		 });
		chckbxSchool.setBounds(467, 381, 113, 36);
		chckbxSchool.setBackground(UIManager.getColor("control"));
		chckbxSchool.setForeground(Color.BLACK);
		contentPane.add(chckbxSchool);
		
		 chckbxShoppingMall = new JCheckBox("SHOPPING MALL");
		 chckbxShoppingMall.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(chckbxShoppingMall.isSelected()) 
				{
		 			chckbxOnline.setSelected(false);
		 			chckbxNewCheckBox.setSelected(false);
		 			chckbxSchool.setSelected(false);
				}	
		 		
		 		
		 	}
		 });
		chckbxShoppingMall.setBounds(611, 381, 177, 36);
		chckbxShoppingMall.setBackground(UIManager.getColor("control"));
		chckbxShoppingMall.setForeground(Color.BLACK);
		contentPane.add(chckbxShoppingMall);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setBounds(116, 414, 192, 47);
		lblStatus.setBackground(UIManager.getColor("control"));
		lblStatus.setForeground(Color.BLACK);
		lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblStatus);
		
		 rdbtnActuve = new JRadioButton("ACTIVE");
		rdbtnActuve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnActuve.isSelected()) 
				{
					rdbtnInactive.setSelected(false);	
				}
				
			}
		});
		rdbtnActuve.setBounds(209, 466, 101, 25);
		rdbtnActuve.setBackground(UIManager.getColor("control"));
		rdbtnActuve.setForeground(Color.BLACK);
		contentPane.add(rdbtnActuve);
		
		 rdbtnInactive = new JRadioButton("INACTIVE");
		 rdbtnInactive.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		if(rdbtnInactive.isSelected()) 
				{
		 			rdbtnActuve.setSelected(false);	
				}
		 		
		 		
		 	}
		 });
		rdbtnInactive.setBounds(327, 466, 131, 25);
		rdbtnInactive.setBackground(UIManager.getColor("control"));
		rdbtnInactive.setForeground(Color.BLACK);
		contentPane.add(rdbtnInactive);
		
		JLabel lblDescription = new JLabel("DESCRIPTION");
		lblDescription.setBounds(116, 493, 192, 47);
		lblDescription.setBackground(UIManager.getColor("control"));
		lblDescription.setForeground(Color.BLACK);
		lblDescription.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblDescription);
		
		textPane = new JTextPane();
		textPane.setBounds(209, 535, 578, 36);
		textPane.setBackground(UIManager.getColor("Tree.textBackground"));
		textPane.setForeground(Color.BLACK);
		contentPane.add(textPane);
		
		Button button = new Button("Save");
		button.setBounds(229, 599, 79, 24);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String campaignownername=comboBox.getSelectedItem().toString();
	        String campaignname=textField.getText();		
			String startdate=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
			String enddate=((JTextField)dateChooser_1.getDateEditor().getUiComponent()).getText();
			String discription =textPane.getText();
			String campaigntype=null;
			 if(chckbxOnline.isSelected())
			 {
				 campaigntype="ONLINE";
			 }
			 else if(chckbxNewCheckBox.isSelected())
			 {
				 campaigntype="COLLEGE";
			 }
			 else if(chckbxSchool.isSelected())
			 {
				 campaigntype="SCHOOL";
			 }
			 else if(chckbxShoppingMall.isSelected())
			 {
				 campaigntype="SHOPPING MALL";
			 }
			 String status=null;
			 if(rdbtnActuve.isSelected()) 
			 {
				 status="ACTIVE";
			 }
			 else if(rdbtnInactive.isSelected()) 
			 {
				 status="INACTIVE";
			 }
			 
			 int validate;
			      try {
			    	  validate=	UserDB.CreateCampaign(campaignownername,campaignname , startdate, enddate, campaigntype,status,discription);  
			    	  if(validate>0)
			    	  {
			    		  JOptionPane.showMessageDialog(null, "new Campaign has been created");
			    		  frame.dispose();
			    		  HomePageUser.main(new String[] {});
			    	  }
			    	  else {
			    		  JOptionPane.showMessageDialog(null, "Campaign is not created");
			    	  }
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 
			}
		});
		button.setBackground(UIManager.getColor("activeCaption"));
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button.setActionCommand("SAVE");
		contentPane.add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.setBounds(390, 599, 79, 24);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBackground(UIManager.getColor("activeCaption"));
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(button_1);
		
		Button button_2 = new Button("Reset");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(559, 599, 79, 24);
		button_2.setBackground(UIManager.getColor("activeCaption"));
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		contentPane.add(button_2);
		
		JButton btnLogOut = new JButton("LOGOUT");
		btnLogOut.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnLogOut.setBounds(781, 50, 122, 25);
		contentPane.add(btnLogOut);
		
	}

}
