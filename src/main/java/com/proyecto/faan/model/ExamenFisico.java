/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.faan.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author LaptopSA
 */
@Setter
@Getter
@Entity
@Table(name = "ExamenFisico")
public class ExamenFisico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idExamenFisico")
    private Integer idExamenFisico;

    @Column(name = "fechaRevisionFisisca")
    private LocalDate fechaRevisionFisisca;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "frecuenciaCardiaca")
    private Double frecuenciaCardiaca;

    @Column(name = "mucosa")
    private String mucosa;

    @Column(name = "ojosrojos")
    private String ojosrojos;

    @Column(name = "piel")
    private String piel;

    @Column(name = "sistemaUrinario")
    private String sistemaUrinario;

    @Column(name = "sistemaDigestivo")
    private String sistemaDigestivo;

    @Column(name = "abdomen")
    private String abdomen;

    // RELATIONSHIP
    @ManyToOne
    @JoinColumn(name="idFichaMedica",referencedColumnName ="idFichaMedica")
    private FichaMedica fichaMedica;

    //GyS
    
	public Integer getIdExamenFisico() {
		return idExamenFisico;
	}

	public void setIdExamenFisico(Integer idExamenFisico) {
		this.idExamenFisico = idExamenFisico;
	}

	public LocalDate getFechaRevisionFisisca() {
		return fechaRevisionFisisca;
	}

	public void setFechaRevisionFisisca(LocalDate fechaRevisionFisisca) {
		this.fechaRevisionFisisca = fechaRevisionFisisca;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}

	public void setFrecuenciaCardiaca(Double frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}

	public String getMucosa() {
		return mucosa;
	}

	public void setMucosa(String mucosa) {
		this.mucosa = mucosa;
	}

	public String getOjosrojos() {
		return ojosrojos;
	}

	public void setOjosrojos(String ojosrojos) {
		this.ojosrojos = ojosrojos;
	}

	public String getPiel() {
		return piel;
	}

	public void setPiel(String piel) {
		this.piel = piel;
	}

	public String getSistemaUrinario() {
		return sistemaUrinario;
	}

	public void setSistemaUrinario(String sistemaUrinario) {
		this.sistemaUrinario = sistemaUrinario;
	}

	public String getSistemaDigestivo() {
		return sistemaDigestivo;
	}

	public void setSistemaDigestivo(String sistemaDigestivo) {
		this.sistemaDigestivo = sistemaDigestivo;
	}

	public String getAbdomen() {
		return abdomen;
	}

	public void setAbdomen(String abdomen) {
		this.abdomen = abdomen;
	}

	public FichaMedica getFichaMedica() {
		return fichaMedica;
	}

	public void setFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedica = fichaMedica;
	}

    
}
