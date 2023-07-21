package com.nt.main;

public class WordReversal {
	public static void main(String[] args) {
        String str = "Hello World! How are you?";
        String reversed = reverseWords(str);
        System.out.println(reversed);
    }

    public static String reverseWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}