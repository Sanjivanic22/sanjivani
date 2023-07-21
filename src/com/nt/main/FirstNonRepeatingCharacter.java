package com.nt.main;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
        String str = "abaccdbdef";
        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);

        if (firstNonRepeatingChar != ' ') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
	}
	    public static char findFirstNonRepeatingChar(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count the frequency of each character in the string
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Find the first non-repeating character
	        for (char c : str.toCharArray()) {
	            if (charCountMap.get(c) == 1) {
	                return c;
	            }
	        }

	        // If there is no non-repeating character, return a default value (such as a space character)
	        return ' ';
	    }
}
	    
	  
