package br.com.springsecurity.integracaobanco.controller;

import org.springframework.web.bind.annotation.*;




@RestController
public class WelcomeController {

	@GetMapping
    public String welcome() { return "Welcome"; }
	
	@GetMapping("/users")
    public String users() { return "Acesso autorizado"; }

	@GetMapping("managers")
    public String managers() { return "Acesso autorizado"; }

}

