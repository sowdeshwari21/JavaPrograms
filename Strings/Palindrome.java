package com.github;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your value");
	String str=s.nextLine();
	String temp="";
	for(int i=str.length()-1;i>=0;i--) {
		temp=temp+str.charAt(i);
	}
	if(str.equalsIgnoreCase(temp)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}

