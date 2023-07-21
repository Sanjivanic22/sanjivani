package com.nt.main;

import java.util.HashSet;
import java.util.Set;

public class RemoveRepeatedWordFromString {
public static void main(String[] args) {
	String str="how are you how do you do";
	String result=removeRepeatedWord(str);
	System.out.println(result);
}
public static String removeRepeatedWord(String str) {
	String[] words=str.split(" ");
	Set<String> uniqueword=new HashSet<String>();
	StringBuilder sb=new StringBuilder();
	for(String word:words) {
		if(!uniqueword.contains(word)){
			uniqueword.add(word);
			sb.append(word).append(" ");
		}
	}
	return sb.toString().trim();
	
}
}