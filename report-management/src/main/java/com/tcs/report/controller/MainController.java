package com.tcs.report.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	private Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/")
	public String home() {
		
		LOGGER.debug("Inside home().");
		return "home";
		
	}

}
