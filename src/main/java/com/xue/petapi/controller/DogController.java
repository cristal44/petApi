package com.xue.petapi.controller;

import com.xue.petapi.model.Dog;
import com.xue.petapi.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping("/dogs")
    public List<Dog> getDogs() {
        return dogService.getAllJobInfo();
    }

    public Dog getDog() {
        return null;
    }

    public Dog updateDog() {
        return null;
    }

    public boolean deleteDog() {
        return true;
    }
}
