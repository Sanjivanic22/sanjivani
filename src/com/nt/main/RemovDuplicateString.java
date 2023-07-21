package com.nt.main;

import java.util.Arrays;
import java.util.HashSet;

public class RemovDuplicateString {
public static void main(String[] args) {
	String [] fruits= {"mango","apple","mango","Grapes","Apple"};
	String[] uniquefruits=removeDuplicates(fruits);
	System.out.println("withoutDuplicates:"+Arrays.toString(uniquefruits));
	
}
public static String[] removeDuplicates(String[] arr) {
	HashSet<String> uniqueSet=new HashSet<String>();
	String [] result=new String[arr.length];
	int index=0;
	for(String fruits:arr) {
		if(uniqueSet.add(fruits)) {
			result[index]=fruits;
			index++;
			
		}
	}
	
	return Arrays.copyOf(result, index);
}
}
