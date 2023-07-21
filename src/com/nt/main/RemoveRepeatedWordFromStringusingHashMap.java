package com.nt.main;

import java.util.HashMap;

public class RemoveRepeatedWordFromStringusingHashMap {
public static void main(String[] args) {
String str="how are you how do you do";	
String result=removeRepatedWord(str);
System.out.println(result);
}
public static String removeRepatedWord(String str) {
	String[] words=str.split("");
	HashMap<String,Integer> uniqueFrequencyMap=new HashMap<String, Integer>();
	for(String word:words) {
		uniqueFrequencyMap.put(word,uniqueFrequencyMap.getOrDefault(word, 0)+1);
		
	}
	StringBuilder sb=new StringBuilder();
	for(String word:words) {
		if(uniqueFrequencyMap.get(word)==1) {
		sb.append(word).append("");	
		}
	}
	return sb.toString().trim();
	
}
}
