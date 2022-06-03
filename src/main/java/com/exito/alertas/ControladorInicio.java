package com.exito.alertas;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@GetMapping("/")
	public String inicio(Model model) {
		var mensaje = "Se encontraron pedidos con límite de intentos de facturacion";
		
		var datosFacturaPendiente = new DatosFacturaPendiente();
		datosFacturaPendiente.setInvoiceStatus("pending");
		datosFacturaPendiente.setCedula("123");
		datosFacturaPendiente.setTipoDependencia("VMI");
		
		var datosFacturaPendiente2 = new DatosFacturaPendiente();
		datosFacturaPendiente2.setInvoiceStatus("otroEstado");
		datosFacturaPendiente2.setCedula("456");
		datosFacturaPendiente2.setTipoDependencia("CEDI");
		
//		var datosFacturas = Arrays.asList(datosFacturaPendiente,datosFacturaPendiente2);
		var datosFacturas = new ArrayList();
		
		
		log.info("Se está ejecutando el controlador MVC que busca facturas sin procesar");
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("datosFacturas", datosFacturas);
		return "index";
	}

}
