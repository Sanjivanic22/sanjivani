package com.nt.main;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {
	 public static void main(String[] args) {
	        String str = "Hello, World!";
	        String result = removeDuplicateCharacters(str);

	        System.out.println("String after removing duplicates: " + result);
	    }
	

public static String removeDuplicateCharacters(String str) {
	//create set bec set does no allow duplicates
	        Set<Character> uniqueChars = new HashSet<>();
	        //stiringbuilder for resulting
	        StringBuilder result = new StringBuilder();
	        //The input string str is converted to a character array using toCharArray(), 
	        //which allows us to iterate over each character in the string.
	        for (char c : str.toCharArray()) {
	        //Inside the loop, the contains() method of the uniqueChars set is used to check 
	        //if the current character c is already present in the set. If the character is not 
	        //present (indicating it's unique), 
	       
	            if (!uniqueChars.contains(c)) {
	            	//it is added to the uniqueChars set using uniqueChars.add(c)
	                uniqueChars.add(c);
	                //appended to the result string using result.append(c).

	                result.append(c);
	            }
	        }

	        return result.toString();
	    }

	   


}
