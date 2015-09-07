package com.hand.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl {

	public boolean isExist(Connection conn, String first_name,String last_name) {
		PreparedStatement ps;
		ResultSet rs;
		try {

			ps = conn.prepareStatement("select * from customer where first_name=? and last_name=?");
			ps.setString(1, first_name);
			ps.setString(2, last_name);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
	public ResultSet getCustomer(Connection conn) {
		PreparedStatement ps;
		ResultSet rs;
		try {

			ps = conn.prepareStatement("select * from customer");
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
