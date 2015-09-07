package com.hand.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionFactory {

	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;

	private static final ConnectionFactory factory = new ConnectionFactory();

	private Connection conn = null;

	// ʹ��static��������飬��̬��������ڳ�ʼ���࣬����Ϊ������Ը�ֵ�����������ʱ��ᱻ���أ�ִֻ��һ��
	static {
		// properties���������棨���������ļ��еļ�ֵ��
		Properties prop = new Properties();
		try {
			// �������ļ��еļ�ֵ�Զ�ȡ����������
			InputStream in = ConnectionFactory.class.getClassLoader().getResourceAsStream("dbconfig.properties");

			prop.load(in);

		} catch (IOException e) {
			e.printStackTrace();
		}

		driver = prop.getProperty("driver");

		dburl = prop.getProperty("dburl");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	}

	private ConnectionFactory() {
	}

	public static ConnectionFactory getInstance() {
		return factory;
	}

	public Connection makeConnection() {
		try {

			Class.forName(driver);
			conn = DriverManager.getConnection(dburl, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
