package com.github;
import java.util.Scanner;
public class OrderByStrings {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your values");
	String str=s.nextLine();
	String sp="";
	String a="";
	String n="";
	//String temp="";
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
	
	if((c>='A'&&c<='Z')||c>='a'&&c<='z') {
		 a+=c;
	    }
	else if(c>='0'&&c<='9') {
		 n+=c;
          }
	else {
		 sp+=c;
	    }
	}
	System.out.println("Alphabets are"+a);
	System.out.println("Numbers are"+n);
	System.out.println("Special Characters are"+sp);
	System.out.println("Final output is"+a+n+sp);
                
}
}//NOTE:IT WILL WORK ONLY BITWISE OPERATOR (A+=C)not work a=a+c;

