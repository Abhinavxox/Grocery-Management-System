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
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.inventory;
import service.inventoryService;
import service.inventoryServiceImpl;

public class supplier_index extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblQuickBill;
	private JLabel label;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_4;
	private JPanel panr;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_2;
	private JTextField id_txt;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_2_3;
	private JTextField name_txt;
	private JTextField mrp_txt;
	private JTextField quantity_txt;
	private JButton btnNewButton_1_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supplier_index frame = new supplier_index();
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
	public supplier_index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 69, 69));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getPanr());
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
			btnNewButton = new JButton("Add Products");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\Java\\workspace\\OOP_project\\icons\\Cashier.png"));
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setBounds(403, 19, 173, 42);
		}
		return btnNewButton;
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
	private JPanel getPanr() {
		if (panr == null) {
			panr = new JPanel();
			panr.setLayout(null);
			panr.setBorder(new LineBorder(Color.WHITE, 2, true));
			panr.setBackground(Color.LIGHT_GRAY);
			panr.setBounds(10, 75, 1168, 609);
			panr.add(getLblNewLabel_1());
			panr.add(getScrollPane());
			panr.add(getLblNewLabel_2());
			panr.add(getId_txt());
			panr.add(getLblNewLabel_2_1());
			panr.add(getLblNewLabel_2_2());
			panr.add(getLblNewLabel_2_3());
			panr.add(getName_txt());
			panr.add(getMrp_txt());
			panr.add(getQuantity_txt());
			panr.add(getBtnNewButton_1_2());
			displaydata();
		}
		return panr;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Inventory");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
			lblNewLabel_1.setBounds(10, 11, 477, 57);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(497, 11, 663, 587);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Product ID :");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2.setBounds(10, 79, 205, 33);
		}
		return lblNewLabel_2;
	}
	private JTextField getId_txt() {
		if (id_txt == null) {
			id_txt = new JTextField();
			id_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			id_txt.setColumns(10);
			id_txt.setBounds(225, 79, 232, 33);
		}
		return id_txt;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Product Name :");
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_1.setBounds(10, 123, 205, 33);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel("Mrp");
			lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_2.setForeground(Color.WHITE);
			lblNewLabel_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_2.setBounds(10, 167, 205, 33);
		}
		return lblNewLabel_2_2;
	}
	private JLabel getLblNewLabel_2_3() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel("Quantity Available :");
			lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_2_3.setForeground(Color.WHITE);
			lblNewLabel_2_3.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			lblNewLabel_2_3.setBounds(10, 211, 205, 33);
		}
		return lblNewLabel_2_3;
	}
	private JTextField getName_txt() {
		if (name_txt == null) {
			name_txt = new JTextField();
			name_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			name_txt.setColumns(10);
			name_txt.setBounds(225, 123, 232, 33);
		}
		return name_txt;
	}
	private JTextField getMrp_txt() {
		if (mrp_txt == null) {
			mrp_txt = new JTextField();
			mrp_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			mrp_txt.setColumns(10);
			mrp_txt.setBounds(225, 167, 232, 33);
		}
		return mrp_txt;
	}
	private JTextField getQuantity_txt() {
		if (quantity_txt == null) {
			quantity_txt = new JTextField();
			quantity_txt.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
			quantity_txt.setColumns(10);
			quantity_txt.setBounds(225, 211, 232, 33);
		}
		return quantity_txt;
	}
	private JButton getBtnNewButton_1_2() {
		if (btnNewButton_1_2 == null) {
			btnNewButton_1_2 = new JButton("Add");
			btnNewButton_1_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//validation
					if(id_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(id_txt, "Enter product id");
						return;
					}
					if(name_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(name_txt , "Enter product name");
						return;
					}
					if(mrp_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(mrp_txt, "Enter product mrp");
						return;
					}
					if(quantity_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(quantity_txt, "Enter product available");
						return;
					}

					inventory i = new inventory();
					i.setId(Integer.valueOf(id_txt.getText()));
					i.setName(name_txt.getText());
					i.setQuantity(Integer.valueOf(quantity_txt.getText()));
					i.setMrp(Integer.valueOf(mrp_txt.getText()));
					
					inventoryService ii = new inventoryServiceImpl();
					if (ii.addinventory(i)) {
						JOptionPane.showMessageDialog(null, "added success");
						displaydata();
						
						//clear input 
						id_txt.setText("");
						name_txt.setText("");
						mrp_txt.setText("");
						quantity_txt.setText("");
						
						return;
					}else {
						JOptionPane.showMessageDialog(null, "added failed");
					}
				
				}
			});
			btnNewButton_1_2.setForeground(Color.WHITE);
			btnNewButton_1_2.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
			btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2.setBounds(64, 398, 151, 49);
		}
		return btnNewButton_1_2;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Id", "Name", "Mrp", "Available"
				}
			));
		}
		return table;
	}

	private void displaydata() {
		inventoryService ii = new inventoryServiceImpl();
		List<inventory> ilist = ii.getAllInventory();
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for(inventory i: ilist) {
		model.addRow(new Object[] {i.getId(),i.getName(),i.getMrp(),i.getQuantity()});
		}
	}
}
