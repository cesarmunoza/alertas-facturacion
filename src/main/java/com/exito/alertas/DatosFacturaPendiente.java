package com.exito.alertas;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value="invoicingPendingData")
@Data
public class DatosFacturaPendiente {
	@Id
	private String orderId;
	private String invoiceStatus;
	private String cedula;
	private String tipoDependencia;

}
