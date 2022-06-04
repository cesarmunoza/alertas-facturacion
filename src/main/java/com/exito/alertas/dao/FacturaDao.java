package com.exito.alertas.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.exito.alertas.DatosFacturaPendiente;


public interface FacturaDao extends MongoRepository<DatosFacturaPendiente, String>{

}
