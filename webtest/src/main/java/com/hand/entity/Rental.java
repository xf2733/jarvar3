package com.hand.entity;

import java.sql.Timestamp;

public class Rental {
	
	private Integer rental_id;
	private Timestamp rental_date;
	private Integer inventory_id;
	private Integer customer_id;
	private Timestamp return_date;
	private Integer staff_id;
	private Timestamp last_update;
	public Integer getRental_id() {
		return rental_id;
	}
	public void setRental_id(Integer rental_id) {
		this.rental_id = rental_id;
	}
	public Timestamp getRental_date() {
		return rental_date;
	}
	public void setRental_date(Timestamp rental_date) {
		this.rental_date = rental_date;
	}
	public Integer getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(Integer inventory_id) {
		this.inventory_id = inventory_id;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Timestamp getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Timestamp return_date) {
		this.return_date = return_date;
	}
	public Integer getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}
	public Timestamp getLast_update() {
		return last_update;
	}
	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}
	

}
