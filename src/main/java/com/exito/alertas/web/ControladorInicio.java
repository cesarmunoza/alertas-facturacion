package com.exito.alertas.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.exito.alertas.dao.FacturaDao;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@Autowired
	private FacturaDao facturaDao;
	
	@GetMapping("/")
	public String inicio(Model model) {
		
		
		
//		var datosFacturaPendiente = new DatosFacturaPendiente();
//		datosFacturaPendiente.setInvoiceStatus("pending");
//		datosFacturaPendiente.setCedula("123");
//		datosFacturaPendiente.setTipoDependencia("VMI");
//		
//		var datosFacturaPendiente2 = new DatosFacturaPendiente();
//		datosFacturaPendiente2.setInvoiceStatus("otroEstado");
//		datosFacturaPendiente2.setCedula("456");
//		datosFacturaPendiente2.setTipoDependencia("CEDI");
//		
//		//var datosFacturas = Arrays.asList();
//		var datosFacturas = new ArrayList();
		
		
		log.info("Se está ejecutando el controlador MVC que busca facturas sin procesar");
		
		//model.addAttribute("datosFacturas", datosFacturas);
		return "index";
	}

}
