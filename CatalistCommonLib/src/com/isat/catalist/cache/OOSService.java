package com.isat.catalist.cache;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class OOSService {

	private String serviceID;
	private String endPoint;
	private String process;
	private String system;
	private int maxRetry;
	private boolean generateOLI=false;
	private List<String> errorMessages;
	
	private final static Map<String,OOSService> data= new HashMap<String, OOSService>();
	
	public static synchronized OOSService getService(String svcID){
		if(data.size()==0){
			try {
				loadData();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data.get(svcID);
	}
	
	private static synchronized void loadData() throws NamingException, SQLException{
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("OosDS");
		Connection con = ds.getConnection();
		String sql="select * from OOS_MST_SERVICES";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		data.clear();
		while(rs.next()){
			String svcID = rs.getString("SVC_ID");
			String neType = rs.getString("NE_TYPE");
			String processType = rs.getString("PROCESS_TYPE");
			String endPoint = rs.getString("ENDPOINT");
			int maxRetry = rs.getInt("MAX_RETRY");
			boolean generateOLI = rs.getBoolean("GENERATE_OLI");
			
			OOSService svc = new OOSService();
			svc.setServiceID(svcID);
			svc.setProcess(processType);
			svc.setSystem(neType);
			svc.setEndPoint(endPoint);
			svc.setMaxRetry(maxRetry);
			svc.setGenerateOLI(generateOLI);

			sql =  "select * from OOS_MST_SERVICES_ERROR where SVC_ID='"+svcID+"'";
			Statement stmt2 = con.createStatement();
			ResultSet rs2 = stmt2.executeQuery(sql);
			List<String> maxR = new ArrayList<String>();
			while(rs2.next()){
				maxR.add(rs2.getString("ERROR_MESSAGE"));
			}
			rs2.close();
			stmt2.close();
			if(maxR.size()>0){
				svc.setErrorMessages(maxR);
			}
			
			data.put(svcID, svc);
			
		}
		
		rs.close();
		stmt.close();
		con.close();
	
	}

	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}

	public synchronized static void clearData() {
		// TODO Auto-generated method stub
		data.clear();
	}

	public int getMaxRetry() {
		return maxRetry;
	}

	public void setMaxRetry(int maxRetry) {
		this.maxRetry = maxRetry;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public boolean isGenerateOLI() {
		return generateOLI;
	}

	public void setGenerateOLI(boolean generateOLI) {
		this.generateOLI = generateOLI;
	}
}
