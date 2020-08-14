package com.example.demo.repository.dsl;

import java.math.BigInteger;
import java.util.List;

public class MainDto {
	private int _order;
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	private int num6;
	private int num7;
	private String winDate;
	
	private String etc;
	private BigInteger totalSalesPrc;
	private String payLimit;
	
	private List<MainDtoGradeInfo> gradeList;

	public int get_order() {
		return _order;
	}

	public void set_order(int _order) {
		this._order = _order;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}

	public int getNum5() {
		return num5;
	}

	public void setNum5(int num5) {
		this.num5 = num5;
	}

	public int getNum6() {
		return num6;
	}

	public void setNum6(int num6) {
		this.num6 = num6;
	}

	public int getNum7() {
		return num7;
	}

	public void setNum7(int num7) {
		this.num7 = num7;
	}

	public String getWinDate() {
		return winDate;
	}

	public void setWinDate(String winDate) {
		this.winDate = winDate;
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

	public List<MainDtoGradeInfo> getGradeList() {
		return gradeList;
	}

	public void setGradeList(List<MainDtoGradeInfo> gradeList) {
		this.gradeList = gradeList;
	}
}
