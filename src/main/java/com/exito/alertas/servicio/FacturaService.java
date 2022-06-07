package com.exito.alertas.servicio;

import java.util.List;

import com.exito.alertas.Factura;

public interface FacturaService {
	
	public List<Factura> listarFacturas();
	
	public Factura encontrarFactura(Factura factura);

}
