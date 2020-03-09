package com.adm.crmTeam1.modules;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class SalesOrder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesOrder frame = new SalesOrder();
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
	public SalesOrder() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSalesOrder = new JLabel("CREATE SALES ORDER");
		lblSalesOrder.setBounds(10, 0, 306, 34);
		lblSalesOrder.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblSalesOrder);
		
		JLabel lblSalesorderNo = new JLabel("Sales Order No.");
		lblSalesorderNo.setBounds(30, 100, 129, 18);
		lblSalesorderNo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblSalesorderNo);
		
		textField = new JTextField();
		textField.setBounds(225, 96, 250, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(30, 150, 129, 18);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 300, 250, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCustName = new JLabel("Customer Name");
		lblCustName.setBounds(30, 200, 129, 18);
		lblCustName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblCustName);
		
		JLabel lblQuoteNo = new JLabel("Quote No.");
		lblQuoteNo.setBounds(30, 250, 129, 18);
		lblQuoteNo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblQuoteNo);
		
		JLabel lblEmail = new JLabel("Email ID");
		lblEmail.setBounds(30, 300, 129, 18);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblEmail);
		
		JLabel lblMobil = new JLabel("Mobil Number");
		lblMobil.setBounds(30, 350, 129, 18);
		lblMobil.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblMobil);
		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 150, 250, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(225, 198, 250, 30);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(225, 350, 250, 30);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(225, 250, 250, 30);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 50, 122, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Campaign");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBounds(130, 50, 122, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnLeads = new JButton("Leads");
		btnLeads.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLeads.setBounds(250, 50, 122, 25);
		contentPane.add(btnLeads);
		
		JButton btnQuotes = new JButton("Quotes");
		btnQuotes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnQuotes.setBounds(370, 50, 122, 25);
		contentPane.add(btnQuotes);
		
		JButton btnSalesorer = new JButton("Sales Order");
		btnSalesorer.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSalesorer.setBounds(490, 50, 122, 25);
		contentPane.add(btnSalesorer);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnInvoice.setBounds(610, 50, 122, 25);
		contentPane.add(btnInvoice);
		
		JButton btnProucts = new JButton("Proucts");
		btnProucts.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnProucts.setBounds(730, 50, 122, 25);
		contentPane.add(btnProucts);
		
		JButton btnPurchaseorder = new JButton("Logout");
		btnPurchaseorder.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnPurchaseorder.setBounds(873, 50, 75, 25);
		contentPane.add(btnPurchaseorder);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 400, 850, 80);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSave.setBounds(150, 600, 122, 23);
		contentPane.add(btnSave);
		
		JButton btnGenerateInvoice = new JButton("Generate Invoice");
		btnGenerateInvoice.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnGenerateInvoice.setBounds(300, 600, 213, 23);
		contentPane.add(btnGenerateInvoice);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancel.setBounds(550, 600, 122, 23);
		contentPane.add(btnCancel);
		
		textField_6 = new JTextField();
		textField_6.setBounds(772, 489, 108, 23);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(772, 525, 108, 23);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(773, 559, 108, 23);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSubTotal.setBounds(666, 493, 108, 19);
		contentPane.add(lblSubTotal);
		
		JLabel lblGst = new JLabel("GST");
		lblGst.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGst.setBounds(666, 529, 96, 19);
		contentPane.add(lblGst);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTotal.setBounds(666, 563, 97, 18);
		contentPane.add(lblTotal);
		
		JButton btnNewButton_2 = new JButton("SUBMIT");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_2.setBounds(483, 254, 89, 23);
		contentPane.add(btnNewButton_2);
		
		table_1 = new JTable();
		table_1.setEnabled(false);
		table_1.setBounds(30, 525, 1, 1);
		contentPane.add(table_1);
	}
}
