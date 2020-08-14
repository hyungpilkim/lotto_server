package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.EntityMst;
import com.example.demo.repository.dsl.MainCustomRepository;

@SpringBootTest
class MainRepositoryTest {
	
	@Autowired 
	com.example.demo.repository.EntityMstRepository EntityMstRepository;
	
	@Autowired
	MainCustomRepository mainCustomRepository;
	@Test
	void contextLoads() {
		EntityMst entity = new EntityMst();
		
		EntityMstRepository.save(entity);
//		List<MainDto> result = (List<MainDto>) mainCustomRepository.listBookRentalByBookId();
//		for (EntityMstEtc m : result) {
//			System.out.print(m.toString());
//		}
	}

}
