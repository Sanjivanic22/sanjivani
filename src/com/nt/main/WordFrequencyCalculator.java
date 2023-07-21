package com.nt.main;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCalculator {
	
	    public static void main(String[] args) {
	        String str = "how are you how do you do";

	        Map<String, Integer> frequencyMap = calculateWordFrequency(str);

	        System.out.println("Word frequencies:");
	        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

	    public static Map<String, Integer> calculateWordFrequency(String str) {
	        Map<String, Integer> frequencyMap = new HashMap<>();
	        String[] words = str.split(" ");

	        for (String word : words) {
	            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
	        }

	        return frequencyMap;
	    }
	}
	



