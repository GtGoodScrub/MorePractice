package com.csis3275.controller_gwe_89;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomeController_gwe_89 {
	@GetMapping("/")
	public String renderHomePage() {
		return "homePage";
	}
}