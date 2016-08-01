package com.isat.catalist.oms.exception;

public class OrderIsNotConfiguredException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public OrderIsNotConfiguredException(String message) 
	{
		super(message);
	}
}
