package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import database.db;
import model.inventory;

public class inventoryServiceImpl implements inventoryService{
	
	Connection con = null;
	public inventoryServiceImpl() {
		con = db.getDbObject();
	}
	@Override
	public boolean addinventory(inventory i) {
		try {
			String sql = "insert into inventory(id,name,mrp,quantity)values(?,?,?,?)";
			
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setInt(1, i.getId());
			pstm.setString(2, i.getName());
			pstm.setInt(3, i.getQuantity());
			pstm.setInt(4, i.getMrp());		
			pstm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<inventory> getAllInventory() {
		List<inventory> slist = new ArrayList<>();
		String sql = "select * from inventory";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			inventory s = new inventory();
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setQuantity(rs.getInt("quantity"));
			s.setMrp(rs.getInt("mrp"));
			slist.add(s);			
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return slist;
	}
	@Override
	public List<inventory> searchInventory(String data) {
		List<inventory> slist = new ArrayList<>();
		String sql = "select * from inventory where id like '"+data+"%' OR mrp like '"+data+"%' OR name = '"+data+"'"  ;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			inventory s = new inventory();
			s.setId(rs.getInt("id"));
//			s.setName(rs.getString("name"));
			s.setQuantity(rs.getInt("quantity"));
			s.setMrp(rs.getInt("mrp"));
			slist.add(s);		
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return slist;
	}

	

}
