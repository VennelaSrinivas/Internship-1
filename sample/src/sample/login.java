package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField P1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 434, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel.setBounds(145, 40, 77, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel tb1 = new JLabel("USERNAME");
		tb1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tb1.setBounds(78, 98, 72, 14);
		frame.getContentPane().add(tb1);
		
		JLabel p1 = new JLabel("PASSWORD");
		p1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		p1.setBounds(78, 159, 72, 14);
		frame.getContentPane().add(p1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 95, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		P1 = new JPasswordField();
		P1.setBounds(176, 156, 89, 20);
		frame.getContentPane().add(P1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String password=P1.getText();
				//JOptionPane.showMessageDialog(btnNewButton,"hello "+user+"\n password is "+Password);
				if(user.equals("raju") && password.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "valid user");
					
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton,  "invalid user");
				}
				
			}
		});
		btnNewButton.setBounds(124, 201, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
