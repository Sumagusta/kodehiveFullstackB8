package com.kodehive.technokhb10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BerandaController {

	@RequestMapping("/beranda/home")
	public String home() {
		return "/home/page";
	}
	
	
}
