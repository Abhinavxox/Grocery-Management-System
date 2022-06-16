package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.customer;
import service.customerService;
import service.customerServiceImpl;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class customer_register extends JFrame {

	private JPanel contentPane;
	private JLabel lblRegister;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_2_4;
	private JLabel lblNewLabel_2_6;
	private JTextField name_txt;
	private JTextField username_txt;
	private JPasswordField password_txt;
	private JButton btnNewButton_1;
	private JTextField dob_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_register frame = new customer_register();
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
	public customer_register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblRegister());
		contentPane.add(getBtnNewButton());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_3_1());
		contentPane.add(getLblNewLabel_2_4_3());
		contentPane.add(getLblNewLabel_2_6());
		contentPane.add(getName_txt());
		contentPane.add(getUsername_txt());
		contentPane.add(getPassword_txt());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getDob_txt());
	}

	private JLabel getLblRegister() {
		if (lblRegister == null) {
			lblRegister = new JLabel("Register");
			lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
			lblRegister.setForeground(Color.WHITE);
			lblRegister.setFont(new Font("Roboto Medium", Font.PLAIN, 40));
			lblRegister.setBounds(0, -2, 260, 71);
		}
		return lblRegister;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new customer_login().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			btnNewButton.setBackground(Color.LIGHT_GRAY);
			btnNewButton.setBounds(610, 11, 168, 49);
		}
		return btnNewButton;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(10, 80, 768, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Name :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(142, 96, 205, 33);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_3_1() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel("Password :");
			lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_3.setForeground(Color.WHITE);
			lblNewLabel_2_3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_3.setBounds(142, 272, 205, 33);
		}
		return lblNewLabel_2_3;
	}
	private JLabel getLblNewLabel_2_4_3() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel("Username :");
			lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_4.setForeground(Color.WHITE);
			lblNewLabel_2_4.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_4.setBounds(142, 184, 205, 33);
		}
		return lblNewLabel_2_4;
	}
	private JLabel getLblNewLabel_2_6() {
		if (lblNewLabel_2_6 == null) {
			lblNewLabel_2_6 = new JLabel("DOB:");
			lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_6.setForeground(Color.WHITE);
			lblNewLabel_2_6.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_6.setBounds(142, 360, 205, 33);
		}
		return lblNewLabel_2_6;
	}
	private JTextField getName_txt() {
		if (name_txt == null) {
			name_txt = new JTextField();
			name_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			name_txt.setColumns(10);
			name_txt.setBounds(357, 93, 232, 33);
		}
		return name_txt;
	}
	private JTextField getUsername_txt() {
		if (username_txt == null) {
			username_txt = new JTextField();
			username_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			username_txt.setColumns(10);
			username_txt.setBounds(357, 184, 232, 33);
		}
		return username_txt;
	}
	private JPasswordField getPassword_txt() {
		if (password_txt == null) {
			password_txt = new JPasswordField();
			password_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			password_txt.setBounds(357, 272, 232, 33);
		}
		return password_txt;
	}
	

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Register");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//validation
					if(name_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(name_txt, "enter your name");
						return;
						}

					if(username_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(username_txt, "enter your username");
						return;
						}
						
					if(password_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(password_txt, "enter your password");
						return;
						}

							
					if(dob_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(dob_txt, "enter your dob");
						return;
						}	
					
					customer c = new customer();
					c.setName(name_txt.getText());
					c.setUsername(username_txt.getText());
					c.setPassword(password_txt.getText());
					c.setDob(dob_txt.getText());
				
					
					customerService cc = new customerServiceImpl();
					if(cc.addCustomer(c)) {
						JOptionPane.showMessageDialog(null, "added success");
						new customer_login().setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "failed");
					}
					
					
				}
				
			});
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			btnNewButton_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1.setBounds(357, 404, 151, 49);
		}
		return btnNewButton_1;
	}
	private JTextField getDob_txt() {
		if (dob_txt == null) {
			dob_txt = new JTextField();
			dob_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			dob_txt.setColumns(10);
			dob_txt.setBounds(357, 360, 232, 33);
		}
		return dob_txt;
	}
}
