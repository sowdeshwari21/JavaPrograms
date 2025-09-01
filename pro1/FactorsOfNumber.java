package com.github;
import java.util.Scanner;
public class FactorsOfNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your number");
	int val=s.nextInt();
	for(int i=1;i<=val;i++) {
		if(val%i==0) {
			System.out.println("There Factors Are"+i);
		}
	}
}
}
//factore means how many times the number will be divisible
//tracing val=10
//i=1; i<=10 true 10%1==0 true --->O/P is 1
//i=2; 2<=10 true 10%2==0 true --->O/P is 2
//i=3; 3<=10 true 10%3==0 false --->
//i=1; 4<=10 true 10%4==0 false --->
//i=1; 5<=10 true 10%5==0 true --->O/P is 5
//i=1; 6<=10 true 10%6==0 false --->
//i=1; 7<=10 true 10%7==0 false --->
//i=1; 8<=10 true 10%8==0 false--->
//i=1; 9<=10 true 10%9==0 false--->
//i=1; 10<=10 true 10%10==0 true --->O/P is 10
