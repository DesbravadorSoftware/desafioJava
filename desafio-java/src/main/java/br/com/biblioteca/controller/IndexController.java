package br.com.biblioteca.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String home(Model model, HttpServletRequest httpServletRequest) {
		return "index";
	}
}
