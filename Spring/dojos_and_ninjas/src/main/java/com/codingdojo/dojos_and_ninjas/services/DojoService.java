package com.codingdojo.dojos_and_ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojos_and_ninjas.models.Dojo;
import com.codingdojo.dojos_and_ninjas.repositories.DojoRepository;


@Service
public class DojoService {
    
    private final DojoRepository dojoRepository;

    public DojoService(DojoRepository dojoRepository){
        this.dojoRepository = dojoRepository;
    }

    // Create Dojo
    public Dojo addDojo(Dojo dojo){
        return dojoRepository.save(dojo);
    }
    
    // Find All
    public List<Dojo> allDojos(){
        return dojoRepository.findAll();
    }


    // Find One Dojo
    public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		return null;
	}
	// Update Dojo
	public Dojo updateDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}

    // Delete Dojo
    public void deleteDojo(Long id) {
        dojoRepository.deleteById(id);
    }

    public Dojo addNewDojo(Dojo dojo) {
        return null;
    }
}
