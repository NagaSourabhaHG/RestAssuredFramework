package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;
@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest {
	@Test(description="Tests if login works...")
	public void testLogin()
	
	
	{
		
		AuthService authservice=new AuthService();
		LoginRequest loginRequest = new LoginRequest("thanu1234","thanu1234");
		Response res=authservice.Login(loginRequest);
		
		System.out.println(res.asPrettyString());
		
		LoginResponse loginResponse = res.as(LoginResponse.class);
		
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getEmail());
		
		Assert.assertTrue(loginResponse.getToken()!=null,"Token is null");
		Assert.assertEquals(loginResponse.getEmail(),"testingapi@gmail.com");
		
	}
	
}
