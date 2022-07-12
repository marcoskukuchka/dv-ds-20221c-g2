package ar.edu.davinci.dvds20221cg2.controller.request;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrendaUpdateRequest {

	private String descripcion;
	
	private String tipo;
	
	private BigDecimal precioBase;
}
