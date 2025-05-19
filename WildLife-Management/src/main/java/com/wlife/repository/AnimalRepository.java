package com.wlife.repository;

import org.springframework.data.repository.CrudRepository;

import com.wlife.modal.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Integer>{

}
