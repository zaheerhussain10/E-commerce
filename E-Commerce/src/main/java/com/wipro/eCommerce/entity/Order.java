package com.wipro.eCommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class Order  {

    @Id
    private int id;

    private String date;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    public Order() {
		
	}
    
    
	public Order(int id, String date, Customer customer) {
		super();
		this.id = id;
		this.date = date;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
    
    

}
