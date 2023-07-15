package com.proyecto.faan.repository;

import com.proyecto.faan.model.Alergias;
import com.proyecto.faan.model.Animal;
import com.proyecto.faan.repository.generic.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends GenericRepository<Animal,Integer> {
}
