package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.supplier;
import service.supplierService;
import service.supplierServiceImpl;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class admin_add_supplier extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblQuickBill;
	private JLabel label;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnProductInfo;
	private JButton btnNewButton_4;
	private JButton btnNewButton_1;
	private JTextField password_txt;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1;
	private JTextField id_txt;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_add_supplier frame = new admin_add_supplier();
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
	public admin_add_supplier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPassword_txt());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getId_txt());
		contentPane.add(getBtnNewButton_2());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setBounds(0, 0, 1188, 64);
			panel.setLayout(null);
			panel.add(getLblQuickBill());
			panel.add(getLblNewLabel());
			panel.add(getBtnNewButton());
			panel.add(getBtnProductInfo());
			panel.add(getBtnNewButton_4());
		}
		return panel;
	}
	private JLabel getLblQuickBill() {
		if (lblQuickBill == null) {
			lblQuickBill = new JLabel("GSMS");
			lblQuickBill.setBounds(10, 0, 126, 64);
			lblQuickBill.setHorizontalAlignment(SwingConstants.CENTER);
			lblQuickBill.setForeground(Color.WHITE);
			lblQuickBill.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
		}
		return lblQuickBill;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(146, 0, 73, 64);
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\Java\\workspace\\OOP_project\\icons\\bank (3).png"));
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add Supplier");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_add_supplier().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\Java\\workspace\\OOP_project\\icons\\Cashier.png"));
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setBounds(403, 19, 173, 42);
		}
		return btnNewButton;
	}
	private JButton getBtnProductInfo() {
		if (btnProductInfo == null) {
			btnProductInfo = new JButton("Cart");
			btnProductInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_cart_check().setVisible(true);
					dispose();
				}
			});
			btnProductInfo.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\Java\\workspace\\OOP_project\\icons\\Stock.png"));
			btnProductInfo.setBounds(586, 19, 173, 42);
		}
		return btnProductInfo;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new admin_login().setVisible(true);
					dispose();
				}
			});
			btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\Java\\workspace\\OOP_project\\icons\\remove.png"));
			btnNewButton_4.setBounds(1121, 19, 57, 42);
		}
		return btnNewButton_4;
	}
	
	private JTextField getPassword_txt() {
		if (password_txt == null) {
			password_txt = new JTextField();
			password_txt.setColumns(10);
			password_txt.setBounds(592, 313, 117, 29);
		}
		return password_txt;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("PASSWORD:");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setBounds(465, 313, 117, 38);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("ID:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(465, 261, 117, 38);
		}
		return lblNewLabel_1;
	}
	private JTextField getId_txt() {
		if (id_txt == null) {
			id_txt = new JTextField();
			id_txt.setColumns(10);
			id_txt.setBounds(592, 270, 117, 29);
		}
		return id_txt;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("ADD");
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//validation
					if(id_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(id_txt, "Enter your Username");
						return;
					}
					if(password_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(password_txt, "Enter your Password");
						return;
					}
					
					supplier s = new supplier();
					s.setId(Integer.valueOf(id_txt.getText()));
					s.setPassword(password_txt.getText());
					
					supplierService ss = new supplierServiceImpl();
					if(ss.addSupplier(s)) {
						JOptionPane.showMessageDialog(null, "added success");
					}else {
						JOptionPane.showMessageDialog(null, "failed");
					}
					
					//clear input 
					id_txt.setText("");
					password_txt.setText("");
				}
			});
			btnNewButton_2.setBounds(520, 360, 117, 64);
		}
		return btnNewButton_2;
	}
}
