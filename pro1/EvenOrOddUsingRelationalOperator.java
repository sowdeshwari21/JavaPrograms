package com.github;
import java.util.Scanner;
public class EvenOrOddUsingRelationalOperator {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int val=s.nextInt();
	if((val/2)*2==val) {
		System.out.println("your Number is :"+val+"And your value is even");
	}
	else {
		System.out.println("your Number is :"+val+"And your value is odd");
	}
}
}
//tracing
//if we divide and multiply by 2 if we get a same value its even or iits odd.
//ex:10 and 9
//((10/2)*2)=5*2=10 we get same as 10 so its even
//((9/2)*2)==4*2=8 in java not consider after pointing numbers.