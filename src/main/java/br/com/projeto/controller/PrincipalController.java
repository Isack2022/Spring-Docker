package br.com.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {
	
	@GetMapping("/home")
	public String home() {
		return "Bem vindo a página Home";
	}
	
	@GetMapping("/cliente")
	public List<String> cliente() {
		List<String> cli = new ArrayList<String>();
		
		cli.add("Samsung");
		cli.add("Microsoft");
		cli.add("Oi");
		return cli;
	}
	
	@GetMapping("/contato")
	public String contato() {
		return "contato@spring-docker.com.br";
	}
	
}
