package com.idat.pe.AlumnoPruebaIIE.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Data
@Entity
@Table(name ="alumnos")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idAlumno;
	private String apellido;
	private String nombre;
	
	
	


}
