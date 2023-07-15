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
@Table(name = "animales")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAnimal")
    private Integer idAnimal;

    @Column(name = "nombreAnimal", length = 255)
    private String nombreAnimal;

    @Column(name = "fotoAnimal")
    private String fotoAnimal;

    @Column(name = "edadAnimal")
    private Integer edadAnimal;

    @Column(name = "estadoAnimal")
    private String estadoAnimal;

    @ManyToOne
    @JoinColumn(name = "idRazaAnimal", referencedColumnName = "idRazaAnimal")
    private RazaAnimal razaAnimal;

    @ManyToOne
    @JoinColumn(name = "idFichaRegistro", referencedColumnName = "idFichaRegistro")
    private FichaRegistro fichaRegistro;

    @ManyToOne
    @JoinColumn(name = "idFichaMedica", referencedColumnName = "idFichaMedica")
    private FichaMedica fichaMedica;

    @JsonIgnore
    @OneToMany(mappedBy = "idAdopcion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetalleAdopcion> listaDetalle;

    //Referencia al detalle de adopcion..
    /*@JsonIgnore
    @OneToMany(mappedBy = "detalleAdopcion")
    private List<DetalleAdopcion> detalleAdopcion;*/
}