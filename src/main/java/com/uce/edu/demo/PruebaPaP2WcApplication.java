package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.service.IPropietarioService;
import com.uce.edu.demo.modelo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2WcApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.vehiculoService.crearVehiculo("chevrolet", "123f", "liviano", new BigDecimal(25000));
		//this.vehiculoService.actualizarVehiculo("mazda", "138v");
		
		
		this.propietarioService.crearPropietario("Jeff", "Alvear", "13345", LocalDateTime.of(1995, 3, 15, 23, 5));
		
		
	
	}

}
