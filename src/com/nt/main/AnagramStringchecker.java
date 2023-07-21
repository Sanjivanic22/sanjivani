package com.nt.main;

import java.sql.Array;
import java.util.Arrays;

public class AnagramStringchecker {
	 public static void main(String[] args) {
		 String str1="listens";
		 String str2="silent";
		 boolean areAnagrams=checkAnagram(str1,str2);
		 //print the string is anagram or not
		 System.out.println("listen and silent are:"+(areAnagrams?"anagrams":"not anagrams"));
		 }

		 public static boolean checkAnagram(String str1,String str2){
			 //scheck twoe strings are equals or not (not equal then false equal then true)
		 if(str1.length()!=str2.length()){
		 return false;
		 }
		 //convert string into charArray
		 char [] array1=str1.toCharArray();
		 char [] array2=str2.toCharArray();
		 Arrays.sort(array1);
		 Arrays.sort(array2);
		 //check sorted arrays are equal or not
		 return Arrays.equals(array1,array2);
		 }

		 }

