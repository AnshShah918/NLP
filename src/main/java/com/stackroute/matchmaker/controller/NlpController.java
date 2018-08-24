package com.stackroute.matchmaker.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.nlpprocess.Tokenization;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class NlpController {
	
	public Tokenization tokenization;
	
	@PostMapping("/search")
	public void breakString(@PathVariable String string)
	{
		tokenization.token(string);		
	}
}
