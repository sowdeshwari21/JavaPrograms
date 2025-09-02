package com.github;

public class StringLengthWithoutUsingAnythinf {
public static void main(String[] args) {
	String s="hello hi bye";
	int len=0;
	while(true) {
		try {
		s.charAt(len);
		len++;
		}
		catch(Exception e) {
			break;
		}
	}
	System.out.println(len);
}
}
//LOGIC:without using length or any predefined methods to find a length.
//but here we should use charAt().