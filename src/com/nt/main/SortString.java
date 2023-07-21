package com.nt.main;

public class SortString {
public static void main(String[] args) {
	String  str="Nilam";
	//converting string into array
	char ch[]=str.toCharArray();
	//nested loop for comparison or char
	char temp;
	int i=0;
	while(i<ch.length) {
		int j=i+1;
		while(j<ch.length) {
			if(ch[j]<ch[i]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
			j+=1;
			
		}
		i+=1;
	}
	System.out.println(ch);
}
}
