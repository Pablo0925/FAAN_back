package com.proyecto.faan.service;

import com.proyecto.faan.model.Animal;
import com.proyecto.faan.peyload.PeyloadNumeroAdopcionFecha;
import com.proyecto.faan.peyload.PeyloadNumeroAdopcionRaza;
import com.proyecto.faan.service.generic.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AnimalService extends GenericService<Animal, Integer> {
    List<PeyloadNumeroAdopcionRaza> findByAnimalPeyload();

    List<PeyloadNumeroAdopcionFecha> findByAnimalPeyloadFechaAdopcion();

    public Page<Animal> findByNombreAnimalOrPlacaAnimal(String filter, Pageable pageable);
}
