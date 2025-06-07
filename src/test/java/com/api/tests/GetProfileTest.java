package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileTest {
	
	
	@Test
	public void getProfileTest()
	{
		
		AuthService authService = new AuthService();
		LoginRequest loginRequest=new LoginRequest("thanu1234","thanu1234");
		Response response=authService.Login(loginRequest);
		LoginResponse loginresponse=response.as(LoginResponse.class);
		
		UserProfileManagementService userProfileManagement=new UserProfileManagementService();
		Response res=userProfileManagement.getProfile(loginresponse.getToken());
		System.out.println(res.asPrettyString());
		UserProfileResponse userProfileResponse=res.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getEmail());
	}

}
