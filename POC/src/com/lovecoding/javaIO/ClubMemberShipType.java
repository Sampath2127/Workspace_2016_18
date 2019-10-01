package com.lovecoding.javaIO;

import java.math.BigDecimal;

public class ClubMemberShipType {
	
	public static final String MEMBERSHIP_TYPE_SVCS;
	public static final String MEMBERSHIP_TYPE_SVCP;
	
	private ClubMemberShipType(){
		
	}
	
	static{
		MEMBERSHIP_TYPE_SVCS="SVCS";
		MEMBERSHIP_TYPE_SVCP="SVCP";	
	}

	public static void main(String[] args) {
//		ClubMemberShipType clubMemberShipType = new ClubMemberShipType();
		BigDecimal decimal1=new BigDecimal(20);
		BigDecimal decimal2=new BigDecimal(-200);
		System.out.println(decimal1.compareTo(decimal2));

	}
}
