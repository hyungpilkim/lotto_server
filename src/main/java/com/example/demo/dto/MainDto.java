package com.example.demo.dto;

import java.math.BigInteger;
import java.util.List;



public class MainDto {
	public static class LottoInfo {
		private int lastOrder;
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

		public int getLastOrder() {
			return lastOrder;
		}

		public void setLastOrder(int lastOrder) {
			this.lastOrder = lastOrder;
		}
		
		public String getCssColr(int num) {
			if (num >= 0 && num <= 10)
				return "ball1";
			
			if (num >= 11 && num <= 20)
				return "ball2";
			
			if (num >= 21 && num <= 30)
				return "ball3";
			
			if (num >= 31 && num <= 40)
				return "ball4";
			
			if (num >= 41 && num <= 45)
				return "ball5";
			
			return null;
		}
	}
	
	
	
	public static class MainDtoGradeInfo {
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
	
	public static class UserInfo {
		private String deviceToken;
		private String deviceType;
		private String agreeYn;
		private String regDt;
		public String getDeviceToken() {
			return deviceToken;
		}
		public void setDeviceToken(String deviceToken) {
			this.deviceToken = deviceToken;
		}
		public String getDeviceType() {
			return deviceType;
		}
		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}
		public String getAgreeYn() {
			return agreeYn;
		}
		public void setAgreeYn(String agreeYn) {
			this.agreeYn = agreeYn;
		}
		public String getRegDt() {
			return regDt;
		}
		public void setRegDt(String regDt) {
			this.regDt = regDt;
		}
	}
}
