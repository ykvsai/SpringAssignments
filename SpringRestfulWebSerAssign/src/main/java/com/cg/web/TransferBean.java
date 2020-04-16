package com.cg.web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class TransferBean {

	@NotNull(message="Account id is MAndotary")
	private Integer fromAccountId;
	
	@NotNull(message="Account id is MAndotary")
	private Integer toAccountId;
	
	@NotNull(message="Account id is MAndotary")
	@Min(value=1000,message="your opening amount must be rs.1000")
	@Max(value=50000,message="Can transfer maximum Rs.50000")
	private Double amt;
	
	public Integer getToAccountId() {
		return toAccountId;
	}

	public Integer getFromAccountId() {
		return fromAccountId;
	}

	public void setToAccountId(Integer toAccountId) {
		this.toAccountId = toAccountId;
	}

	public Double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

	public void setFromAccountId(Integer fromAccountId) {
		this.fromAccountId = fromAccountId;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	