package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="cg_account")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Account {

	@NotNull(message="Account id is MAndotary")
	@Id
	@Column(name="cust_name", length=25)
	@Pattern(regexp="([A-Za-z]+) |([A-Zaz]+[ ] [A-Za-z]+)", message="allow only alphbaerts Aand a blank spaced is allowed")
	private String custName;
	
	@NotNull(message="Account id is MAndotary")
	@Min(value=1000,message="your opening amount must be rs.1000")
	private Double balance;

	public Account() {
		super();
	}

	public Account(
			@NotNull(message = "Account id is MAndotary") @Pattern(regexp = "([A-Za-z]+) |([A-Zaz]+[ ] [A-Za-z]+)", message = "allow only alphbaerts Aand a blank spaced is allowed") String custName,
			@NotNull(message = "Account id is MAndotary") @Min(value = 1000, message = "your opening amount must be rs.1000") Double balance) {
		super();
		this.custName = custName;
		this.balance = balance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	
}
