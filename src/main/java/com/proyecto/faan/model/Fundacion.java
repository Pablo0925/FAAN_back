package com.proyecto.faan.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "fundaciones")
public class Fundacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFudacion")
    private Integer idFudacion;

    @Column(name = "ruc")
    private String ruc;

    @Column(name = "nombreFundacion")
    private String nombreFundacion;

    @Column(name = "eslogan")
    private String eslogan;

    @Column(name = "objetivo")
    private String objetivo;

    @Column(name = "correo")
    private String correo;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "paginaWeb")
    private String paginaWeb;

    @Column(name = "horarios")
    private String horarios;

}
