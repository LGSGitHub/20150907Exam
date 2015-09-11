package com.hand.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hand.entity.Address;
import com.hand.entity.Customer;
import com.hand.util.ConnectionFactory;

public class CustomerDaoImpl {

	public boolean isExist(String first_name, String last_name) {
		Connection conn = ConnectionFactory.getInstance().makeConnection();
		PreparedStatement ps;
		ResultSet rs = null;
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
		} finally {
			try {
				rs.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;

	}

	//得到所有Customer的数据，转化为json格式的字符串返回
	public String getCustomer() {
		Connection conn = ConnectionFactory.getInstance().makeConnection();
		PreparedStatement ps;
		ResultSet rs = null;
		//String str;
		String data;
		try {

			ps = conn.prepareStatement(
					"SELECT customer_id,first_name,last_name,email,address,customer.last_update FROM customer,address WHERE customer.address_id=address.address_id AND active=1");
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("查询数据不为空");
				StringBuilder sb = new StringBuilder();
				try {
					// 往sb里添加json格式的数据
					sb.append("[");
					while (rs.next()) {
						sb.append("{\"first_name\" : \" " + rs.getString("first_name") + "\",");
						sb.append("\"last_name\" : \"" + rs.getString("last_name") + "\",");
						sb.append("\"address\":\"" + rs.getString("address") + "\",");
						sb.append("\"email\":\"" + rs.getString("email") + "\",");
						sb.append("\"customer_id\":\"" + rs.getString("customer_id") + "\",");
						sb.append("\"last_update\":\"" + rs.getString("last_update") + "\"},");

					}
					// sb.setLength(sb.length() - 1);
					// 删除最后没用的逗号
					sb.deleteCharAt(sb.length() - 1);
					sb.append("]");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				// 把stringbuilder转为String
				data = sb.toString();
				//data = str.split(",");
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
	
	//插入Customer数据
	public void add(String first_name,String last_name,String email,Address address) throws SQLException
	{
		Connection conn = ConnectionFactory.getInstance().makeConnection();
		String sql = "insert into customer(first_name,last_name,email,address_id,store_id,create_date) value(?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareCall(sql);
		System.out.println("执行Customer添加方法");
		Timestamp create_date = new Timestamp(new Date().getTime());
		ps.setString(1, first_name);
		ps.setString(2, last_name);
		ps.setString(3, email);
		ps.setInt(4, address.getAddressId());
		ps.setInt(5, 1);
		ps.setTimestamp(6, create_date);
		ps.execute();
		conn.close();
	}
	
	public void update(Customer customer) throws SQLException
	{
		Connection conn = ConnectionFactory.getInstance().makeConnection();
		String sql = "update customer set first_name=?,last_name=?,email=?,address_id=? where customer_id=?";
		PreparedStatement ps = conn.prepareCall(sql);
		System.out.println("执行Customer更新方法");
		ps.setString(1, customer.getFirst_name());
		ps.setString(2, customer.getLast_name());
		ps.setString(3, customer.getEmail());
		ps.setInt(4, customer.getAddress().getAddressId());
		ps.setInt(5, customer.getCustomer_id());
		ps.execute();
		conn.close();
	}
	
	public void delete(Customer customer) throws SQLException
	{
		Connection conn = ConnectionFactory.getInstance().makeConnection();
		String sql = "delete from customer where customer_id=?";
		PreparedStatement ps = conn.prepareCall(sql);
		System.out.println("执行Customer的删除方法");
		ps.setInt(1, customer.getCustomer_id());
		ps.execute();
		conn.close();
	}

}
