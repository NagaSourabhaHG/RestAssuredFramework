package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{
	
	private static final String BASE_PATH="/api/auth/";
	
	public Response Login(LoginRequest payLoad) {
		
		return postRequest(BASE_PATH+"login",payLoad);
		
	}
	
	public Response forgetPassword(String emailAdress)
	{
		HashMap<String,String> payload=new HashMap<String,String>();
		payload.put("email", emailAdress);
		return postRequest(BASE_PATH+"forgot-password",payload);
	}
	public Response signUp(SignUpRequest payload)
	{
		return postRequest(BASE_PATH+"signup",payload);
	}

}
