package com.sm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sm.metier.ClientMetier;

@RestController
public class AuthentificationRestService {
	@Autowired
	private ClientMetier clientMetier;
	
	@RequestMapping(value="/authentifiate",method=RequestMethod.GET)

	public boolean VerifieIdentite(@RequestParam("identifiant") Long id, @RequestParam("password") String password) {
		return clientMetier.authentifiateClient(id, password);
	}
}