package com.UsersApi.Request;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.UsersApi.BaseTest.BaseTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestAPI extends BaseTest{

	@Test(priority = 1)
	public void GetUsersLists() {

		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.queryParam("page", 2).get();
		int statusCode = response.getStatusCode();
		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /* actual value */, 200/* expected value */, "Correct status code returned");
	}

	@Test(priority = 2)
	public void GetSingleUserDetails() {
		// RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/2");
		int statusCode = response.getStatusCode();
		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /* actual value */, 200/* expected value */, "Correct status code returned");
	}
}
