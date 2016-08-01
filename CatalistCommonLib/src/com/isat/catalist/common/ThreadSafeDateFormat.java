package com.isat.catalist.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSafeDateFormat {
	
	private SimpleDateFormat sdf ;

	public ThreadSafeDateFormat(String pattern){
		sdf = new SimpleDateFormat(pattern);
	}
	
	public synchronized String format(Date date){
		return sdf.format(date);
	}
	
	public synchronized Date parse(String source) throws ParseException{
		return sdf.parse(source);
	}
}
