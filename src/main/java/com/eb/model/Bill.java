package com.eb.model;

public class Bill {

	int bill_id;
	int customer_id ;
	int reading_id ;
	String bill_date;
	String bill_due_date;
	float bill_amount;
	public int getBill_id() {
		return bill_id;
	}
	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getReading_id() {
		return reading_id;
	}
	public void setReading_id(int reading_id) {
		this.reading_id = reading_id;
	}
	public String getBill_date() {
		return bill_date;
	}
	public void setBill_date(String bill_date) {
		this.bill_date = bill_date;
	}
	public String getBill_due_date() {
		return bill_due_date;
	}
	public void setBill_due_date(String bill_due_date) {
		this.bill_due_date = bill_due_date;
	}
	public float getBill_amount() {
		return bill_amount;
	}
	public void setBill_amount(float bill_amount) {
		this.bill_amount = bill_amount;
	}
	
	
}
