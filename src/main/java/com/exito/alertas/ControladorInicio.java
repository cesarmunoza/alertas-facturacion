package com.exito.alertas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ControladorInicio {
	
	@GetMapping("/")
	public String inicio() {
		log.info("Se está ejecutando el servicio Rest que busca facturas sin procesar");
		return "Mensaje sobre la facturación";
	}

}
