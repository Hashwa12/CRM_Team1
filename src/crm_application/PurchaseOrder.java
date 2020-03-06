package crm_application;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PurchaseOrder extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1611094788829007342L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseOrder frame = new PurchaseOrder();
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
	public PurchaseOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 491);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerRelationshipManagement = new JLabel("CUSTOMER RELATIONSHIP MANAGEMENT");
		lblCustomerRelationshipManagement.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCustomerRelationshipManagement.setLabelFor(this);
		lblCustomerRelationshipManagement.setForeground(new Color(0, 0, 0));
		lblCustomerRelationshipManagement.setBounds(248, 11, 277, 20);
		contentPane.add(lblCustomerRelationshipManagement);
		
		JButton btnHome = new JButton("Home");
		btnHome.setForeground(Color.BLACK);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setBounds(10, 53, 80, 25);
		contentPane.add(btnHome);
		
		JButton btnCampaign = new JButton("Campaign");
		btnCampaign.setBounds(88, 53, 80, 25);
		contentPane.add(btnCampaign);
		
		JButton btnLead = new JButton("Lead");
		btnLead.setBounds(164, 53, 80, 25);
		contentPane.add(btnLead);
		
		JButton btnQuotes = new JButton("Quotes");
		btnQuotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnQuotes.setBounds(237, 53, 80, 25);
		contentPane.add(btnQuotes);
		
		JButton btnSaleOrder = new JButton("Sale Order");
		btnSaleOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSaleOrder.setBounds(311, 53, 95, 25);
		contentPane.add(btnSaleOrder);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInvoice.setBounds(403, 53, 80, 25);
		contentPane.add(btnInvoice);
		
		JButton btnProduct = new JButton("Product");
		btnProduct.setBounds(479, 53, 80, 25);
		contentPane.add(btnProduct);
		
		JButton btnPurchesOrder = new JButton("Purches Order");
		btnPurchesOrder.setBounds(553, 53, 127, 25);
		contentPane.add(btnPurchesOrder);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogout.setBounds(682, 53, 80, 25);
		contentPane.add(btnLogout);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(228, 393, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancle = new JButton("Cancle");
		btnCancle.setBounds(394, 393, 89, 23);
		contentPane.add(btnCancle);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setBounds(164, 113, 110, 14);
		contentPane.add(lblCompanyName);
		
		JLabel lblVendorName = new JLabel("Vendor Name");
		lblVendorName.setBounds(164, 155, 110, 14);
		contentPane.add(lblVendorName);
		
		textField = new JTextField();
		textField.setBounds(265, 110, 136, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(265, 152, 136, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Purches Order");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 85, 110, 23);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(144, 256, 1, 1);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(89, 229, 1, 1);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(106, 290, 574, -47);
		contentPane.add(table_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(26, 201, 714, 131);
		contentPane.add(scrollPane);
		
		table_3 = new JTable();
		scrollPane.setViewportView(table_3);
		
		table_4 = new JTable();
		scrollPane.setRowHeaderView(table_4);	}

}
