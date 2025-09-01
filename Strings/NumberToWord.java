package com.github;
import java.util.Scanner;
public class NumberToWord {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Value");
	int val=s.nextInt();
	String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	String ans="";
	while(val!=0) {
		int rem=val%10;
		ans=arr[rem]+ans;
		val=val/10;
	}
	System.out.println(ans);
}
}
//logic:number represents the words.
