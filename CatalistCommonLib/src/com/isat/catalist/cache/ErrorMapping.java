package com.isat.catalist.cache;

import java.util.*;

public class ErrorMapping 
{
	private String errorMsg;
	private String originalError;
	private String[] mappingVariables;
	private int priority;
	
	private final static List<ErrorMapping> errorMapping=new ArrayList<ErrorMapping>();
	
//	private static synchronized void loadData() throws NamingException, SQLException{
//		Context context = new InitialContext();
//		DataSource ds = (DataSource) context.lookup("OosDS");
//		Connection con = ds.getConnection();
//		String sql="select * from OOS_MST_ERROR_MAP order by priority_check asc";
//		Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery(sql);
//		errorMapping.clear();
//		while(rs.next()){
//			ErrorMapping map = new ErrorMapping();
//			map.setErrorMsg(rs.getString("MAP_ERROR_MSG"));
//			map.setOriginalError(rs.getString("ERROR_ORIGIN"));
//			map.setPriority(rs.getInt("PRIORITY_CHECK"));
//			errorMapping.add(map);
//		}
//		
//		rs.close();
//		stmt.close();
//		con.close();	
//	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getOriginalError() {
		return originalError;
	}

	public void setOriginalError(String originalError) {
		this.originalError = originalError;
	}

	public String[] getMappingVariables() {
		return mappingVariables;
	}

	public void setMappingVariables(String[] mappingVariables) {
		this.mappingVariables = mappingVariables;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public static List<ErrorMapping> getErrorMapping() {
		return errorMapping;
	}
	
	
}
