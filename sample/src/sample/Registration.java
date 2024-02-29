package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel.setBounds(176, 28, 133, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setBounds(92, 71, 59, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(187, 68, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(92, 101, 52, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(187, 99, 86, 17);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("branch");
		lblNewLabel_3.setBounds(98, 138, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "IT", "CSM", "CSD", "CIVIL", "ECE", "EEE"}));
		cb1.setBounds(186, 134, 87, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("gender");
		lblNewLabel_4.setBounds(98, 179, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rb1 = new JRadioButton("MALE\r\n");
		rb1.setBounds(165, 175, 109, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("FEMALE");
		rb2.setBounds(306, 175, 109, 23);
		frame.getContentPane().add(rb2);
		ButtonGroup rgb=new ButtonGroup();
		rgb.add(rb1);
		rgb.add(rb2);
		
		JLabel lblNewLabel_5 = new JLabel("city");
		lblNewLabel_5.setBounds(92, 204, 46, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"HYDERABAD", "KARIMNAGAR", "WARANGAL", "SURYAPET", "NALGONDA"}));
		cb2.setBounds(176, 205, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String branch=(String) cb1.getSelectedItem();
				String city=(String) cb2.getSelectedItem();
				String gender="";
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected()) {
					gender="female";
				}
				JOptionPane.showmessageDialog(btnNewButton,     "name:" +user+ "\nbranch:" +branch+ "\ncity:"+city+ "\n gender :" +gender);
			}
		});
		btnNewButton.setBounds(326, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
