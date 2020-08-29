package com.example.demo.entity.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EntityMstSup;

@Repository
public interface EntityMstSupRepository extends CrudRepository<EntityMstSup, Long> {
}
