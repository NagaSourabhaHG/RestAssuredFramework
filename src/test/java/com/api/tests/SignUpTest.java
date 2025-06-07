package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;
import com.api.models.request.SignUpRequest.Builder;

import io.restassured.response.Response;

public class SignUpTest {
	
	@Test(description="Checks in user creation is working fine")
	public void signUpTest()
	{
		
		SignUpRequest signupRequest=new SignUpRequest.Builder().
				username("Tom").
				lastname("kl").
				email("testingapii@gmail.com").
				firstname("dona").
				mobileNumber("123405678")
				.password("Test@1293").
				build();
		
		AuthService authservice=new AuthService();
		Response response=authservice.signUp(signupRequest);
		System.out.println(response.asPrettyString());
	}

}
