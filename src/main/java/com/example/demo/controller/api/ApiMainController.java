package com.example.demo.controller.api;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MainDto;
import com.example.demo.entity.EntityUser;
import com.example.demo.service.MainService;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;

import antlr.StringUtils;
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

	
	@GetMapping("/regAndInfo")
    public EntityUser regAndInfo(@RequestParam(value="device_token", required = true) String deviceToken, 
    		@RequestParam(value="device_type", required = true) String deviceType) {
		
		return mainService.regAndInfo(deviceToken, deviceType);
    }
	
	@GetMapping("/updateUserInfo")
    public EntityUser updateUserInfo(@RequestParam(value="device_token", required = true) String deviceToken, 
    		@RequestParam(value="device_type", required = true) String deviceType,
    		@RequestParam(value="agreeYn", required = true) String agreeYn) {
		
		return mainService.updateUserInfo(deviceToken, deviceType, agreeYn);
    }
}
