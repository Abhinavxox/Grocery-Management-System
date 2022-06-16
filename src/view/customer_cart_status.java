package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.cart;
import service.cartService;
import service.cartServiceImpl;

import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class customer_cart_status extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblQuickBill;
	private JLabel label;
	private JLabel lblNewLabel;
	private JButton btnProductInfo;
	private JButton btnNewButton_4;
	private JButton btnProductInfo_1;
	private JLabel lblNewLabel_1;
	private JTextField id_txt;
	private JButton btnNewButton_1_2_1;
	private JLabel lblNewLabel_2;
	private JCheckBox packaged_check;
	private JCheckBox shipped_check;
	private JCheckBox delivered_check;
	private JLabel lblNewLabel_2_1;
	private JSeparator separator;
	private JLabel lblNewLabel_2_2;
	private JTextField name_txt;
	private JTextField total_txt;
	private JTextField address_txt;
	private JLabel lblNewLabel_2_2_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_cart_status frame = new customer_cart_status();
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
	public customer_cart_status() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getId_txt());
		contentPane.add(getBtnNewButton_1_2_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getPackaged_check());
		contentPane.add(getShipped_check());
		contentPane.add(getDelivered_check());
		contentPane.add(getLblNewLabel_2_1());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_2_2());
		contentPane.add(getName_txt());
		contentPane.add(getTotal_txt());
		contentPane.add(getAddress_txt());
		contentPane.add(getLblNewLabel_2_2_1());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setBounds(0, 0, 1188, 64);
			panel.setLayout(null);
			panel.add(getLblQuickBill());
			panel.add(getLblNewLabel());
			panel.add(getBtnProductInfo());
			panel.add(getBtnNewButton_4());
			panel.add(getBtnProductInfo_1());
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
	private JButton getBtnProductInfo() {
		if (btnProductInfo == null) {
			btnProductInfo = new JButton("Cart Status");
			btnProductInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new customer_cart_status().setVisible(true);
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
					new index().setVisible(true);
					dispose();
				}
			});
			btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\Java\\workspace\\OOP_project\\icons\\remove.png"));
			btnNewButton_4.setBounds(1121, 19, 57, 42);
		}
		return btnNewButton_4;
	}
	private JButton getBtnProductInfo_1() {
		if (btnProductInfo_1 == null) {
			btnProductInfo_1 = new JButton("Cart");
			btnProductInfo_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new customer_cart().setVisible(true);
					dispose();
				}
			});
			btnProductInfo_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\Java\\workspace\\OOP_project\\icons\\Stock.png"));
			btnProductInfo_1.setBounds(403, 19, 173, 42);
		}
		return btnProductInfo_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Cart status");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel_1.setBounds(10, 75, 477, 57);
		}
		return lblNewLabel_1;
	}
	private JTextField getId_txt() {
		if (id_txt == null) {
			id_txt = new JTextField();
			id_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			id_txt.setColumns(10);
			id_txt.setBounds(225, 146, 232, 33);
		}
		return id_txt;
	}
	private JButton getBtnNewButton_1_2_1() {
		if (btnNewButton_1_2_1 == null) {
			btnNewButton_1_2_1 = new JButton("Search");
			btnNewButton_1_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//validate
					if(id_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(id_txt, "enter cart id");
						return;	
					}
					String data = id_txt.getText();
					cartService cc = new cartServiceImpl();
					List<cart> slist = cc.searchCart(data);
					
					for(cart c:slist) {
						name_txt.setText(String.valueOf(c.getName()));
						address_txt.setText(String.valueOf(c.getAddress()));
						total_txt.setText(String.valueOf(c.getTotal()));
						
						//since it has null at default
						packaged_check.setSelected(c.isPackaged());
						shipped_check.setSelected(c.isShipped());
						delivered_check.setSelected(c.isDelivered());
					}	
				}
			});
			btnNewButton_1_2_1.setForeground(Color.WHITE);
			btnNewButton_1_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2_1.setBounds(225, 191, 151, 49);
		}
		return btnNewButton_1_2_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Cart ID :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(10, 143, 205, 33);
		}
		return lblNewLabel_2;
	}
	private JCheckBox getPackaged_check() {
		if (packaged_check == null) {
			packaged_check = new JCheckBox("Packaged");
			packaged_check.setEnabled(false);
			packaged_check.setFont(new Font("Tahoma", Font.PLAIN, 19));
			packaged_check.setBounds(607, 135, 531, 57);
		}
		return packaged_check;
	}
	private JCheckBox getShipped_check() {
		if (shipped_check == null) {
			shipped_check = new JCheckBox("Shipped");
			shipped_check.setEnabled(false);
			shipped_check.setFont(new Font("Tahoma", Font.PLAIN, 19));
			shipped_check.setBounds(607, 207, 531, 57);
		}
		return shipped_check;
	}
	private JCheckBox getDelivered_check() {
		if (delivered_check == null) {
			delivered_check = new JCheckBox("Delivered");
			delivered_check.setEnabled(false);
			delivered_check.setFont(new Font("Tahoma", Font.PLAIN, 19));
			delivered_check.setBounds(607, 278, 531, 57);
		}
		return delivered_check;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Name :");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_1.setBounds(0, 399, 205, 33);
		}
		return lblNewLabel_2_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(10, 368, 1168, 13);
		}
		return separator;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("Total :");
			lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_2.setForeground(Color.WHITE);
			lblNewLabel_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_2.setBounds(10, 456, 205, 33);
		}
		return lblNewLabel_2_2;
	}
	private JTextField getName_txt() {
		if (name_txt == null) {
			name_txt = new JTextField();
			name_txt.setEditable(false);
			name_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			name_txt.setColumns(10);
			name_txt.setBounds(225, 402, 232, 33);
		}
		return name_txt;
	}
	private JTextField getTotal_txt() {
		if (total_txt == null) {
			total_txt = new JTextField();
			total_txt.setEditable(false);
			total_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			total_txt.setColumns(10);
			total_txt.setBounds(225, 459, 232, 33);
		}
		return total_txt;
	}
	private JTextField getAddress_txt() {
		if (address_txt == null) {
			address_txt = new JTextField();
			address_txt.setEditable(false);
			address_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			address_txt.setColumns(10);
			address_txt.setBounds(225, 513, 232, 33);
		}
		return address_txt;
	}
	private JLabel getLblNewLabel_2_2_1() {
		if (lblNewLabel_2_2_1 == null) {
			lblNewLabel_2_2_1 = new JLabel("Address :");
			lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_2_1.setBounds(10, 513, 205, 33);
		}
		return lblNewLabel_2_2_1;
	}
}
