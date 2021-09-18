package com.saucelabs.magnificentapimonitor.service;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.saucelabs.magnificentapimonitor.model.ApiResponse;

@Service
public class ApiService {

	private static final Duration REQUEST_TIMEOUT = Duration.ofSeconds(3);

	@Autowired
	private WebClient webClient;

	public ApiResponse getApiResponse() {
		return webClient.get()
				.uri("https://api.us-west-1.saucelabs.com/v1/magnificent/").retrieve()
				.bodyToMono(ApiResponse.class).block(REQUEST_TIMEOUT);
	}

}
