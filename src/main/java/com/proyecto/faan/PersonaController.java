package com.proyecto.faan;

import com.proyecto.faan.controller.GenericControllerImpl;
import com.proyecto.faan.model.Persona;
import com.proyecto.faan.service.PersonaService;
import com.proyecto.faan.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
public class PersonaController extends GenericControllerImpl<Persona, Integer> {
    @Autowired
    private PersonaService personaService;
    @Override
    protected GenericService<Persona, Integer> getService() {
        return personaService;
    }
}
