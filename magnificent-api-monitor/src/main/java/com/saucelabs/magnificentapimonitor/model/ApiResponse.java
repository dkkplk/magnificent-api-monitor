package com.saucelabs.magnificentapimonitor.model;

public class ApiResponse {

	String statusCode;
	String responseString;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getResponseString() {
		return responseString;
	}

	public void setResponseString(String responseString) {
		this.responseString = responseString;
	}

	@Override
	public String toString() {
		return "ApiResponse [statusCode=" + statusCode + ", responseString=" + responseString + "]";
	}

}
