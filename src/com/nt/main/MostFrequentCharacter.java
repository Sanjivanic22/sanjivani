package com.nt.main;

import java.util.HashMap;
import java.util.Map;


	public class MostFrequentCharacter {
		public static void main(String[] args) {
	        String str = "ababbcccddd";
	        char mostFrequentChar = findMostFrequentChar(str);
	        System.out.println("Most frequent character: " + mostFrequentChar);
	    }
	    public static char findMostFrequentChar(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count the frequency of each character in the string
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        char mostFrequentChar = ' ';
	        int maxCount = 0;

	        // Find the most frequent character
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                mostFrequentChar = entry.getKey();
	                maxCount = entry.getValue();
	            }
	        }

	        return mostFrequentChar;
	    }

	    
	}