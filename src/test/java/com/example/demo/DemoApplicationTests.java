package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.EntityMstEtc;
import com.example.demo.entity.repository.EntityMstEtcRepository;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	EntityMstEtcRepository entityMstEtcRepository;
	@Test
	void contextLoads() {
		List<EntityMstEtc> result = (List<EntityMstEtc>) entityMstEtcRepository.findAll();
		for (EntityMstEtc m : result) {
			System.out.print(m.toString());
		}
	}

}
