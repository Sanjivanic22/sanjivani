package com.nt.main;


	public class StringRotationCheck {
	    public static void main(String[] args) {
	        String str1 = "abc";
	        String str2 = "bcad";

	        boolean isRotation = isStringRotation(str1, str2);

	        if (isRotation) {
	            System.out.println("String 2 is a rotation of String 1.");
	        } else {
	            System.out.println("String 2 is not a rotation of String 1.");
	        }
	    }

	    public static boolean isStringRotation(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        String concatenated = str1 + str1;

	        return concatenated.contains(str2);
	    	}
}
