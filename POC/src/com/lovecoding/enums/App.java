package com.lovecoding.enums;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String clubType=scr.next();
		boolean isValidHolidayInn=testIsHolidayClub(clubType);
		System.out.println(isValidHolidayInn);
	}

	private static boolean testIsHolidayClub(String clubType) {
		boolean isHolidayInnClubType=false;
		
		Properties clubProp = new Properties();
		
		String memberShipTypes[]=null;
		
		try {
			File file=new File("C:/Users/c18477/Desktop/myworkSpace/POC/src/test.properties");
			InputStream fileReader=new FileInputStream(file);
			clubProp.load(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		memberShipTypes=clubProp.getProperty("HIVCMembershipTypes").split(",");
		for(String memberShipType:memberShipTypes){
		if(clubType.equals(memberShipType)){
			isHolidayInnClubType=true;
			break;
		}
		}
		
		return isHolidayInnClubType;
		
	}

}
