package com.UsersApi.Request;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.UsersApi.BaseTest.BaseTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestAPI extends BaseTest {

	@Test(priority = 1, enabled = true)
	public void AddNewUser() {
		// RestAssured.baseURI = "https://reqres.in";
		RequestSpecification httpRequest = RestAssured.given();
		String body = "{\r\n" + "    \"name\": \"jeavio\",\r\n" + "    \"job\": \"QA\"\r\n" + "}";
		Response response = httpRequest.given().body(body).when().post("/api/users");

		int statusCode = response.getStatusCode();
		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /* actual value */, 201/* expected value */, "Correct status code returned");
	}

}
