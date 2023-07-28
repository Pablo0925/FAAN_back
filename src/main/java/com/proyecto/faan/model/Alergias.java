/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.faan.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

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
@Table(name = "Alergias")
public class Alergias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAlergias")
    private Integer idAlergias;

    @Column(name = "fechaDeteccion")
    private LocalDate fechaDeteccion;

    @Column(name = "observacion")
    private String observacion;

    // RELATIONSHIP
    @ManyToOne
    @JoinColumn(name = "idTipoAlergia", referencedColumnName = "idTipoAlergia")
    private TipoAlergias tipoAlergias;

    @ManyToOne
    @JoinColumn(name="idFichaMedica",referencedColumnName ="idFichaMedica")
    private FichaMedica fichaMedica;

	public Integer getIdAlergias() {
		return idAlergias;
	}

	public void setIdAlergias(Integer idAlergias) {
		this.idAlergias = idAlergias;
	}

	public LocalDate getFechaDeteccion() {
		return fechaDeteccion;
	}

	public void setFechaDeteccion(LocalDate fechaDeteccion) {
		this.fechaDeteccion = fechaDeteccion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public TipoAlergias getTipoAlergias() {
		return tipoAlergias;
	}

	public void setTipoAlergias(TipoAlergias tipoAlergias) {
		this.tipoAlergias = tipoAlergias;
	}

	public FichaMedica getFichaMedica() {
		return fichaMedica;
	}

	public void setFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedica = fichaMedica;
	}

}
