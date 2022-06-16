package view;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.admin;
import model.supplier;
import service.adminService;
import service.adminServiceImpl;
import service.supplierService;
import service.supplierServiceImpl;

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

public class supplier_login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JTextField id_txt;
	private JPasswordField password_txt;
	private JButton btnNewButton_1;
	private boolean is_exist = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supplier_login frame = new supplier_login();
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
	public supplier_login() {
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
		contentPane.add(getId_txt());
		contentPane.add(getPassword_txt());
		contentPane.add(getBtnNewButton_1());
		
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
			lblNewLabel_2 = new JLabel("ID :");
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
	private JTextField getId_txt() {
		if (id_txt == null) {
			id_txt = new JTextField();
			id_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			id_txt.setBounds(448, 187, 232, 49);
			id_txt.setColumns(10);
		}
		return id_txt;
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
					if(id_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(id_txt, "Enter your ID");
						return;
					}
					if(password_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(password_txt, "Enter your Password");
						return;
					}
					
					supplierService ss = new supplierServiceImpl();
					List<supplier> slist = ss.getAllSupplier();
					
					
					for(supplier s:slist) {
						String i = String.valueOf(s.getId());
						if(id_txt.getText().equals(i) && password_txt.getText().equals(s.getPassword())) {						
							is_exist = true;
						}
						
					}
					if(is_exist) {
						new supplier_index().setVisible(true);
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
}
