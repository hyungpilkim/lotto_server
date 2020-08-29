package com.example.demo.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MainDto;
import com.example.demo.service.MainService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class ApiMainController {
	@Autowired
	private MainService mainService;
	
	@GetMapping("/lotto")
    public MainDto.LottoInfo lotto(@RequestParam(value="order", required = false, defaultValue = "0") int order
    		, Model model) {
        
		log.debug("order : " + order);
        return mainService.getLottoInfo(order);
    }
}
