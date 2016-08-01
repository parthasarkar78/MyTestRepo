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

public class SiebelAttributeMapping {
	private String siebelAttribute;
	private String rbmAttribute;
	private String neAttribute;
	private String soAdd;
	private String soDelete;
	private String soBlockOutgoing;
	private String soUnblockOutgoing;
	private String soBlockIncoming;
	private String soUnblockIncoming;
	private String soChangeSIMCard;
	
	private static Map<String,SiebelAttributeMapping> data = new HashMap<String, SiebelAttributeMapping>();
	
	public String getSiebelAttribute() {
		return siebelAttribute;
	}

	public void setSiebelAttribute(String siebelAttribute) {
		this.siebelAttribute = siebelAttribute;
	}

	public String getRbmAttribute() {
		return rbmAttribute;
	}

	public void setRbmAttribute(String rbmAttribute) {
		this.rbmAttribute = rbmAttribute;
	}

	public String getNeAttribute() {
		return neAttribute;
	}

	public void setNeAttribute(String neAttribute) {
		this.neAttribute = neAttribute;
	}
	
	public static synchronized void clearData() {
		data.clear();
	}

	public static SiebelAttributeMapping getAttribute(String attrName) throws Exception{
		if(data.size()==0){
			loadData();
		}
		return data.get(attrName);
	}
	private static synchronized void loadData() throws NamingException, SQLException{
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("eaiDS");
		Connection con = ds.getConnection();
		String sql="select * from SBL_ATTR_MAP";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		data.clear();
		while(rs.next()){
			SiebelAttributeMapping _s = new SiebelAttributeMapping();
			_s.setSiebelAttribute(rs.getString("SBL_ATTR_NAME"));
			_s.setNeAttribute(rs.getString("NE_ATTR_NAME"));
			_s.setRbmAttribute(rs.getString("RBM_ATTR_NAME"));
			_s.setSoAdd(rs.getString("SO_ADD"));
			_s.setSoDelete(rs.getString("SO_REMOVE"));
			_s.setSoBlockIncoming(rs.getString("SO_BI"));
			_s.setSoBlockOutgoing(rs.getString("SO_BO"));
			_s.setSoUnblockIncoming(rs.getString("SO_UI"));
			_s.setSoUnblockOutgoing(rs.getString("SO_UO"));
			_s.setSoChangeSIMCard(rs.getString("SO_CS"));
			
			data.put(_s.getSiebelAttribute(), _s);
		}
				
		rs.close();
		stmt.close();
		con.close();

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

	public String getSoUnblockOutgoing() {
		return soUnblockOutgoing;
	}

	public void setSoUnblockOutgoing(String soUnblockOutgoing) {
		this.soUnblockOutgoing = soUnblockOutgoing;
	}

	public String getSoBlockIncoming() {
		return soBlockIncoming;
	}

	public void setSoBlockIncoming(String soBlockIncoming) {
		this.soBlockIncoming = soBlockIncoming;
	}

	public String getSoUnblockIncoming() {
		return soUnblockIncoming;
	}

	public void setSoUnblockIncoming(String soUnblockIncoming) {
		this.soUnblockIncoming = soUnblockIncoming;
	}

	public String getSoChangeSIMCard() {
		return soChangeSIMCard;
	}

	public void setSoChangeSIMCard(String soChangeSIMCard) {
		this.soChangeSIMCard = soChangeSIMCard;
	}	

}
