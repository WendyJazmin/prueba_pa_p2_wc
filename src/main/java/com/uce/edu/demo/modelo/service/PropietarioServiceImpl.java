package com.uce.edu.demo.modelo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{
	
	@Autowired
	private IPropietarioRepository propietarioRepository;

	@Override
	public void crearPropietario(String nombre, String apellido, String cedula, LocalDateTime fechaNacimiento) {
		// TODO Auto-generated method stub
		Propietario propietario = this.buscarPropietario(apellido);
		propietario.setNombre(nombre);
		propietario.setCedula(cedula);
		propietario.setFechaNacimiento(fechaNacimiento);
		
		this.propietarioRepository.insertar(propietario);
	}

	@Override
	public Propietario buscarPropietario(String apellido) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscar(apellido);
	}

	@Override
	public void actualizarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(p);
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(cedula);
	}

}
