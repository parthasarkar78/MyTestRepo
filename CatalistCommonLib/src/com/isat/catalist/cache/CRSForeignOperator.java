//test repor2
//test repo3
//test repo4

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

public class CRSForeignOperator {
	private String operatorId;
	private String operatorName;
	private static final Map<String,CRSForeignOperator> foreignOperators= new HashMap<String, CRSForeignOperator>();

	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	
	
	public static synchronized void clearData(){
		foreignOperators.clear();
	}
	
	public static synchronized CRSForeignOperator getForeignOperator(String operatorId){
		if(foreignOperators.size()==0){
			try {
				loadData();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}			
		}
		
		CRSForeignOperator data = null;
		int i=5;
		int len = operatorId.length();
		do{
			String prefix = operatorId.replaceFirst("^62","").substring(0,i);
			data	= foreignOperators.get(prefix);
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
		String sql="select * from CRS_FOREIGN_OPERATOR";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while(rs.next()){
			String opid = rs.getString("OPERATOR_ID");
			String opname = rs.getString("OPERATOR_NAME");
			CRSForeignOperator opr = new CRSForeignOperator();
			opr.setOperatorId(opid);
			opr.setOperatorName(opname);
			foreignOperators.put(opid, opr);
		}
		
		
		rs.close();
		stmt.close();
		con.close();

	}

}
