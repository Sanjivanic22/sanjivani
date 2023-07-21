package com.nt.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveRepeatedWord {
public static void main(String[] args) {
	
        String str = "how are you how do you do";
        String result = removeRepeatedWords(str);
        System.out.println(result);
    }

    public static String removeRepeatedWords(String str) {
        String[] words = str.split(" ");
        Set<String> uniqueWords = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
                sb.append(word).append(" ");
            }
        }

        return sb.toString().trim();
    }

}


//
//	 public static void main(String[] args) {
//	        String str = "how are you how do you do";
//	        String result = removeRepeatedWords(str);
//	        System.out.println(result);
//	    }
//
//	    public static String removeRepeatedWords(String str) {
//	        String[] words = str.split(" ");
//	        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();
//
//	        for (String word : words) {
//	            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
//	        }
//
//	        StringBuilder sb = new StringBuilder();
//	        for (String word : words) {
//	            if (wordFrequencyMap.get(word) == 1) {
//	                sb.append(word).append(" ");
//	            }
//	        }
//
//	        return sb.toString().trim();
//	    }
//	
//}

