package com.proyecto.faan.controller;

import com.proyecto.faan.controller.Generic.GenericControllerImpl;
import com.proyecto.faan.model.Animal;
import com.proyecto.faan.peyload.PeyloadNumeroAdopcionFecha;
import com.proyecto.faan.peyload.PeyloadNumeroAdopcionRaza;
import com.proyecto.faan.service.AnimalService;
import com.proyecto.faan.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/animal")
public class AnimalController extends GenericControllerImpl<Animal, Integer> {
    @Autowired
    private AnimalService animalService;
    @Override
    protected GenericService<Animal, Integer> getService() {
        return animalService;
    }

    @GetMapping("/lista/PeyloadNumeroAdopcionRaza")
    public List<PeyloadNumeroAdopcionRaza> obtenerLista() {
        return animalService.findByAnimalPeyload();
    }

    @GetMapping("/lista/PeyloadNumeroAdopcionFecha")
    public List<PeyloadNumeroAdopcionFecha> findByAnimalPeyloadFechaAdopcion() {
        return animalService.findByAnimalPeyloadFechaAdopcion();
    }
}
