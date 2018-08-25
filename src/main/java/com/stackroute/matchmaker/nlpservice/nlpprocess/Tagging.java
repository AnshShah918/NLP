package com.stackroute.matchmaker.nlpservice.nlpprocess;

import java.util.ArrayList;
import java.util.List;

public class Tagging {
	
	public List<String> taggingFunc(List<String> list,List<String> file ){
		List<String> taggedList = new ArrayList<>();
		for (String string : list) {
			if(file.indexOf(string)!=-1) {
				taggedList.add(string);
			}
		}
		return taggedList;
	}

}
