package com.example.demo.repository.dsl;

import java.math.BigInteger;
import java.util.List;

import com.example.demo.entity.EntityMst;
import com.example.demo.entity.EntityMstEtc;
import com.example.demo.entity.EntityMstSup;

public class MainDtoGradeInfo {
	private int rank;
	private BigInteger winPrc;
	private int winCnt;
	private BigInteger winPrcGm;
	private String winRule;
	
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
