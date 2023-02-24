package com.eb.model;

public class Meter_readings {
	
	int reading_id ;
	int customer_id ;
	String reading_date;
	int reading_value;
	public int getReading_id() {
		return reading_id;
	}
	public void setReading_id(int reading_id) {
		this.reading_id = reading_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getReading_date() {
		return reading_date;
	}
	public void setReading_date(String reading_date) {
		this.reading_date = reading_date;
	}
	public int getReading_value() {
		return reading_value;
	}
	public void setReading_value(int reading_value) {
		this.reading_value = reading_value;
	}
	
	

}
