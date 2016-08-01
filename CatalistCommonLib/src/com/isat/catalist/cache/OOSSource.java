package com.isat.catalist.cache;

import java.sql.*;
import java.util.*;
import javax.naming.*;
import javax.sql.*;

public class OOSSource
{
	private String sourceID;
	private String className;
	private String nsDeclare;

	private final static Map<String, OOSSource> constr = new HashMap<String, OOSSource>();

	public static synchronized void clearData()
	{
		constr.clear();
	}

	public static synchronized OOSSource getSource(String src)
	{
		if (constr.size() == 0)
		{
			try
			{
				loadData();
			}
			catch (NamingException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return constr.get(src);
	}

	private static synchronized void loadData() throws NamingException, SQLException
	{
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("OosDS");
		Connection con = ds.getConnection();
		String sql = "select * from OOS_MST_SOURCE";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		constr.clear();
		while (rs.next())
		{
			String srcID = rs.getString("SOURCE_ID");
			// String srcDesc = rs.getString("SOURCE_DESC");
			String className = rs.getString("CLASS_NAME");
			String nsDeclare = rs.getString("NS_DECLARE");
			OOSSource s = new OOSSource();
			s.setSourceID(srcID);
			s.setNsDeclare(nsDeclare);
			s.setClassName(className);
			constr.put(srcID, s);
		}

	}

	public String getSourceID()
	{
		return sourceID;
	}

	public void setSourceID(String sourceID)
	{
		this.sourceID = sourceID;
	}

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	public String getNsDeclare()
	{
		return nsDeclare;
	}

	public void setNsDeclare(String nsDeclare)
	{
		this.nsDeclare = nsDeclare;
	}
}
