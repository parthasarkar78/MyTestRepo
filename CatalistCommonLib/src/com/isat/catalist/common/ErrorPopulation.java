package com.isat.catalist.common;


public  class ErrorPopulation {

	public static String getErrorMessage(Throwable t){
		StringBuffer msg = new StringBuffer();
		String _ms =t.getClass().getName()+":"+t.getMessage();

		if(_ms.contains("com.isat.catalist")){
			return _ms;
		}
		
		msg.append(_ms+"\n");
		StackTraceElement[] stackTrace = t.getStackTrace();
		for(StackTraceElement s:stackTrace){
			if( s.getClassName().startsWith("com.isat.catalist") || s.getClassName().contains("SQLException")){
				msg.append(s.getClassName()+"."+ s.getMethodName()+"("+s.getLineNumber()+")\n");
			}
		
		}
		do{
			Throwable caused = t.getCause();
			if(caused!=null){
				String _msg = "Caused By : "+caused.getClass().getName()+":"+caused.getMessage();
				if(_msg.contains("GAPI-") || _msg.contains("com.isat.catalist") || _msg.contains("ORA-")){
					return _msg;
				}
				msg.append(_msg+"\n");
				StackTraceElement[] st = caused.getStackTrace();
				for(StackTraceElement s:st){
					if( s.getClassName().startsWith("com.isat.catalist")){
						msg.append(s.getClassName()+"."+ s.getMethodName()+"("+s.getLineNumber()+")\n");
					}
				
				}			
				t=caused;
			}else{
				break;
			}
		}while(true);
		return msg.toString();
	}
}
