package com.proyecto.faan.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity(name = "enfermedades")
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEnfermedad")
    private Integer idEnfermedad;

    @Column(name = "fechaEnfermedad")
    private LocalDate fechaEnfermedad;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "estadoEnfermedad")
    private String estadoEnfermedad;

    // RELATIONSHIP
    @ManyToOne
    @JoinColumn(name="idTipoEnfermedad",referencedColumnName ="idTipoEnfermedad")
    private TipoEnfermedad tipoEnfermedad;

    @ManyToOne
    @JoinColumn(name="idFichaMedica",referencedColumnName ="idFichaMedica")
    private FichaMedica fichaMedica;

    //GyS
    
	public Integer getIdEnfermedad() {
		return idEnfermedad;
	}

	public void setIdEnfermedad(Integer idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}

	public LocalDate getFechaEnfermedad() {
		return fechaEnfermedad;
	}

	public void setFechaEnfermedad(LocalDate fechaEnfermedad) {
		this.fechaEnfermedad = fechaEnfermedad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getEstadoEnfermedad() {
		return estadoEnfermedad;
	}

	public void setEstadoEnfermedad(String estadoEnfermedad) {
		this.estadoEnfermedad = estadoEnfermedad;
	}

	public TipoEnfermedad getTipoEnfermedad() {
		return tipoEnfermedad;
	}

	public void setTipoEnfermedad(TipoEnfermedad tipoEnfermedad) {
		this.tipoEnfermedad = tipoEnfermedad;
	}

	public FichaMedica getFichaMedica() {
		return fichaMedica;
	}

	public void setFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedica = fichaMedica;
	}
    

}
