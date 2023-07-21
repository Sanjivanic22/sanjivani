package com.nt.main;

import java.util.Scanner;

public class EvenLengthWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a word");
	String word=sc.next();
//	String word="Sanji";
//	boolean isEevenWord=iskWordsLengthEven(word);
	if( iskWordsLengthEven(word)) {
		System.out.println("words length is even");
	}
	else {
		System.out.println("Words length is not even");
	}
}
public static boolean iskWordsLengthEven(String word) {
	int length=word.length();
	return length%2==0;
}
}