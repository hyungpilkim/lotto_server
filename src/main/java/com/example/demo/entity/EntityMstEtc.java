package com.example.demo.entity;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="lo_mst_etc")  
@Getter
@Setter
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
}