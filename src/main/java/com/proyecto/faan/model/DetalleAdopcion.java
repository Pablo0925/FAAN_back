/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.faan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LaptopSA
 */
@Setter
@Getter
@Entity
@Table(name = "DetalleAdopcion")
public class DetalleAdopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAdopcion")
    private Integer idAdopcion;

    @Column(name = "observacion")
    private String observacion;

    @Column(name = "documento")
    private String documento;

    @ManyToOne
    @JoinColumn(name = "idEncabezadoAdopcion", referencedColumnName = "idEncabezadoAdopcion")
    private EncabezadoAdopcion encabezadoAdopcion;

    @ManyToOne
    @JoinColumn(name = "idAnimal", referencedColumnName = "idAnimal")
    private Animal animal;

	
    
    //Getter
    public Integer getIdAdopcion() {
		return idAdopcion;
	}

	public void setIdAdopcion(Integer idAdopcion) {
		this.idAdopcion = idAdopcion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public EncabezadoAdopcion getEncabezadoAdopcion() {
		return encabezadoAdopcion;
	}

	public void setEncabezadoAdopcion(EncabezadoAdopcion encabezadoAdopcion) {
		this.encabezadoAdopcion = encabezadoAdopcion;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
