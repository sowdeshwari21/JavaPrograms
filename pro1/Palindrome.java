package com.github;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int val=s.nextInt();
	int temp=0;int org=val;
	while(val!=0) {
		int rem=val%10;
		temp=(temp*10)+rem;
		val=val/10;
	}
	if(temp==org) {
		System.out.println("this is palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
}
}//tracing val=121
//121!=0 true rem=121%1=1 temp=(0*10)+rem=0+1=1  val=121/10=1
//12!=0 true rem=12%1=1 temp=(1*10)+2=10+2=12  val=12/10=2
//1!=0 true rem=1%1=1 temp=(12*10)+1=120+1=121  val=121/10=0
//while val!=0 false;
