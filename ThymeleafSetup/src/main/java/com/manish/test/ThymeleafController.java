package com.manish.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
	
	@GetMapping("/getThymeleaf")
	public String getThymeleafPage(Model model) {
		model.addAttribute("message","Welcome to Thymeleaf");
		return "thymeleafPage";
	}
	
}
