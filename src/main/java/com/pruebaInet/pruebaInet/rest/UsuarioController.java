package com.pruebaInet.pruebaInet.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaInet.pruebaInet.entity.Usuario;

@RestController
@RequestMapping("/consultaU")
public class UsuarioController {
	
	@GetMapping
	public ResponseEntity<Usuario> getUsuario(){
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNombre("Hector");
		usu.setProfesion("Programador");
		usu.setEdad("33");
		usu.setLenguaje("javascript");
		usu.setDpv("true");
		usu.setaExp("12");
		usu.setNivel("Junior");
		return ResponseEntity.ok(usu);
		
	}
	
	//@GetMapping
	//@RequestMapping(value="datos", method = RequestMethod.GET)
	public String hello() {
		
		return "Hello World";
	}

}
