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
import com.example.demo.service.MainService;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;

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
	

	class response {
		result result = new result();
		payload payload = new payload();
		public result getResult() {
			return result;
		}
		public void setResult(result result) {
			this.result = result;
		}
		public payload getPayload() {
			return payload;
		}
		public void setPayload(payload payload) {
			this.payload = payload;
		}
		
	}
	
	class result {
		String code = "200";
		String message = "200";
		String response_time = "200";
		String request_action = "200";
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getResponse_time() {
			return response_time;
		}
		public void setResponse_time(String response_time) {
			this.response_time = response_time;
		}
		public String getRequest_action() {
			return request_action;
		}
		public void setRequest_action(String request_action) {
			this.request_action = request_action;
		}
		
	}
	
	class payload {
		String device_type= "200";
		String version_name= "200";
		String major= "200";
		String minor= "200";
		String bulid= "200";
		String description= "200";
		String reg_date= "200";
		public String getDevice_type() {
			return device_type;
		}
		public void setDevice_type(String device_type) {
			this.device_type = device_type;
		}
		public String getVersion_name() {
			return version_name;
		}
		public void setVersion_name(String version_name) {
			this.version_name = version_name;
		}
		public String getMajor() {
			return major;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		public String getMinor() {
			return minor;
		}
		public void setMinor(String minor) {
			this.minor = minor;
		}
		public String getBulid() {
			return bulid;
		}
		public void setBulid(String bulid) {
			this.bulid = bulid;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getReg_date() {
			return reg_date;
		}
		public void setReg_date(String reg_date) {
			this.reg_date = reg_date;
		}
		
	}
	
	
	
	@PostMapping("/version/app.do")
    public Map version(@RequestHeader MultiValueMap<String, String> headers, 
    		@RequestBody String device_type) {
		headers.forEach((key, value) -> {
			log.debug(String.format(
	          "Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));
	    });
		
		log.debug("param.toString() : " + device_type);
		Map resultMap = new HashMap();
		resultMap.put("response", new response());
        return resultMap;
    }
}
