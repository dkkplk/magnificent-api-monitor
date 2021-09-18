package com.saucelabs.magnificentapimonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saucelabs.magnificentapimonitor.model.ApiResponse;
import com.saucelabs.magnificentapimonitor.model.StatusReport;
import com.saucelabs.magnificentapimonitor.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService apiService;

	@GetMapping("/statusreport")
	public StatusReport getStatusReport() {
		ApiResponse apiResponse = apiService.getApiResponse();
		System.out.println(apiResponse);
		StatusReport statusReport = new StatusReport(1, 10, 1, 1, true);
		return statusReport;
	}

}
