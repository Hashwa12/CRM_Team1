package crm_application;

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

import net.proteanit.sql.DbUtils;

public class HomePageUser extends JFrame {

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
					HomePageUser frame = new HomePageUser();
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
	public HomePageUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 0, 1100, 1200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setBounds(0, 33, 122, 25);
		btnHome.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		contentPane.setLayout(null);
		btnHome.setFont(new Font("Constantia", Font.BOLD, 13));
		contentPane.add(btnHome);



		JButton btnCampaingn = new JButton("CAMPAIGN");
		btnCampaingn.setBounds(120, 33, 122, 25);
		btnCampaingn.setFont(new Font("Constantia", Font.BOLD, 13));
		btnCampaingn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		}
		});
		contentPane.add(btnCampaingn);

		JButton btnNewButton_1 = new JButton("LEADS");
		btnNewButton_1.setBounds(239, 33, 125, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 13));
		contentPane.add(btnNewButton_1);

		JButton btnQuotes = new JButton("QUOTES");
		btnQuotes.setBounds(362, 33, 122, 25);
		btnQuotes.setFont(new Font("Constantia", Font.BOLD, 13));
		btnQuotes.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		contentPane.add(btnQuotes);

		JButton btnNewButton_2 = new JButton("SALESORDER");
		btnNewButton_2.setBounds(482, 33, 122, 25);
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("INVOICE");
		btnNewButton_3.setBounds(602, 33, 122, 25);
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			CreateInvoice.main(new String [] {});
		}
		});
		contentPane.add(btnNewButton_3);

		JButton btnProduct = new JButton("PRODUCT");
		btnProduct.setBounds(721, 33, 122, 25);
		btnProduct.setFont(new Font("Constantia", Font.BOLD, 13));
		btnProduct.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		contentPane.add(btnProduct);

		JButton btnLogOut = new JButton("LOGOUT");
		btnLogOut.setBounds(952, 33, 122, 25);
		btnLogOut.setFont(new Font("Constantia", Font.BOLD, 13));
		btnLogOut.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		contentPane.add(btnLogOut);
		table = new JTable();
		try {
			UserDB.Campaigntable();
			table.setModel(DbUtils.resultSetToTableModel(UserDB.rs));
			table.setBounds(10, 133, 269, 172);
			contentPane.add(table);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		table_1 = new JTable();
		table_1.setBounds(289, 133, 253, 172);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(552, 133, 293, 172);
		contentPane.add(table_2);
		
		JButton btnNewButton = new JButton("Products");
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton.setBounds(657, 337, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("View Salesorder");
		btnNewButton_4.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_4.setBounds(90, 337, 122, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("View Invoice");
		btnNewButton_5.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_5.setBounds(351, 337, 111, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("View Campaign");
		btnNewButton_6.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_6.setBounds(90, 88, 122, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("View Leads");
		btnNewButton_7.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_7.setBounds(362, 88, 100, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("View Quotes");
		btnNewButton_8.setFont(new Font("Constantia", Font.BOLD, 11));
		btnNewButton_8.setBounds(657, 88, 100, 23);
		contentPane.add(btnNewButton_8);
		
		table_3 = new JTable();
		table_3.setBounds(10, 379, 269, 172);
		contentPane.add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(289, 379, 253, 172);
		contentPane.add(table_4);
		
		table_5 = new JTable();
		table_5.setBounds(552, 379, 293, 172);
		contentPane.add(table_5);
		
		JLabel lblNewLabel = new JLabel("USER HOMEPAGE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 0, 183, 25);
		contentPane.add(lblNewLabel);
	}

}
