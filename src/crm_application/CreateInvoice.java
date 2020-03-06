package crm_application;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CreateInvoice extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateInvoice frame = new CreateInvoice();
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
	public CreateInvoice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1006, 884);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateInvoice = new JLabel("Create Invoice");
		lblCreateInvoice.setBounds(10, 11, 183, 44);
		lblCreateInvoice.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblCreateInvoice);
		
		Panel panel = new Panel();
		panel.setBounds(8, 456, 921, 206);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Customer Address");
		lblNewLabel_6.setBounds(96, 0, 115, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Shipping Address");
		lblNewLabel_7.setBounds(627, 0, 107, 16);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address Line 1");
		lblNewLabel_8.setBounds(12, 38, 90, 16);
		panel.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(153, 35, 200, 22);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Address Line 2");
		lblNewLabel_9.setBounds(12, 72, 90, 16);
		panel.add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBounds(153, 69, 200, 22);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("State");
		lblNewLabel_10.setBounds(12, 106, 56, 16);
		panel.add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(153, 103, 200, 22);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Pincode");
		lblNewLabel_11.setBounds(12, 135, 56, 16);
		panel.add(lblNewLabel_11);
		
		textField_9 = new JTextField();
		textField_9.setBounds(153, 132, 116, 22);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Address Line 1");
		lblNewLabel_12.setBounds(537, 38, 90, 16);
		panel.add(lblNewLabel_12);
		
		textField_10 = new JTextField();
		textField_10.setBounds(658, 35, 237, 22);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Address Line 2");
		lblNewLabel_13.setBounds(537, 72, 90, 16);
		panel.add(lblNewLabel_13);
		
		textField_11 = new JTextField();
		textField_11.setBounds(658, 69, 237, 22);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("State");
		lblNewLabel_14.setBounds(537, 106, 56, 16);
		panel.add(lblNewLabel_14);
		
		textField_12 = new JTextField();
		textField_12.setBounds(658, 103, 237, 22);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Pincode");
		lblNewLabel_15.setBounds(537, 135, 56, 16);
		panel.add(lblNewLabel_15);
		
		textField_13 = new JTextField();
		textField_13.setBounds(658, 132, 116, 22);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnNewButton_1 = new JButton(">");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a1=textField_6.getText();
				String a2=textField_7.getText();
				String a3=textField_8.getText();
				String a4=textField_9.getText();
				
				
				textField_10.setText(a1);
				textField_11.setText(a2);
				textField_12.setText(a3);
				textField_13.setText(a4);
				
				
			}
		});
		
		btnNewButton_1.setBounds(397, 81, 97, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.setBounds(156, 181, 97, 25);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Print");
		btnNewButton_2.setBounds(324, 181, 97, 25);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.setBounds(493, 181, 97, 25);
		panel.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 84, 919, 144);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sales Order No");
		lblNewLabel.setBounds(0, 16, 127, 16);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(139, 13, 116, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(276, 12, 79, 24);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Invoice No");
		lblNewLabel_4.setBounds(540, 16, 107, 16);
		panel_1.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(659, 13, 116, 22);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Invoice Date");
		lblNewLabel_5.setBounds(540, 45, 107, 16);
		panel_1.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(659, 48, 116, 22);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 47, 116, 22);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Name");
		lblNewLabel_1.setBounds(0, 50, 101, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-Mail");
		lblNewLabel_2.setBounds(0, 85, 85, 16);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 82, 116, 22);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile No");
		lblNewLabel_3.setBounds(0, 114, 85, 16);
		panel_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(139, 117, 116, 22);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 221, 921, 248);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(30, 13, 851, 114);
		panel_2.add(table);
		
		JLabel lblNewLabel_16 = new JLabel("SubTotal");
		lblNewLabel_16.setBounds(637, 140, 56, 16);
		panel_2.add(lblNewLabel_16);
		
		textField_14 = new JTextField();
		textField_14.setBounds(714, 140, 116, 22);
		panel_2.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("GST");
		lblNewLabel_17.setBounds(637, 169, 56, 16);
		panel_2.add(lblNewLabel_17);
		
		textField_15 = new JTextField();
		textField_15.setBounds(714, 166, 116, 22);
		panel_2.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Total");
		lblNewLabel_18.setBounds(637, 198, 56, 16);
		panel_2.add(lblNewLabel_18);
		
		textField_16 = new JTextField();
		textField_16.setBounds(714, 195, 116, 22);
		panel_2.add(textField_16);
		textField_16.setColumns(10);
	}

}
