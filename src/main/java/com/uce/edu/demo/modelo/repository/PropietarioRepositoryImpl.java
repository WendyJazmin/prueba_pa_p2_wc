package com.uce.edu.demo.modelo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el propietario: "+p);
	}

	@Override
	public Propietario buscar(String apellido) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el propietario: "+apellido);
		Propietario propietario = new Propietario();
		propietario.setApellido(apellido);

		return propietario;
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el propietario: "+p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el propietario: "+cedula);
	}

}
