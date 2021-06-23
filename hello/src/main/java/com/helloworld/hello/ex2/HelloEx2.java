package com.helloworld.hello.ex2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEx2 {
	
	@RequestMapping("/objetivos")
	public String mentalidade() {
		return "Conseguir criar projetos mais elaborados e com eficiência";	
	}
}
