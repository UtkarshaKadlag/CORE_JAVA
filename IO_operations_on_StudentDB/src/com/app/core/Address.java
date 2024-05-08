package com.app.core;
import java.io.Serializable;
public class Address implements Serializable
{
	private String city,state,phoneNo;
	
	public Address(String city,String state, String phoneNo)
	{
		this.city=city;
		this.state=state;
		this.phoneNo=phoneNo;
	}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		@Override
		public String toString()
		{
			return "Address [ City :"+this.city+" State : "+this.state+" Phone no : "+this.phoneNo;
		}
}
