package com.algaworks.festa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvidadosController {

	@GetMapping("/convidados")
	public String listar() {
		return "Lista de Convidados";
	}
}
