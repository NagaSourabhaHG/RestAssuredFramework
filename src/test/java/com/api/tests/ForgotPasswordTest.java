package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description="Tests if forgotPassword works fine")
	public void forgotPassword()
	{
		AuthService authservice=new AuthService();
		Response res=authservice.forgetPassword("testrestapi@gmail.com");
		System.out.println(res.asPrettyString());
		
	}

}
