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


public class RbmTTMapConfiguration {

	private int productID;
	private String soAdd;
	private String soDelete;
	private String soBlockOutgoing;
	private String soBlockIncoming;
	private String soUnblockOutgoing;
	private String soUnblockIncoming;
	private String soChangeSIM;
	private Map<String,String> attributes;
	
	private final static Map<String,RbmTTMapConfiguration> list= new HashMap<String,RbmTTMapConfiguration>();
	
	public static synchronized RbmTTMapConfiguration getConfiguration(String key) throws Exception{
		if(list.size()==0){
			loadData();
		}
		return list.get(key);		
	}
	
	public static synchronized void clearData(){
		list.clear();
	}
	private static synchronized void loadData() throws NamingException, SQLException{
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("eaiDS");
		Connection con = ds.getConnection();
		String sql="select * from RBM_TT_MAP";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		list.clear();
		while(rs.next()){
			int productID = rs.getInt("PRODUCT_ID");
			String add = rs.getString("SO_ADD");
			String delete = rs.getString("SO_REMOVE");
			String bo = rs.getString("SO_BO");
			String uo = rs.getString("SO_UO");
			String bi = rs.getString("SO_BI");
			String ui = rs.getString("SO_UI");
			String cs = rs.getString("SO_CS");
			String attr = rs.getString("RBM_ATTR");
			
			RbmTTMapConfiguration r = new RbmTTMapConfiguration();
			r.setProductID(productID);
			r.setSoAdd(add);
			r.setSoDelete(delete);
			r.setSoBlockOutgoing(bo);
			r.setSoBlockIncoming(bi);
			r.setSoUnblockOutgoing(uo);
			r.setSoUnblockIncoming(ui);
			r.setSoChangeSIM(cs);
			if(attr!=null && !"".equals(attr)){
				String[] _a = attr.split(";");
				Map<String,String> _attributes=new HashMap<String, String>();
				for(String a:_a){
					String[] __a = a.split("=");
					_attributes.put(__a[0], __a[1]);
				}
				r.setAttributes(_attributes);
			}
			
			list.put(String.valueOf(productID), r);
			
		}
		
		rs.close();
		stmt.close();
		con.close();
		
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getSoAdd() {
		return soAdd;
	}
	public void setSoAdd(String soAdd) {
		this.soAdd = soAdd;
	}
	public String getSoDelete() {
		return soDelete;
	}
	public void setSoDelete(String soDelete) {
		this.soDelete = soDelete;
	}
	public String getSoBlockOutgoing() {
		return soBlockOutgoing;
	}
	public void setSoBlockOutgoing(String soBlockOutgoing) {
		this.soBlockOutgoing = soBlockOutgoing;
	}
	public String getSoBlockIncoming() {
		return soBlockIncoming;
	}
	public void setSoBlockIncoming(String soBlockIncoming) {
		this.soBlockIncoming = soBlockIncoming;
	}
	public String getSoUnblockOutgoing() {
		return soUnblockOutgoing;
	}
	public void setSoUnblockOutgoing(String soUnblockOutgoing) {
		this.soUnblockOutgoing = soUnblockOutgoing;
	}
	public String getSoUnblockIncoming() {
		return soUnblockIncoming;
	}
	public void setSoUnblockIncoming(String soUnblockIncoming) {
		this.soUnblockIncoming = soUnblockIncoming;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public String getSoChangeSIM() {
		return soChangeSIM;
	}

	public void setSoChangeSIM(String soChangeSIM) {
		this.soChangeSIM = soChangeSIM;
	}
	
	
}
