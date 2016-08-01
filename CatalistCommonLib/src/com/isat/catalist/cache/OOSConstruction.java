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

import com.indosat.catalist.oos.master.OOSOrderConstructionType;

public class OOSConstruction {

	private final static Map<String, List<OOSOrderConstructionType>> constr = new HashMap<String, List<OOSOrderConstructionType>>();
	
	public static synchronized List<OOSOrderConstructionType> getConstruction(String source, String orderType){
		if(constr.size()==0){
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
		
		return constr.get(source+orderType);
	}
	public static synchronized void clearData(){
		constr.clear();
	}
	private static synchronized void loadData() throws NamingException, SQLException{
		
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("OosDS");
		Connection con = ds.getConnection();
		String sql="select * from OOS_MST_ORDER_CONSTR where ENABLE_STEP=1 order by source,order_type,seq";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		constr.clear();
		while(rs.next()){
			String key = rs.getString("SOURCE")+rs.getString("ORDER_TYPE");
			List<OOSOrderConstructionType> order = constr.get(key);
			if(order==null){
				order = new ArrayList<OOSOrderConstructionType>();
				constr.put(key,order);
			}
			OOSOrderConstructionType co = OOSOrderConstructionType.Factory.newInstance();
			co.setHasOutput(rs.getBoolean("HAS_OUTPUT"));
			co.setServiceID(rs.getString("SVC_ID"));
			co.setSeqID(rs.getInt("SEQ"));
			

			co.setOrderType(rs.getString("ORDER_TYPE"));
			co.setSource(rs.getString("SOURCE"));
			co.setIgnoreError(rs.getBoolean("IGNORE_ERROR"));
			
			String dependSeqID = rs.getString("DPD_SEQ_ID");
			if(dependSeqID!=null && !"".equals(dependSeqID)){
				String[] seq = dependSeqID.split(",");
				for(String s:seq){
					co.addDependSeqID(Integer.parseInt(s));						
				}
			}
			String fields = rs.getString("MAPPING_FIELD");
			if(fields!=null && !"".equals(fields)){
				String[] lFields = fields.split(",");
				for(String f:lFields){
					co.addFieldMapping(f);
				}
			}
			
			String staticFields = rs.getString("CONST_FIELD");
			if(staticFields!=null && !"".equals(staticFields)){
				String[] lFields = staticFields.split(",");
				for(String f:lFields){
					co.addStaticField(f);
				}					
			}
			co.setClassName(rs.getString("CLASS_NAME"));

			
			String fetchOutput = rs.getString("FETCH_OUTPUT");
			
			if(fetchOutput!=null && !"".equals(fetchOutput)){
				String[] fetches = fetchOutput.split(",");
				co.setFetchOutputArray(fetches);
			}
			
			order.add(co);
		}
	}
}
