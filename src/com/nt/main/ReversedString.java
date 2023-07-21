package com.nt.main;

public class ReversedString {
public static void main(String[] args) {
//	String s="Sanjivani";
//	char [] chars=s.toCharArray();
//	for(int i=chars.length-1;i>0;i--) {
//		System.out.println(chars[i]);
//	}
//	}
//
//
//}
//String str="Sanjivani",nstr="";
//	char ch;
//	System.out.println("original word:"+str);
//
//for(int i =0;i<str.length();i++) {
//	ch =str.charAt(i);
//	nstr=ch+nstr;
//}
//System.out.println("Reversed word:"+nstr);
//}
	//using StringBuilder
	String input="Sanjivani";
	StringBuilder sb=new StringBuilder();
	//append
	sb.append(input);
	//reverse
	sb.reverse();
	System.out.println(sb);
}
}