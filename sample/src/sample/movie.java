package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movie {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
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
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE APP");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel.setBounds(162, 31, 109, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(66, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("movie");
		lblNewLabel_2.setBounds(66, 139, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("tickets");
		lblNewLabel_3.setBounds(66, 190, 60, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(185, 77, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"RRR", "HANUMAN", "SALAAR"}));
		cb1.setBounds(185, 135, 86, 22);
		frame.getContentPane().add(cb1);
		
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		cb2.setBounds(185, 186, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String ticket=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(ticket);
				int bill=0;
				if(movie.equals("RRR")) {
					bill=nt*150;
				}
				if(movie.equals("HANUMAN-1")) {
					bill=nt*200;
				}
				if(movie.equals("SALAAR")) {
					bill=nt*150;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "name" +user+"\n movies" +movie+"\n tickets" +ticket+"\n bill" +bill);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton,"BOOKING CONFIRMED");
					tb1.setText("");
					cb1.setSelectedItem("");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton,"BOOKING CANCELLED");
				}

				}
		});
		btnNewButton.setBounds(130, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
