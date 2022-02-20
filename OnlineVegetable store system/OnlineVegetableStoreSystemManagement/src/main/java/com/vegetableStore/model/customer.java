package com.vegetableStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class customer {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private long customerId;
	
	@Column(name="customer_name")
	private String customername;
	
	@Column(name="customer_address")
	private long customeraddress;
	
	@Column(name="customer_email")
	private String customeremail;
	
	@Column(name="customer_mobile")
	private float customermobile;
	
	@Column(name="customer_pass")
	private int customerpass;
	
	
	
	public customer() {
		// TODO Auto-generated constructor stub
	}



	public customer(String customername, long customeraddress, String customeremail, float customermobile,
			int customerpass) {
		super();
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.customeremail = customeremail;
		this.customermobile = customermobile;
		this.customerpass = customerpass;
	}




	public long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}



	public String getCustomername() {
		return customername;
	}



	public void setCustomername(String customername) {
		this.customername = customername;
	}



	public long getCustomeraddress() {
		return customeraddress;
	}



	public void setCustomeraddress(long customeraddress) {
		this.customeraddress = customeraddress;
	}



	public String getCustomeremail() {
		return customeremail;
	}



	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}



	public float getCustomermobile() {
		return customermobile;
	}



	public void setCustomermobile(float customermobile) {
		this.customermobile = customermobile;
	}



	public int getCustomerpass() {
		return customerpass;
	}



	public void setCustomerpass(int customerpass) {
		this.customerpass = customerpass;
	}



	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customername=" + customername + ", customeraddress="
				+ customeraddress + ", customeremail=" + customeremail + ", customermobile=" + customermobile
				+ ", customerpass=" + customerpass + "]";
	}

}
