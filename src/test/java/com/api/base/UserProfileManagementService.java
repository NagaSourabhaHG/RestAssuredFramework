package com.api.base;

import com.api.models.request.UserUpdateRequest;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService{
	
	private final static String BASE_PATH="/api/users/";
	
	
	public Response getProfile(String token) {
		setToken(token);
		return getRequest(BASE_PATH+"profile");
	}
	
	public Response updateProfile(String token,UserUpdateRequest Payload) {
		setToken(token);
		return putRequest(BASE_PATH+"profile",Payload);
		
	}
	

}
