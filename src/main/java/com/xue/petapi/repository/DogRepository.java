package com.xue.petapi.repository;

import com.xue.petapi.model.Dog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DogRepository {

    public List<Dog> getAllDogs() {
        Dog dog1 = new Dog(1, "Hunter", "Male", 1);
        Dog dog2 = new Dog(2, "Amy", "Female", 2);

        return List.of(dog1, dog2);
    }

    public Dog getDogById() {
        return null;
    }

    public Dog updateDog() {
        return null;
    }

    public boolean deleteDog() {
        return true;
    }

}
