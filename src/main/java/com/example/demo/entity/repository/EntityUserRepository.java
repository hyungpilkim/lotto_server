package com.example.demo.entity.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EntityMstEtc;
import com.example.demo.entity.EntityUser;

@Repository
public interface EntityUserRepository extends CrudRepository<EntityUser, String> {
}
