package com.github;
import java.util.Scanner;
public class NumberOfVowels {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your String");
	String str=s.nextLine();
	int count=0;
	String s1=str.toUpperCase();
	for(int i=0;i<str.length();i++) {
		if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U') {
			count++;
		}
	}
	System.out.println(count);
}
}
