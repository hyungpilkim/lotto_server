package com.example.demo.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MainDto;
import com.example.demo.entity.EntityUser;
import com.example.demo.entity.repository.EntityUserRepository;
import com.example.demo.repository.MainCustomRepository;
import java.time.LocalDateTime;


@Service
public class MainService {
	
	@Autowired
	MainCustomRepository mainCustomRepository;
	
	@Autowired
	EntityUserRepository userRepository;
	
	public MainDto.LottoInfo getLottoInfo(int drwNo) {
		return mainCustomRepository.getLottoInfo(drwNo);
	}
	
	
	public EntityUser regAndInfo(String deviceToken, String deviceType) {
		Optional<EntityUser> result = userRepository.findById(deviceToken);
		EntityUser entity = null;
		if (!result.isPresent()) {
			entity = new EntityUser();
			entity.setDeviceToken(deviceToken);
			entity.setDeviceType(deviceType);
			entity.setAgreeYn("N");
			LocalDateTime date  = LocalDateTime.now();
			entity.setRegDt(date);
			
			userRepository.save(entity);
		} else {
			entity = result.get();
		}
		
		return entity;
	}
	
	public EntityUser updateUserInfo(String deviceToken, String deviceType, String agreeYn) {
		
		Optional<EntityUser> result = userRepository.findById(deviceToken);
		EntityUser entity = null;
		if (result.isPresent()) {
			entity = new EntityUser();
			entity.setDeviceToken(deviceToken);
			entity.setDeviceType(deviceType);
			entity.setAgreeYn(agreeYn);
			entity.setRegDt(result.get().getRegDt());
			userRepository.save(entity);
		} 
		
		return entity;
	}
}
