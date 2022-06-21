package com.uce.edu.demo.modelo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.modelo.Propietario;

public interface IPropietarioService {
	
	public void crearPropietario(String nombre,String aplellido,String cedula,LocalDateTime fechaNacimiento);
	
	
	public Propietario buscarPropietario(String apellido);
	
	
	public void actualizarPropietario(Propietario p);
	
	
	public void eliminarPropietario(String cedula);

}
