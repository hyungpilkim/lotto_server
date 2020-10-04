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
@Table(name="lo_mst_sup")  
@Getter
@Setter
public class EntityMstSup{

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "_order")
	private int _order;
	
	@Column(name = "rank")
	private int rank;
	
	@Column(name = "win_prc")
	private BigInteger winPrc;
	
	@Column(name = "win_cnt")
	private int winCnt;
	
	@Column(name = "win_prc_gm")
	private BigInteger winPrcGm;
	
	@Column(name = "win_rule")
	private String winRule;
}