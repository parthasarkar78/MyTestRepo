package com.isat.catalist.oms.exception;

public class SendingResponseOrderException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public SendingResponseOrderException() 
	{
		super();
	}

	public SendingResponseOrderException(String message) 
	{
		super(message);
	}

	public SendingResponseOrderException(Throwable cause) 
	{
		super(cause);
	}
}
