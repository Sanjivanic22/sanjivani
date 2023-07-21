package com.nt.main;

public class StringCompressor {
	public static void main(String[] args) {
        String str = "aabbbccccdd";
        String compressedString = compressString(str);
        System.out.println("Compressed string: " + compressedString);
    }
	    public static String compressString(String str) {
	        StringBuilder compressed = new StringBuilder();
	        int count = 1;

	        for (int i = 0; i < str.length(); i++) {
	            // Check if the current character is the same as the next character
	            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
	                count++;
	            } else {
	                // Append the current character and its count to the compressed string
	                compressed.append(str.charAt(i));
	                compressed.append(count);
	                count = 1;
	            }
	        }

	        // Check if the compressed string is shorter than the original string
	        if (compressed.length() < str.length()) {
	            return compressed.toString();
	        } else {
	            return str;
	        }
	    }

	    
	}

