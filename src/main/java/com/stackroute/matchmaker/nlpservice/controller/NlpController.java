package com.stackroute.matchmaker.nlpservice.controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.matchmaker.nlpservice.nlpprocess.Tokenization;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class NlpController {

	public Tokenization tokenization;
	List<String> token = new ArrayList<>();
	Scanner s;

	@GetMapping("/search/{search}")
	public ResponseEntity<?> breakString(@PathVariable("search") String string) throws FileNotFoundException {
		System.out.println(string);
		s = new Scanner(new File("stopword.txt"));
		ArrayList<String> stopword = new ArrayList<String>();
		while (s.hasNext()) {
			stopword.add(s.next());
		}
		System.out.println(stopword);

		s = new Scanner(new File("skill.txt"));
		ArrayList<String> skill = new ArrayList<String>();
		while (s.hasNext()) {
			skill.add(s.next());
		}

		s = new Scanner(new File("organisation.txt"));
		ArrayList<String> location = new ArrayList<String>();
		while (s.hasNext()) {
			location.add(s.next());
		}
		token = tokenization.token(string, stopword);
		
		s.close();
		return new ResponseEntity<String>("ok", HttpStatus.OK);
	}
}