package com.uce.edu.demo.modelo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el vehiculo: "+v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca(placa);
		return vehiculo;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vehiculo: "+v);

	}

	@Override
	public void eliminar(Vehiculo placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehiculo con placa: "+placa);

	}

}
