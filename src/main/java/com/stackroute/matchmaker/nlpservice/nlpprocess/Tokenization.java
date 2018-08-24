package com.stackroute.matchmaker.nlpservice.nlpprocess;

import java.util.ArrayList;
import java.util.List;

public class Tokenization {
	
	public List<String> token(String string, ArrayList<String> stopword) {
		List<String> token = new ArrayList<>();
		String[] str = string.split(" ");
		for (String string2 : str) {
			if(stopword.indexOf(string2)==-1)
			token.add(string2);
		}
		System.out.println(token);
		return token;
	}

}
