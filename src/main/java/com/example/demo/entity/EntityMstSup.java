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
@Table(name="lo_mst_sup")  
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public BigInteger getWinPrc() {
		return winPrc;
	}

	public void setWinPrc(BigInteger winPrc) {
		this.winPrc = winPrc;
	}

	public int getWinCnt() {
		return winCnt;
	}

	public void setWinCnt(int winCnt) {
		this.winCnt = winCnt;
	}

	public BigInteger getWinPrcGm() {
		return winPrcGm;
	}

	public void setWinPrcGm(BigInteger winPrcGm) {
		this.winPrcGm = winPrcGm;
	}

	public String getWinRule() {
		return winRule;
	}

	public void setWinRule(String winRule) {
		this.winRule = winRule;
	}

	
	
}