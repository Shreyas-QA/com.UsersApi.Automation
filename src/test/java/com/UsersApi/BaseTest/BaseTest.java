package com.UsersApi.BaseTest;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseTest {

	@BeforeSuite
	public void setup() {

		RestAssured.baseURI = "https://reqres.in/api/users";
	}
}
