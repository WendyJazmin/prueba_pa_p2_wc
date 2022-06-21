package com.uce.edu.demo.modelo.repository;

import com.uce.edu.demo.modelo.Vehiculo;

public interface IVehiculoRepository {

	//CRUD
	
	//C: crear/insertar
	public void insertar(Vehiculo v);
	
	//R: Leer/buscar
	public Vehiculo buscar(String placa);
	
	//U: actualizar
	public void actualizar(Vehiculo v);
	
	//D: eliminar
	public void eliminar(Vehiculo placa);


}
