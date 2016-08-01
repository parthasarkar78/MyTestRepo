package com.isat.catalist.oms.exception;

public class TransformationException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public TransformationException(String string) 
	{
		super(string);
	}

	public TransformationException(Exception e) 
	{
		super(e);
	}
}
