package com.example.demo.entity;

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
@Table(name="lo_mst")  
@Getter
@Setter
public class EntityMst{
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "_order")
	private int _order;
	
	@Column(name = "num1")
	private int num1;
	
	@Column(name = "num2")
	private int num2;
	
	@Column(name = "num3")
	private int num3;
	
	@Column(name = "num4")
	private int num4;
	
	@Column(name = "num5")
	private int num5;
	
	@Column(name = "num6")
	private int num6;
	
	@Column(name = "num7")
	private int num7;
	
	@Column(name = "win_date")
	private String winDate;
	
	@Column(name = "reg_dt")
	private LocalDateTime regDt;
}