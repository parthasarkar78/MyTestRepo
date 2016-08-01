package com.isat.catalist.cache;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class SiebelDefaultProductConfiguration {
	private static Map<String,List<SiebelDefaultProductConfiguration>> products= new HashMap<String, List<SiebelDefaultProductConfiguration>>();
	private String productID;
	private String parentProductID;
	private String soCommand;
	private Map<String,String> attributes;

	public static synchronized  List<SiebelDefaultProductConfiguration> getMobileProduct(String type) throws NamingException, SQLException{
		if(products.size()==0) loadData();
		List<SiebelDefaultProductConfiguration> prd = products.get(type);
		if(prd==null) prd = products.get("Default");
		return prd;
	}
	
	public static synchronized void clearData(){
		products.clear();
	}

	private static ResultSet getProduct(Connection con,String parentProductID,String subscriptionType) throws SQLException{
		String sql="select * from RBM_DEFMOBILE_TT_MAP where parent_product_id="+parentProductID+(subscriptionType==null?"":" and subscription_type='"+subscriptionType+"'");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs;
	}
	
	private static void load(Connection con,String parentProductID,String subscriptionType) throws SQLException{
		ResultSet rs = getProduct(con, parentProductID,subscriptionType);

		while(rs.next()){
			String type = rs.getString("SUBSCRIPTION_TYPE");
			List<SiebelDefaultProductConfiguration> _default= products.get(type);

			if(_default==null){
				_default= new ArrayList<SiebelDefaultProductConfiguration>();
				products.put(type, _default);
			}
			
			SiebelDefaultProductConfiguration _s = new SiebelDefaultProductConfiguration();
			_s.setProductID(rs.getString("PRODUCT_ID"));
			_s.setParentProductID(rs.getString("PARENT_PRODUCT_ID"));
			_s.setSoCommand(rs.getString("SO_COMMAND"));

			String attrs = rs.getString("RBM_ATTR");
			if(attrs!=null && !"".equals(attrs)){
				String[] _attr = attrs.split(";");
				Map<String,String> a=new HashMap<String, String>();
				for(String _a:_attr){
					String[] __a = _a.split("=");
					a.put(__a[0], __a[1]);
				}
				_s.setAttributes(a);
			}
			
			_default.add(_s);
			load(con, _s.getProductID(),type);
		}
		rs.close();
	}
	
	public static synchronized void loadData() throws NamingException, SQLException{
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("eaiDS");
		Connection con = ds.getConnection();

		products.clear();
		load(con, "0",null);
		con.close();
	}
	
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getParentProductID() {
		return parentProductID;
	}
	public void setParentProductID(String parentProductID) {
		this.parentProductID = parentProductID;
	}
	public String getSoCommand() {
		return soCommand;
	}
	public void setSoCommand(String soCommand) {
		this.soCommand = soCommand;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
}
