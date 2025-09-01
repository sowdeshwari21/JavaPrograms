package com.github;

public class toChar {
public static void main(String[] args) {
//	String s="hello";
//	char arr[]=new char[s.length()];
//	for(int i=0;i<s.length();i++) {
//		arr[i]=s.charAt(i);
//	}
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	char ch[]= {'h','e','l','l','o'};
	String s1="";
	for(int i=0;i<ch.length;i++) {
		s1=s1+ch[i];
	}
	System.out.println(s1);
	String s2=new String(ch);
	System.out.println(s2);
}
}
