package com.app.CustomException;

public class AuthenticationException extends RuntimeException
{
	public AuthenticationException(String msg)
	{
		super(msg);
	}
}
