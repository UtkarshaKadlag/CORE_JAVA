package com.arrayofcontainmentobjects;

public class Account {
	
	private String accno;
	private double bal;
	private AccountType type;
	
	public Account(String accno,double bal,AccountType type)
	{
		this.accno=accno;
		this.bal=bal;
		this.type=type;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Accno-"+this.accno+
				" BAl-"+this.bal+
				" Type-"+this.type;
	}

}
