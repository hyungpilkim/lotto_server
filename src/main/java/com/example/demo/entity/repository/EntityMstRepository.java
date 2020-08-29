package com.example.demo.entity.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EntityMst;

@Repository
public interface EntityMstRepository extends CrudRepository<EntityMst, Long> {
}
