/**
 * 
 */
package com.doj.springapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh.Rajput
 *
 */
@Table
@Entity
public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id //PK
	//@GeneratedValue(strategy=GenerationType.AUTO)//PK//
	Long id;
	@Column
	Long balance;
	@Column
	String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", name=" + name + "]";
	}
	public Account(Long id) {
		super();
		this.id = id;
	}
	public Account() {
		super();
	}
	
}
