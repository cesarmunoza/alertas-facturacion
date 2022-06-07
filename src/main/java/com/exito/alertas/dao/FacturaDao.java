package com.exito.alertas.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.exito.alertas.Factura;


public interface FacturaDao extends MongoRepository<Factura, String>{

}
