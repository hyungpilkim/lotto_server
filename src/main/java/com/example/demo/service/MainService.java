package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.dsl.MainCustomRepository;
import com.example.demo.repository.dsl.MainDto;

@Service
public class MainService {
	
	@Autowired
	MainCustomRepository mainCustomRepository;
	
	public MainDto getLottoInfo(int drwNo) {
		return mainCustomRepository.getLottoInfo(drwNo);
	}
}
