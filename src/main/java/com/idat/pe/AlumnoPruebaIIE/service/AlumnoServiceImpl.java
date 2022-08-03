package com.idat.pe.AlumnoPruebaIIE.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pe.AlumnoPruebaIIE.model.Alumno;
import com.idat.pe.AlumnoPruebaIIE.repository.AlumnoRepository;
@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository repo;
	


	@Override
	public List<Alumno> listar() {
		return repo.findAll();
	}

	@Override
	public Alumno obtenerID(Integer id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public void guardar(Alumno alumno) {
		repo.save(alumno);
		
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public void actualizar(Alumno alumno) {
		repo.saveAndFlush(alumno);
		
	}

}
