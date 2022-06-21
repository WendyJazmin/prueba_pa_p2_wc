package com.uce.edu.demo.modelo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.modelo.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Override
	public void crearVehiculo(String marca, String placa, String tipo, BigDecimal precio) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca(marca);
		vehiculo.setPlaca(placa);
		vehiculo.setTipo(tipo);
		vehiculo.setPrecio(precio);
		
		this.iVehiculoRepository.insertar(vehiculo);
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizarVehiculo(String marca, String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(null);
	}

	@Override
	public void eliminarVehiculo(Vehiculo placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.eliminar(placa);
	}

}
