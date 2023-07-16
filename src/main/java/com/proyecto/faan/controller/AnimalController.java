package com.proyecto.faan.controller;

import com.proyecto.faan.controller.Generic.GenericControllerImpl;
import com.proyecto.faan.model.Alergias;
import com.proyecto.faan.model.Animal;
import com.proyecto.faan.service.AlergiasService;
import com.proyecto.faan.service.AnimalService;
import com.proyecto.faan.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
