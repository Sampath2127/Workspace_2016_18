package com.lovecoding.testJDBC;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ConcurrentModificationException;

public class TestJDBC {

	public static void main(String[] args) {
	
		String sqlQuery="SELECT PDC.AMOUNT, PDC.MEMBER_CODE FROM PRICE_DISCOUNT_CONFIG PDC, MEMBER_SUBTYPE MS, SERVICE_OFFICE SO, PRODUCT_TYPE PT "
				+ "WHERE PDC.MEMBER_SUBTYPE_ID = MS.MEMBER_SUBTYPE_ID AND "
				+ "MS.MEMBER_SUBTYPE_CODE = ? AND "
				+ "PDC.SERVICE_OFFICE_ID = SO.SERVICE_OFFICE_ID AND "
				+ "SO.SERVICE_OFFICE_CODE = ? AND "
				+ "PDC.PRODUCT_TYPE_ID = PT.PRODUCT_TYPE_ID AND "
				+ " PT.PRODUCT_TYPE_NAME = ?";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@weroranp-scan.us.int.rci.com:1521/ods2db_soa_online.us.int.rci.com","odspricing","odspricing");
			PreparedStatement stmt = con.prepareStatement(sqlQuery);
			stmt.setString(1, "SVCS");
			stmt.setString(2, "US");
			stmt.setString(3, "ExtraVacation");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
			System.out.println(new BigDecimal(rs.getInt(1)));
			System.out.println();
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error in getting data from PRICE_DISCOUNT_CONFIG :"+e.getMessage());
		}  

	}

}
