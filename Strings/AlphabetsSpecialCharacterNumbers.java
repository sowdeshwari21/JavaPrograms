package com.github;
import java.util.Scanner;
public class AlphabetsSpecialCharacterNumbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your values");
	String str=s.nextLine();
	int a=0,n=0,sp=0;
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if((c>='A'&&c<='Z')||(c>'a'&&c<='z')) {
		  a++;	
		}
		else if(c>='0'&&c<='9') {
			n++;
		}
		else {
			sp++;
		}
	}
	System.out.println("Alphabets count are"+a);
	System.out.println("Number counts are"+n);
	System.out.println("Special character counts are"+sp);
}
}
