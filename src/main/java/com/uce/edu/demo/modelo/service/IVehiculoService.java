package com.uce.edu.demo.modelo.service;

import java.math.BigDecimal;

import com.uce.edu.demo.modelo.Vehiculo;

public interface IVehiculoService {

	public void crearVehiculo(String marca,String placa,String tipo,BigDecimal precio);
	
	
	public Vehiculo buscarVehiculo(String placa);
	
	
	public void actualizarVehiculo(String marca,String placa);
	
	
	public void eliminarVehiculo(Vehiculo placa);
}
