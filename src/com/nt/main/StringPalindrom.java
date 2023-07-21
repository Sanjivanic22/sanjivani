package com.nt.main;

public class StringPalindrom {
public static void main(String[] args) {
	String str="Kayak";
	str=str.toLowerCase();
	boolean isPalindrom=checkPalindrom(str);
	if(isPalindrom) {
		System.out.println("the string is palindrom");
	}
	else {
		System.out.println("The Sring is not palindrom");
	}
}
public static boolean checkPalindrom(String str) {
	int left=0;
	int right=str.length()-1;
	while(left<right) {
		if(str.charAt(left)!=str.charAt(right)){
			return false;
		}
		left++;
		right--;
	}
	return true;
	
}
}
