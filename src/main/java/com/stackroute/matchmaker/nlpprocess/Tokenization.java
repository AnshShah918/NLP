package com.stackroute.matchmaker.nlpprocess;

import java.util.ArrayList;
import java.util.List;

public class Tokenization {
	
	public List<String> token(String string) {
		List<String> token = new ArrayList<>();
		String[] str = string.split("");
		for (String string2 : str) {
			token.add(string2);
		}
		return token;
	}

}
