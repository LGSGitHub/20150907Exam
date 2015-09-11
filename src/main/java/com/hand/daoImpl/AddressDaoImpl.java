package com.hand.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.entity.Address;
import com.hand.util.ConnectionFactory;

public class AddressDaoImpl {

	public String getAddress() {
		Connection conn = ConnectionFactory.getInstance().makeConnection();
		String sql = "select address_id,address from address";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareCall(sql);
			rs = ps.executeQuery();
			String data;
			if (rs.next()) {
				System.out.println("查询Address数据不为空");
				StringBuilder sb = new StringBuilder();
				// 往sb里添加json格式的数据
				sb.append("[");
				while (rs.next()) {
					sb.append("{\"address_id\" : \" " + rs.getString("address_id") + "\",");
					sb.append("\"address\":\"" + rs.getString("address") + "\"},");
				}
				// 删除最后没用的逗号
				sb.deleteCharAt(sb.length() - 1);
				sb.append("]");
				data = sb.toString();
				return data;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return null;
	}

	public Address getAddressClass(String addressname) {
		Connection conn = ConnectionFactory.getInstance().makeConnection();
		String sql = "select * from address where address=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Address address = new Address();
		try {
			ps = conn.prepareCall(sql);
			ps.setString(1, addressname);
			rs = ps.executeQuery();
			if (rs.next()) {
				address.setAddressId(rs.getShort("address_id"));
				address.setAddress(rs.getString("address"));
				return address;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
