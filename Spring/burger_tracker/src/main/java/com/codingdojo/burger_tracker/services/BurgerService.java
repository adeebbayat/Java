package com.codingdojo.burger_tracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.burger_tracker.models.Burger;
import com.codingdojo.burger_tracker.repositories.BurgerRepository;

@Service
public class BurgerService {
    
    private final BurgerRepository burgerRepository;

    public BurgerService(BurgerRepository burgerRepository){
        this.burgerRepository = burgerRepository;
    }

    // Find All
    public List<Burger> allBurgers(){
        return burgerRepository.findAll();
    }

    // Create Burger
    public Burger addBurger(Burger burger){
        return burgerRepository.save(burger);
    }

}
