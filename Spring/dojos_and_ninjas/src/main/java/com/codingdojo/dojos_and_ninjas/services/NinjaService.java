package com.codingdojo.dojos_and_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojos_and_ninjas.models.Ninja;
import com.codingdojo.dojos_and_ninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
    
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository){
        this.ninjaRepository = ninjaRepository;
    }

    // Find All
    public List<Ninja> allNinjas(){
        return ninjaRepository.findAll();
    }

    // Create Ninja
    public Ninja addNinja(Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    // Find Ninja
    public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		}
		return null;
	}
	// Update Ninja
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}

    // Delete Ninja
    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }
}
