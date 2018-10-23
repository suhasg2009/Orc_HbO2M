package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Transaction_Details")
public class TransactionDetails {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int txId;
@OneToMany
private Collection<Customer>cs=new ArrayList<Customer>();

//@OneToOne
//private Customer customer;

public Collection<Customer> getCs() {
	return cs;
}
public void setCs(Collection<Customer> cs) {
	this.cs = cs;
}
//public Customer getCustomer() {
	//return customer;
//}
//public void setCustomer(Customer customer) {
	//this.customer = customer;
//}
public int getTxId() {
	return txId;
}
public void setTxId(int txId) {
	this.txId = txId;
}
public String getTxName() {
	return txName;
}
public void setTxName(String txName) {
	this.txName = txName;
}
private String txName;




	

}
