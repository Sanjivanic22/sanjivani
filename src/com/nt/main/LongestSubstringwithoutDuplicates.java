package com.nt.main;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringwithoutDuplicates {

    public static void main(String[] args) {
        String str = "abcabcbb";
        int longestLength = lengthOfLongestSubstring(str);
        System.out.println("Length of the longest substring without repeating characters: " + longestLength);
    }

	
	  public static int lengthOfLongestSubstring(String str) {
	        int length = str.length();
	        int maxLength = 0;
	        int start = 0;
	        int end = 0;

	        Set<Character> charSet = new HashSet<>();

	        while (end < length) {
	            char c = str.charAt(end);
	            if (!charSet.contains(c)) {
	                charSet.add(c);
	                int currentLength = end - start + 1;
	                maxLength = Math.max(maxLength, currentLength);
	                end++;
	            } else {
	                charSet.remove(str.charAt(start));
	                start++;
	            }
	        }

	        return maxLength;
	    }

	}
	



