package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import database.db;
import model.supplier;

public class supplierServiceImpl implements supplierService{
	
	Connection con = null;
	public supplierServiceImpl() {
		con = db.getDbObject();
	}


	@Override
	public boolean addSupplier(supplier s) {
		try {
			String sql = "insert into supplier(id,password)values(?,?)";
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setInt(1, s.getId());
			pstm.setString(2, s.getPassword());
			pstm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<supplier> getAllSupplier() {
		List<supplier> slist = new ArrayList<>();
		String sql = "select * from supplier";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			supplier s = new supplier();
			s.setId(rs.getInt("id"));
			s.setPassword(rs.getString("password"));		
			slist.add(s);			
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return slist;
	}
	

}
