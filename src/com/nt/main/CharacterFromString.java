package com.nt.main;

public class CharacterFromString {
public static void main(String[] args) {
	//get the string
	String str="GeeksForGeeks";
	//get the index
	int index=6;
	//get the specific character
	char ch=getCharFromString(str,index);
	System.out.println("character from index is :"+ch);
}

public static char getCharFromString(String str, int index) {
	
	return str.charAt(index);
}
}
