package com.app.CustomException;

public class AuthorizationException extends RuntimeException
{
	public AuthorizationException(String msg)
	{
		super(msg);
	}
}
