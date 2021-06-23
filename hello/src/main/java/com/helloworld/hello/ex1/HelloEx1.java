package com.helloworld.hello.ex1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEx1 {
	
	@RequestMapping("/mentalidade")
	public String mentalidade() {
		return "Persistência e Responsabilidade Pessoal";	
	}
}
