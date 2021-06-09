package com.aaroncards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	
	@RequestMapping("/pruebasifuncionaelwsaaroncards")
	public String pruebasifuncionaelwsaaroncards() {
		return "pruebasifuncionaelwsaaroncards";
	}
}
