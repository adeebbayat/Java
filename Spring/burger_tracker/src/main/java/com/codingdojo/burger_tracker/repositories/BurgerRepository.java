package com.codingdojo.burger_tracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.burger_tracker.models.Burger;

@Repository
public interface BurgerRepository extends CrudRepository<Burger,Long>{

    List<Burger> findAll();
    
} 