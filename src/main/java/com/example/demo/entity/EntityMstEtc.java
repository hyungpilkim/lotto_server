package com.example.demo.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lo_mst_etc")  
public class EntityMstEtc{

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "_order")
	private int _order;
	
	@Column(name = "etc")
	private String etc;
	
	@Column(name = "total_sales_prc")
	private BigInteger totalSalesPrc;
	
	@Column(name = "pay_limit")
	private String payLimit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int get_order() {
		return _order;
	}

	public void set_order(int _order) {
		this._order = _order;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public BigInteger getTotalSalesPrc() {
		return totalSalesPrc;
	}

	public void setTotalSalesPrc(BigInteger totalSalesPrc) {
		this.totalSalesPrc = totalSalesPrc;
	}

	public String getPayLimit() {
		return payLimit;
	}

	public void setPayLimit(String payLimit) {
		this.payLimit = payLimit;
	}
	
	
}