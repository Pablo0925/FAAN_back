package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "fichasMedicas")
public class FichaMedica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFichaMedica")
    private Integer idFichaMedica;

    @Column(name = "descripcionFichaMedica")
    private String descripcionFichaMedica;

    @JsonIgnore
    @OneToMany(mappedBy = "fichaMedica")
    private List<Animal> animals;
}
