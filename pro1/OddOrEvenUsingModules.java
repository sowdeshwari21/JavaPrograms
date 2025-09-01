package com.github;
import java.util.Scanner;
public class OddOrEvenUsingModules {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int val=s.nextInt();
	if(val%2==0) {
		System.out.println("Your Number is :"+val+" And Its Even");
	}
	else {
		System.out.println("Your Number is :"+val+" And Its Odd");
	}
}
}

