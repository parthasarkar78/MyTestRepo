package com.isat.catalist.cache;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class CRSRouting {

	String ip;
	String port;
	String username;
	String password;
	
	private static final Map<String,CRSRouting> routingList= new HashMap<String, CRSRouting>();
	
	public static synchronized void clearData(){
		routingList.clear();
	}
	
	public static synchronized CRSRouting getRouting(String msisdn, String paidType){
		if(routingList.size()==0){
			try {
				loadData();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}			
		}
		
		CRSRouting data = null;
		int i=5;
		int len = msisdn.length();
		do{
			String prefix = msisdn.substring(0,i);
			data	= routingList.get(prefix+paidType);
			if(data!=null) {
				break;
			}
			i++;			
		}while(i<len);
		
		return data;

	}
	
	public static synchronized void loadData() throws SQLException, NamingException{
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("eaiDS");
		Connection con = ds.getConnection();
		String sql="select MSISDN_PREFIX,PRODUCT_TYPE,IP_ADDRESS,PORT,USERNAME,PASSWORD from CRS_TB_PREFIX_MAP a, CRS_TB_ATTR_MAP b where b.SERVER_ID=a.SERVER_ID";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while(rs.next()){
			String prefix = rs.getString("MSISDN_PREFIX");
			String productType = rs.getString("PRODUCT_TYPE");
			String ip = rs.getString("IP_ADDRESS");
			String port = rs.getString("PORT");
			String username =rs.getString("USERNAME");
			String password =rs.getString("PASSWORD");
			CRSRouting rout = new CRSRouting();
			rout.setIp(ip);
			rout.setPassword(password);
			rout.setUsername(username);
			rout.setPort(port);
			routingList.put(prefix+productType, rout);
		}
		
		
		rs.close();
		stmt.close();
		con.close();

	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
