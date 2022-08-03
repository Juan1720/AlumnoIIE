package com.idat.pe.AlumnoPruebaIIE.service;

import java.util.List;

import com.idat.pe.AlumnoPruebaIIE.model.Alumno;

public interface AlumnoService {
	
	List<Alumno> listar();
	Alumno obtenerID(Integer id);
	void guardar(Alumno alumno);
	void eliminar(Integer id);
	void actualizar(Alumno alumno);

}
