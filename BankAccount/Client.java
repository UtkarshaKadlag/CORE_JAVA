package com.arrayofcontainmentobjects;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] carr=new Customer[3];
		CustomerArrayUtility.acceptCustomerDetails(carr);
		CustomerArrayUtility.displayCustDetails(carr);

	}

}
