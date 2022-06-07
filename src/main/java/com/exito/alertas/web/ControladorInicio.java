package com.exito.alertas.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.exito.alertas.Factura;
import com.exito.alertas.servicio.FacturaService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@Autowired
	private FacturaService facturaService;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var facturas = facturaService.listarFacturas();

		log.info("Se está ejecutando el controlador MVC que busca facturas sin procesar");
		
		model.addAttribute("facturas", facturas);
		return "index";
	}
	
	@GetMapping("/buscar")
	public String buscar(Factura factura) {
		return "buscar";
	}

}
