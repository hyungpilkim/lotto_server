package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lo_mst")  
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

	public LocalDateTime getRegDt() {
		return regDt;
	}

	public void setRegDt(LocalDateTime regDt) {
		this.regDt = regDt;
	}
	
	
}