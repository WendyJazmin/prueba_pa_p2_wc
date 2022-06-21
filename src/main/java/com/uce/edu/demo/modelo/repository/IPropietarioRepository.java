package com.uce.edu.demo.modelo.repository;

import com.uce.edu.demo.modelo.Propietario;


public interface IPropietarioRepository {
	
	//CRUD
	
	//C: crear/insertar
	public void insertar(Propietario p);
	
	//R: Leer/buscar
	public Propietario buscar(String apellido);
	
	//U: actualizar
	public void actualizar(Propietario p);
	
	//D: eliminar
	public void eliminar(String cedula);

}
