package com.Google.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Google.amazon.service.ProductService;


@Controller
public class IndexController {

	@Autowired
	private ProductService productService;

	@GetMapping("/home")
	public String index(Model model) {
		model.addAttribute("products", productService.retriveInitialProducts());
		return "index";
	}
}
