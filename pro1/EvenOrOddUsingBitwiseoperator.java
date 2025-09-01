package com.github;
import java.util.Scanner;
public class EvenOrOddUsingBitwiseoperator {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int val=s.nextInt();
	if((val&1)==0) {
		System.out.println("Your Number is :"+val+" and Its even");
	}
	else {
		System.out.println("Your Number is :"+val+" and Its Odd");
	}
}
}
//Tracing or even the number is 6
//6th binary value is 0110  
//to find binary values 2pow0=1,2pow1=2,2pow2=4,2pow3=8;than 6 is 4+2=6 than 4th binary value is 0100 (2pow2 is 4 thats why in that place only 1 other place is 0).And 2 binary value is 0010(2pow is 2 so 2nd place only 2 other place 0).for 6 is 4+2 so 2pow2 +2pow 1 so 3rd place and 2nd place only 1 other place is 0).
//so here we use & operator is used to give a binary value and diractly take the last digit its more faster than % operator.
//if the values last bit is 1 is even number
//if the value last bit is 0 odd number.