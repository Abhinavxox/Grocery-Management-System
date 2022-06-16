package view;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.admin;
import model.customer;
import service.adminService;
import service.adminServiceImpl;
import service.customerService;
import service.customerServiceImpl;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class customer_login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JTextField username_txt;
	private JPasswordField password_txt;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;
	private boolean is_exist = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_login frame = new customer_login();
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
	public customer_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69,69,69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_1());
		contentPane.add(getUsername_txt());
		contentPane.add(getPassword_txt());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_3_1());
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Login Form\r\n");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 40));
			lblNewLabel.setBounds(0, 0, 260, 71);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new index().setVisible(true);
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
			separator.setBounds(10, 83, 768, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Username :");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel_2.setBounds(270, 187, 168, 49);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Password :");
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel_2_1.setBounds(270, 264, 168, 49);
		}
		return lblNewLabel_2_1;
	}
	private JTextField getUsername_txt() {
		if (username_txt == null) {
			username_txt = new JTextField();
			username_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			username_txt.setBounds(448, 187, 232, 49);
			username_txt.setColumns(10);
		}
		return username_txt;
	}
	private JPasswordField getPassword_txt() {
		if (password_txt == null) {
			password_txt = new JPasswordField();
			password_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			password_txt.setBounds(448, 264, 232, 49);
		}
		return password_txt;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Login");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//validation
					if(username_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(username_txt, "Enter your Username");
						return;
					}
					if(password_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(password_txt, "Enter your Password");
						return;
					}
					
					customerService cc = new customerServiceImpl();
					List<customer> slist = cc.getAllCustomer();
					
					for(customer c:slist) {
						
						if(username_txt.getText().equals(c.getUsername()) && password_txt.getText().equals(c.getPassword())) {						
							is_exist = true;	
						}
						
					}
					if(is_exist) {
						new customer_index().setVisible(true);
						dispose();
						return;
					}else{
						JOptionPane.showMessageDialog(null, "Username or password donot match");
						return;
					}
					
				}
			});
			btnNewButton_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1.setForeground(Color.WHITE);
			btnNewButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			btnNewButton_1.setBounds(448, 337, 151, 49);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\r\nDon't have an account?\r\n");
			lblNewLabel_3.setForeground(Color.WHITE);
			lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_3.setBounds(270, 400, 221, 37);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("<html><u>Register now.</u></html>");
			lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new customer_register().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_3_1.setForeground(Color.WHITE);
			lblNewLabel_3_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_3_1.setBounds(490, 400, 127, 37);
		}
		return lblNewLabel_3_1;
	}
}
