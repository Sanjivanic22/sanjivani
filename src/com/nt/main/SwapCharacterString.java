package com.nt.main;

public class SwapCharacterString {
public static void main(String[] args) {
	String str="GeeksForsanj";
	System.out.println(swapPair(str));
}
public static String swapPair(String str) {
	if(str==null|| str.isEmpty())
	return str;
	//converting string into char array
	char ch[]=str.toCharArray();
	//traverse the char array
	for(int i=0;i<ch.length-1;i+=2) {
		//swapping the chra
		char temp=ch[i];
		ch[i]=ch[i+1];
		ch[i+1]=temp;
		
	}
	return new String(ch);
}
}