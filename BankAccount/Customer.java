package com.arrayofcontainmentobjects;

public class Customer {
	
	private String custid;
	private String name;
	private Account account;
	
	public Customer(String custid,String name,Account account)
	{
		this.custid=custid;
		this.name=name;
		this.account=account;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id-"+this.custid+
				" Name-"+this.name+
				account.toString();
	}

}
