package com.lovecoding.rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class AssuredBasicDemo {

	@Test
	public void test() {
		//Create a Base URI or HOST
		RestAssured.baseURI="https://maps.googleapis.com";
		given().
				param("location=-33.8670522,151.1957362").
				param("radius=500").
				param("types=food").
				param("key=AIzaSyDzmp1Bse_nUYibL67_W8k0qWrXH9_vKeU").
				when().
				get("/maps/api/place/nearbysearch/json").
				then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
	}
	
	
}
