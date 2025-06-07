package com.api.base;

import static io.restassured.RestAssured.given;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	private static final String BASE_URL="http://64.227.160.186:8080";
	private RequestSpecification requestspecification;
	
	static 
	{
		RestAssured.filters(new LoggingFilter());
	}
	
	public BaseService()
	{
		requestspecification=given().baseUri(BASE_URL);
	}
	
	protected Response postRequest(String endPoint,Object payload)
	{
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endPoint);
		
	}
	protected Response putRequest(String endPoint,Object payload)
	{
		return requestspecification.contentType(ContentType.JSON).body(payload).put(endPoint);
		
	}

	protected Response getRequest(String endPoint)
	{
		return requestspecification.get(endPoint);
		
	}
	protected void setToken(String token)
	{
		requestspecification.header("Authorization","Bearer "+ token);
	}

}
