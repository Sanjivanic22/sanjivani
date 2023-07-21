package com.nt.main;

public class ReplaceChatATSpecificIndex {
public static void main(String[] args) {
	String str="Geeks for Geeks";
	int index=5;
	char ch='S';
	//print original
	System.out.println("Original string:"+str);
	str=str.substring(0,index)+ch
			+str.substring(index+1);
	//print modified
	System.out.println("Modified string:"+str);
}
	
}
