package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;

import database.db;
import model.customer;

public class customerServiceImpl implements customerService{
	
	Connection con = null;
	public customerServiceImpl() {
		con = db.getDbObject();
	}

	@Override
	public boolean addCustomer(customer c) {
		try {
			String sql = "insert into customer(name,username,dob,password)values(?,?,?,?)";
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, c.getName());
			pstm.setString(2, c.getUsername());
			pstm.setString(3, c.getDob());
			pstm.setString(4, c.getPassword());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return false;
	}

	@Override
	public List<customer> getAllCustomer() {
		List<customer> slist = new ArrayList<>();
		String sql = "select * from customer";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			customer c = new customer();
			c.setUsername(rs.getString("username"));
			c.setPassword(rs.getString("password"));		
			slist.add(c);			
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return slist;
	}
	
	

}
