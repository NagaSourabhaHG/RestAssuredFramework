package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter {

	public static final Logger logger = LogManager.getLogger(LoggingFilter.class);

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec);
		Response response = ctx.next(requestSpec, responseSpec);// Request is going to be executed
		logResponse(response);

		return response;//test for assertion 
	}

	public void logRequest(FilterableRequestSpecification requestSpec) {
		logger.info("BASE URI IS " + requestSpec.getBaseUri());
		logger.info("REQUEST HEADER " + requestSpec.getHeaders());
		logger.info("REQUEST PAYLOAD " + requestSpec.getBody());

	}

	public void logResponse(Response response) {
		
		logger.info("STATUS CODE IS  " + response.getStatusCode());
		logger.info("RESPONSE HEADER " + response.getHeaders());
        logger.info("RESPONSE BODY " + response.getBody().asPrettyString());


	}
}
