package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.MainService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {
	@Autowired
	private MainService mainService;
	
	@GetMapping("/result")
    public String result(@RequestParam(value="order", required = false, defaultValue = "0") int order
    		, Model model) {
        
		log.debug("order : " + order);
        model.addAttribute("lotto", mainService.getLottoInfo(order));
        
        return "result";
    }
	
	@GetMapping("/generator")
    public String generator(@RequestParam(value="order", required = false, defaultValue = "0") int order
    		, Model model) {
        return "generator";
    }
}
