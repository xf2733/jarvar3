package com.hand.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Payment {
	
	private Integer payment_id;
	private Integer customer_id;
	private Integer staff_id;
	private Integer rental_id;
	private BigDecimal amount;
	private Timestamp payment_date;
	private Timestamp last_update;
	public Integer getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(Integer payment_id) {
		this.payment_id = payment_id;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}
	public Integer getRental_id() {
		return rental_id;
	}
	public void setRental_id(Integer rental_id) {
		this.rental_id = rental_id;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Timestamp getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Timestamp payment_date) {
		this.payment_date = payment_date;
	}
	public Timestamp getLast_update() {
		return last_update;
	}
	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}
	
}

