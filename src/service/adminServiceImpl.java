package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;

import database.db;
import model.admin;

public class adminServiceImpl implements adminService{
	
	Connection con = null;
	public adminServiceImpl() {
		con = db.getDbObject();
	}

	@Override
	public List<admin> getAllAdmin() {
		List<admin> slist = new ArrayList<>();
		String sql = "select * from admin";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
			admin a = new admin();
			a.setUsername(rs.getString("username"));
			a.setPassword(rs.getString("password"));		
			slist.add(a);			
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return slist;
	}
	

}
