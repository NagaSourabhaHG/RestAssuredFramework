package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.UserUpdateRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
	
	@Test
	public void updateProfileTest()
	{
		LoginRequest loginRequest = new LoginRequest("thanu1234","thanu1234");
		AuthService authService = new AuthService();
		Response response = authService.Login(loginRequest);
		LoginResponse loginresponse=response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("-------------------------------");
		
		UserProfileManagementService userpfms=new UserProfileManagementService();
		Response res=userpfms.getProfile(loginresponse.getToken());
		System.out.println(res.asPrettyString());
		UserProfileResponse userProfileResponse=res.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getEmail());
		
		System.out.println("-----------------------------");

		UserUpdateRequest userUpdatereq=new UserUpdateRequest.Builder().email("restapitesting@gmail.com").firstName("tara").build();
		Response resq = userpfms.updateProfile(loginresponse.getToken(),userUpdatereq);
		System.out.println(resq.asPrettyString());
		
		
	}

}
