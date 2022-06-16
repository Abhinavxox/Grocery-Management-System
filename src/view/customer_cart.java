package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.cart;
import model.inventory;
import service.cartService;
import service.cartServiceImpl;
import service.inventoryService;
import service.inventoryServiceImpl;

import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class customer_cart extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblQuickBill;
	private JLabel label;
	private JLabel lblNewLabel;
	private JButton btnProductInfo;
	private JButton btnNewButton_4;
	private JButton btnProductInfo_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JSeparator separator;
	private JButton btnNewButton;
	private JButton btnRemove;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JTextField pid_txt;
	private JComboBox name_combo;
	private JTextField mrp_txt;
	private JTextField quantity_txt;
	private JLabel lblNewLabel_2_4;
	private JSeparator separator_1;
	private JTextField name_txt;
	private JLabel lblNewLabel_2_4_1;
	private JTextField ce_txt;
	private JLabel lblNewLabel_2_4_2;
	private JLabel lblNewLabel_2_4_4;
	private JTextField cc_txt;
	private JLabel lblNewLabel_2_4_3;
	private JTextField address_txt;
	private JTextField total_txt;
	private JLabel lblNewLabel_2_4_4_1;
	private JButton btnPlaceOrder;
	private JComboBox payment_combo;
	private int total= 0;
	private String data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_cart frame = new customer_cart();
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
	public customer_cart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getSeparator());
		contentPane.add(getButton_1());
		contentPane.add(getBtnRemove());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_1_1());
		contentPane.add(getLblNewLabel_2_2_1());
		contentPane.add(getLblNewLabel_2_3_1());
		contentPane.add(getPid_txt());
		contentPane.add(getName_combo());
		contentPane.add(getMrp_txt());
		contentPane.add(getQuantity_txt());
		contentPane.add(getLblNewLabel_2_4());
		contentPane.add(getSeparator_1());
		contentPane.add(getName_txt());
		contentPane.add(getLblNewLabel_2_4_1());
		contentPane.add(getCe_txt());
		contentPane.add(getLblNewLabel_2_4_2());
		contentPane.add(getLblNewLabel_2_4_4());
		contentPane.add(getCc_txt());
		contentPane.add(getLblNewLabel_2_4_3());
		contentPane.add(getAddress_txt());
		contentPane.add(getTotal_txt());
		contentPane.add(getLblNewLabel_2_4_4_1());
		contentPane.add(getBtnPlaceOrder());
		contentPane.add(getPayment_combo());
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
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 75, 663, 399);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Id", "Name", "Mrp", "Quantity", "Price"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("ADD ITEMS");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_1.setBounds(874, 75, 104, 40);
		}
		return lblNewLabel_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(683, 112, 495, 9);
		}
		return separator;
	}
	private JButton getButton_1() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("ADD");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//validation
					if(name_combo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(name_combo, "select a product");
						return;
						}
					if(quantity_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(quantity_txt, "enter quantity");
						return;
						}
					
					int price;
					int quantity = Integer.valueOf(quantity_txt.getText());
					int mrp = Integer.valueOf(mrp_txt.getText());
					price = quantity*mrp;
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {pid_txt.getText(),data,quantity_txt.getText(),mrp_txt.getText(),price});
					
					//total
					total += price;
					total_txt.setText(String.valueOf(total));
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
			btnNewButton.setBounds(763, 410, 126, 64);
		}
		return btnNewButton;
	}
	private JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton("REMOVE");
			btnRemove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
					}
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int row = table.getSelectedRow();
					int id = (int) table.getModel().getValueAt(row, 4);
					total -= id;
					total_txt.setText(String.valueOf(total));
					model.removeRow(row);
					
					quantity_txt.setText("");
				}
			});
			btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 19));
			btnRemove.setBounds(938, 410, 126, 64);
		}
		return btnRemove;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("ID:");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2.setBounds(693, 132, 196, 40);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Name");
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2_1.setBounds(693, 180, 196, 40);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_2_1() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("Mrp");
			lblNewLabel_2_2.setForeground(Color.WHITE);
			lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2_2.setBounds(693, 231, 196, 40);
		}
		return lblNewLabel_2_2;
	}
	private JLabel getLblNewLabel_2_3_1() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel("Quantity");
			lblNewLabel_2_3.setForeground(Color.WHITE);
			lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2_3.setBounds(693, 282, 196, 40);
		}
		return lblNewLabel_2_3;
	}
	private JTextField getPid_txt() {
		if (pid_txt == null) {
			pid_txt = new JTextField();
			pid_txt.setEditable(false);
			pid_txt.setBounds(914, 136, 181, 30);
			pid_txt.setColumns(10);
		}
		return pid_txt;
	}
	private JComboBox getName_combo() {
		if (name_combo == null) {
			name_combo = new JComboBox();
			name_combo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = name_combo.getSelectedIndex();
					switch (a) {
					case 0: {
						data = null;
						pid_txt.setText("");
						mrp_txt.setText("");
						break;
					}
					case 1: {
						data = "sugar";
						break;
					}
					case 2: {
						data = "milk";
						break;
					}
					case 3: {
						data = "cheese";						
						break;
					}
					case 4: {
						data = "juice";
						break;
					}
					case 5: {
						data = "flour";
						break;
					}
					case 6: {
						data = "salt";
						break;
					}
					default:
					}
					
					inventoryService ss = new inventoryServiceImpl();
					List<inventory> slist = ss.searchInventory(data);
					
					for(inventory s:slist) {
						pid_txt.setText(String.valueOf(s.getId()));
						mrp_txt.setText(String.valueOf(s.getMrp()));
					}	
					
					
				}
			});
			name_combo.setModel(new DefaultComboBoxModel(new String[] {"...", "Sugar(kg)", "Milk(Ltr)", "Cheese(Pieces)", "Juice(Ltr)", "Flour(kg)", "Salt(kg)"}));
			name_combo.setBounds(914, 189, 181, 30);
		}
		return name_combo;
	}
	private JTextField getMrp_txt() {
		if (mrp_txt == null) {
			mrp_txt = new JTextField();
			mrp_txt.setEditable(false);
			mrp_txt.setColumns(10);
			mrp_txt.setBounds(914, 245, 181, 30);
		}
		return mrp_txt;
	}
	private JTextField getQuantity_txt() {
		if (quantity_txt == null) {
			quantity_txt = new JTextField();
			quantity_txt.setColumns(10);
			quantity_txt.setBounds(914, 296, 181, 30);
		}
		return quantity_txt;
	}
	private JLabel getLblNewLabel_2_4() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel("Name:");
			lblNewLabel_2_4.setForeground(Color.WHITE);
			lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2_4.setBounds(10, 502, 196, 40);
		}
		return lblNewLabel_2_4;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(10, 485, 1168, 9);
		}
		return separator_1;
	}
	private JTextField getName_txt() {
		if (name_txt == null) {
			name_txt = new JTextField();
			name_txt.setColumns(10);
			name_txt.setBounds(215, 502, 181, 40);
		}
		return name_txt;
	}
	private JLabel getLblNewLabel_2_4_1() {
		if (lblNewLabel_2_4_1 == null) {
			lblNewLabel_2_4_1 = new JLabel("Payment:");
			lblNewLabel_2_4_1.setForeground(Color.WHITE);
			lblNewLabel_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2_4_1.setBounds(10, 553, 196, 40);
		}
		return lblNewLabel_2_4_1;
	}
	private JTextField getCe_txt() {
		if (ce_txt == null) {
			ce_txt = new JTextField();
			ce_txt.setColumns(10);
			ce_txt.setBounds(215, 604, 181, 40);
		}
		return ce_txt;
	}
	private JLabel getLblNewLabel_2_4_2() {
		if (lblNewLabel_2_4_2 == null) {
			lblNewLabel_2_4_2 = new JLabel("Exp date:");
			lblNewLabel_2_4_2.setForeground(Color.WHITE);
			lblNewLabel_2_4_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2_4_2.setBounds(10, 604, 196, 40);
		}
		return lblNewLabel_2_4_2;
	}
	private JLabel getLblNewLabel_2_4_4() {
		if (lblNewLabel_2_4_4 == null) {
			lblNewLabel_2_4_4 = new JLabel("CVP:");
			lblNewLabel_2_4_4.setForeground(Color.WHITE);
			lblNewLabel_2_4_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2_4_4.setBounds(406, 502, 196, 40);
		}
		return lblNewLabel_2_4_4;
	}
	private JTextField getCc_txt() {
		if (cc_txt == null) {
			cc_txt = new JTextField();
			cc_txt.setColumns(10);
			cc_txt.setBounds(611, 502, 181, 40);
		}
		return cc_txt;
	}
	private JLabel getLblNewLabel_2_4_3() {
		if (lblNewLabel_2_4_3 == null) {
			lblNewLabel_2_4_3 = new JLabel("Address:");
			lblNewLabel_2_4_3.setForeground(Color.WHITE);
			lblNewLabel_2_4_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2_4_3.setBounds(406, 553, 196, 40);
		}
		return lblNewLabel_2_4_3;
	}
	private JTextField getAddress_txt() {
		if (address_txt == null) {
			address_txt = new JTextField();
			address_txt.setColumns(10);
			address_txt.setBounds(611, 553, 181, 40);
		}
		return address_txt;
	}
	private JTextField getTotal_txt() {
		if (total_txt == null) {
			total_txt = new JTextField();
			total_txt.setEditable(false);
			total_txt.setColumns(10);
			total_txt.setBounds(914, 353, 117, 40);
		}
		return total_txt;
	}
	private JLabel getLblNewLabel_2_4_4_1() {
		if (lblNewLabel_2_4_4_1 == null) {
			lblNewLabel_2_4_4_1 = new JLabel("TOTAL:");
			lblNewLabel_2_4_4_1.setForeground(Color.WHITE);
			lblNewLabel_2_4_4_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_2_4_4_1.setBounds(798, 353, 117, 40);
		}
		return lblNewLabel_2_4_4_1;
	}
	private JButton getBtnPlaceOrder() {
		if (btnPlaceOrder == null) {
			btnPlaceOrder = new JButton("PLACE ORDER");
			btnPlaceOrder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//validation
					if(total==0) {
						JOptionPane.showMessageDialog(name_combo, "add a product first");
						return;	
					}
					if(name_combo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(name_combo, "select a product");
						return;
						}
					if(quantity_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(quantity_txt, "enter quantity");
						return;
						}
					if(name_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(name_txt, "enter your name");
						return;
						}
					if(payment_combo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(payment_combo, "select a payment method");
						return;
						}
					if(ce_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(ce_txt, "enter card exp date");
						return;
						}
					if(cc_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(cc_txt, "enter cvp");
						return;
						}
					if(address_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(address_txt, "enter your address");
						return;
						}
					
					//when order is placed
					cart c = new cart();
					c.setName(name_txt.getText());
					c.setTotal(Integer.valueOf(total_txt.getText()));
					c.setAddress(address_txt.getText());
					c.setPackaged(false);
					c.setDelivered(false);
					c.setShipped(false);
					
					cartService cc = new cartServiceImpl();
					if(cc.addCart(c)) {
						JOptionPane.showMessageDialog(null, "added success");
						quantity_txt.setText("");
						name_txt.setText("");
						ce_txt.setText("");
						cc_txt.setText("");
						address_txt.setText("");
						
						
						
						return;
					}else {
						JOptionPane.showMessageDialog(null, "failed to add");
					}
					
					
					
					
				}
			});
			btnPlaceOrder.setFont(new Font("Tahoma", Font.PLAIN, 19));
			btnPlaceOrder.setBounds(1016, 613, 162, 64);
		}
		return btnPlaceOrder;
	}
	private JComboBox getPayment_combo() {
		if (payment_combo == null) {
			payment_combo = new JComboBox();
			payment_combo.setModel(new DefaultComboBoxModel(new String[] {"...", "VISA", "MASTERCARD"}));
			payment_combo.setBounds(215, 553, 181, 40);
		}
		return payment_combo;
	}
}
