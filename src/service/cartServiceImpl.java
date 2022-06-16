package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;

import database.db;
import model.cart;

public class cartServiceImpl implements cartService{
	
	Connection con = null;
	public cartServiceImpl() {
		con = db.getDbObject();
	}

	@Override
	public boolean addCart(cart c) {
		try {
			String sql = "insert into cart(name,total,address,packaged,shipped,delivered)values(?,?,?,?,?,?)";
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, c.getName());
			pstm.setInt(2, c.getTotal());
			pstm.setString(3, c.getAddress());
			pstm.setBoolean(4, c.isPackaged());
			pstm.setBoolean(5, c.isShipped());
			pstm.setBoolean(6, c.isDelivered());
			pstm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<cart> searchCart(String data) {
		List<cart> slist = new ArrayList<>();
		String sql = "select * from cart where name like '"+data+"%' "
				+ "OR total like '"+data+"%' OR address like '"+data+"%' "
						+ "OR packaged like '"+data+"%' OR shipped like '"+data+"%' "
								+ "OR delivered like '"+data+"%' OR billno = '"+data+"'"  ;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			cart c = new cart();
			c.setName(rs.getString("name"));
			c.setAddress(rs.getString("address"));
			c.setTotal(rs.getInt("total"));
			c.setPackaged(rs.getBoolean("packaged"));
			c.setShipped(rs.getBoolean("shipped"));
			c.setDelivered(rs.getBoolean("delivered"));
			slist.add(c);		
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return slist;
	}

	@Override
	public boolean updateCart(cart c) {
		try {
			String sql = "update cart set packaged = ?,shipped = ?, delivered = ? where billno = ?";		
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setBoolean(1, c.isPackaged());
			pstm.setBoolean(2, c.isShipped());
			pstm.setBoolean(3, c.isDelivered());
			pstm.setInt(4, c.getCartNo());
			pstm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
