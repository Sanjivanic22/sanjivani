package com.nt.main;

import java.util.Stack;

public class ValidParanthesis {
	public static void main(String[] args) {
        String str1 = "()";
        String str2 = "{[()]}";
        String str3 = "{[}]";

        System.out.println(str1 + " is " + (isValidParentheses(str1) ? "valid" : "invalid") + " parentheses expression");
        System.out.println(str2 + " is " + (isValidParentheses(str2) ? "valid" : "invalid") + " parentheses expression");
        System.out.println(str3 + " is " + (isValidParentheses(str3) ? "valid" : "invalid") + " parentheses expression");
    }
	    public static boolean isValidParentheses(String str) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : str.toCharArray()) {
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } else if (c == ')' || c == ']' || c == '}') {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char top = stack.pop();
	                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty();
	    }

	    
	}

