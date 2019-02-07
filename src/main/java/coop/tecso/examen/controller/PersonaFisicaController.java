package coop.tecso.examen.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import coop.tecso.examen.PersonaFisicaService;
import coop.tecso.examen.model.PersonaFisica;
import coop.tecso.examen.util.RestResponse;

@RestController
public class PersonaFisicaController {
	
	@Autowired
	protected PersonaFisicaService personaFisicaService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String personaFisicaJson) throws JsonParseException, JsonMappingException, IOException {
		
		this.mapper = new ObjectMapper();
		
		PersonaFisica personaFisica = this.mapper.readValue(personaFisicaJson, PersonaFisica.class);
		
		if (this.validate(personaFisica)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no estan diligenciados");
		}
		
		this.personaFisicaService.save(personaFisica);
		
		return new RestResponse(HttpStatus.OK.value(), "Operación éxitosa");
	}
	
	private boolean validate(PersonaFisica personaFisica) {
		boolean isValid = true;
		
		if (personaFisica.getNombre() == null) {
		    isValid = false;
		}
		
		if (personaFisica.getApellido() == null) {
		    isValid = false;
		}
		
		if (personaFisica.getDni() == null) {
		    isValid = false;
		}
		
		return isValid;
	}
}
