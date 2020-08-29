package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MainDto;
import com.example.demo.repository.MainCustomRepository;



@Service
public class MainService {
	
	@Autowired
	MainCustomRepository mainCustomRepository;
	
	public MainDto.LottoInfo getLottoInfo(int drwNo) {
		return mainCustomRepository.getLottoInfo(drwNo);
	}
}
