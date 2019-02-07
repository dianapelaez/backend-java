package coop.tecso.examen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coop.tecso.examen.PersonaFisicaService;
import coop.tecso.examen.model.PersonaFisica;
import coop.tecso.examen.repository.PersonaFisicaRepository;

@Service
public class PersonaFisicaImpl implements PersonaFisicaService {
  
  @Autowired
  protected PersonaFisicaRepository personaFisicaRepository;
  
  @Override
  public PersonaFisica save(PersonaFisica personaFisica) {
	  return this.personaFisicaRepository.save(personaFisica);
  }
}
