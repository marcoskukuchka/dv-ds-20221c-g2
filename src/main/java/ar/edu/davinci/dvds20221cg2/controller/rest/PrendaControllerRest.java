package ar.edu.davinci.dvds20221cg2.controller.rest;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.davinci.dvds20221cg2.controller.TiendaAppRest;
import ar.edu.davinci.dvds20221cg2.domain.Prenda;
import ar.edu.davinci.dvds20221cg2.service.PrendaService;




@RestController
public class PrendaControllerRest extends TiendaAppRest {

private final Logger LOGGER = LoggerFactory.getLogger(PrendaControllerRest.class);
	
	@Autowired
	private PrendaService service;
	
	/**
	 * Listar Prendas
	 */
	@GetMapping(path = "/prendas/all")
	public List<Prenda> getList(){
		LOGGER.info("Listado de todas las prendas");
		return service.list();
	}

}
