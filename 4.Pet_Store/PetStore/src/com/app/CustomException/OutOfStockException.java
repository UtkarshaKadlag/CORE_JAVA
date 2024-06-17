package com.app.CustomException;

public class OutOfStockException extends RuntimeException
{
	public OutOfStockException(String msg)
	{
		super(msg);
	}
}
