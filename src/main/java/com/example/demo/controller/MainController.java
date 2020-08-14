package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainService;
	
	@GetMapping("/")
    public String index(@RequestParam(value="order", required = false, defaultValue = "0") int order
    		, Model model) {
        
        model.addAttribute("lotto", mainService.getLottoInfo(order));
        
        return "index";
    }
}
