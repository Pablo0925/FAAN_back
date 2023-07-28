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

    @Column(name = "placaAnimal", unique = true)
    private String placaAnimal;

    @Column(name = "nombreAnimal", length = 255)
    private String nombreAnimal;

    @Column(name = "fotoAnimal")
    private String fotoAnimal;

    @Column(name = "edadAnimal")
    private Integer edadAnimal;

    @Column(name = "estadoAnimal")
    private String estadoAnimal;


    // RELATIONSHIP
    @ManyToOne
    @JoinColumn(name = "idRazaAnimal", referencedColumnName = "idRazaAnimal")
    private RazaAnimal razaAnimal;

    @ManyToOne
    @JoinColumn(name = "idFichaRegistro", referencedColumnName = "idFichaRegistro")
    private FichaRegistro fichaRegistro;

    @ManyToOne
    @JoinColumn(name = "idFichaMedica", referencedColumnName = "idFichaMedica")
    private FichaMedica fichaMedica;

    @ManyToOne
    @JoinColumn(name = "idFudacion", referencedColumnName = "idFudacion")
    private Fundacion fundacion;


    // REFERENCE
    @JsonIgnore
    @OneToMany(mappedBy = "animal")
    private List<DetalleAdopcion> detalleAdopcion;


	public Integer getIdAnimal() {
		return idAnimal;
	}


	public void setIdAnimal(Integer idAnimal) {
		this.idAnimal = idAnimal;
	}


	public String getPlacaAnimal() {
		return placaAnimal;
	}


	public void setPlacaAnimal(String placaAnimal) {
		this.placaAnimal = placaAnimal;
	}


	public String getNombreAnimal() {
		return nombreAnimal;
	}


	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}


	public String getFotoAnimal() {
		return fotoAnimal;
	}


	public void setFotoAnimal(String fotoAnimal) {
		this.fotoAnimal = fotoAnimal;
	}


	public Integer getEdadAnimal() {
		return edadAnimal;
	}


	public void setEdadAnimal(Integer edadAnimal) {
		this.edadAnimal = edadAnimal;
	}


	public String getEstadoAnimal() {
		return estadoAnimal;
	}


	public void setEstadoAnimal(String estadoAnimal) {
		this.estadoAnimal = estadoAnimal;
	}


	public RazaAnimal getRazaAnimal() {
		return razaAnimal;
	}


	public void setRazaAnimal(RazaAnimal razaAnimal) {
		this.razaAnimal = razaAnimal;
	}


	public FichaRegistro getFichaRegistro() {
		return fichaRegistro;
	}


	public void setFichaRegistro(FichaRegistro fichaRegistro) {
		this.fichaRegistro = fichaRegistro;
	}


	public FichaMedica getFichaMedica() {
		return fichaMedica;
	}


	public void setFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedica = fichaMedica;
	}


	public Fundacion getFundacion() {
		return fundacion;
	}


	public void setFundacion(Fundacion fundacion) {
		this.fundacion = fundacion;
	}


	public List<DetalleAdopcion> getDetalleAdopcion() {
		return detalleAdopcion;
	}


	public void setDetalleAdopcion(List<DetalleAdopcion> detalleAdopcion) {
		this.detalleAdopcion = detalleAdopcion;
	}
    
    
}
