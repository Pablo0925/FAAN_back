/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LaptopSA
 */
@Setter
@Getter
@Entity
@Table(name = "EncabezadoAdopcion")
public class EncabezadoAdopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEncabezadoAdopcion")
    private Integer idEncabezadoAdopcion;

    @Column(name = "fechaAdopcion")
    private LocalDate fechaAdopcion;

    @Column(name = "observacion")
    private String observacion;

    @JsonIgnore
    @OneToMany(mappedBy = "idEncabezadoAdopcion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Persona> listaPersonas;

    @JsonIgnore
    @OneToMany(mappedBy = "idEncabezadoAdopcion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DetalleAdopcion> listaDetalle;
}
