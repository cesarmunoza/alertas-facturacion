package com.exito.alertas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exito.alertas.Factura;
import com.exito.alertas.dao.FacturaDao;

@Service
public class FacturaServiceImpl implements FacturaService{
	
	@Autowired
	private FacturaDao facturaDao;

	@Override
	public List<Factura> listarFacturas() {		
		return (List<Factura>)facturaDao.findAll();
	}

	@Override
	public Factura encontrarFactura(Factura factura) {		
		return facturaDao.findById(factura.getOrderId()).orElse(null);
	}

}
