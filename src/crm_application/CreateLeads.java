package crm_application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CreateLeads extends JFrame {

	private JPanel contentPane;
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
					CreateLeads frame = new CreateLeads();
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
	public CreateLeads() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1063, 888);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setForeground(SystemColor.controlText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CUSTOMER RELATIONSHIP MANAGEMENT");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 20));
		lblNewLabel.setBounds(300, 25, 428, 26);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		btnNewButton.setBounds(13, 97, 122, 25);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("CAMPAIGN");
		btnNewButton_1.setBounds(135, 97, 122, 25);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("LEADS");
		btnNewButton_2.setBounds(257, 97, 122, 25);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("QUOTES");
		btnNewButton_3.setBounds(378, 97, 122, 25);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("SALES ORDER");
		btnNewButton_4.setBounds(499, 97, 122, 25);
		contentPane.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("INVOICE");
		btnNewButton_5.setBounds(621, 97, 122, 25);
		contentPane.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("PRODUCTS");
		btnNewButton_6.setBounds(742, 97, 122, 25);
		contentPane.add(btnNewButton_6);

		JLabel lblCreateLead = new JLabel("Create Lead");
		lblCreateLead.setFont(new Font("Constantia", Font.BOLD, 14));
		lblCreateLead.setBounds(13, 156, 99, 14);
		contentPane.add(lblCreateLead);

		JLabel lblLeadOwner = new JLabel("Lead Owner");
		lblLeadOwner.setFont(new Font("Constantia", Font.ITALIC, 13));
		lblLeadOwner.setBounds(33, 201, 69, 14);
		contentPane.add(lblLeadOwner);

		JLabel lblLeadName = new JLabel("Lead Name");
		lblLeadName.setFont(new Font("Constantia", Font.ITALIC, 13));
		lblLeadName.setBounds(33, 252, 69, 14);
		contentPane.add(lblLeadName);

		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Constantia", Font.ITALIC, 13));
		lblMobile.setBounds(33, 310, 46, 14);
		contentPane.add(lblMobile);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Constantia", Font.ITALIC, 13));
		lblEmail.setBounds(33, 368, 46, 14);
		contentPane.add(lblEmail);

		JLabel lblLeadSource = new JLabel("Lead Source");
		lblLeadSource.setFont(new Font("Constantia", Font.ITALIC, 13));
		lblLeadSource.setBounds(33, 427, 69, 14);
		contentPane.add(lblLeadSource);

		textField_1 = new JTextField();
		textField_1.setBounds(183, 195, 185, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(183, 246, 185, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(183, 304, 185, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(183, 362, 185, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(183, 421, 185, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JButton btnNewButton_7 = new JButton("");

		btnNewButton_7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		btnNewButton_7.setBounds(361, 195, 31, 26);
		contentPane.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
		});
		btnNewButton_8.setBounds(361, 421, 31, 26);
		contentPane.add(btnNewButton_8);

		JButton btnSave = new JButton("Save");
		btnSave.setBounds(183, 499, 89, 23);
		contentPane.add(btnSave);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(303, 499, 89, 23);
		contentPane.add(btnCancel);

		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(948, 45, 89, 23);
		contentPane.add(btnLogout);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(0, 0, 1047, 86);
		contentPane.add(panel);
	}

}
