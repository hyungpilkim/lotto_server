package com.example.demo.entity.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EntityMstEtc;

@Repository
public interface EntityMstEtcRepository extends CrudRepository<EntityMstEtc, Long> {
}
