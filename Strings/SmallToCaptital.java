package com.github;

public class SmallToCaptital {
public static void main(String[] args) {
	String s="abcTYIN";
	String temp="";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='A'&&c<='Z') {
			c+=32;
			temp=temp+c;
		}
		else if(c>='a'&&c<='z') {
			c-=32;
			temp=temp+c;
		}
	}
	System.out.println(temp);
}
}
//NOTE:THIS WILL WORK ONLY BITWISE OPERATOR
