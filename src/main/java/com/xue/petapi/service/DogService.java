package com.xue.petapi.service;

import com.xue.petapi.model.Dog;
import com.xue.petapi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public List<Dog> getAllJobInfo() {
        return dogRepository.getAllDogs();
    }
}
