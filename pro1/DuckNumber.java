package com.github;
import java.util.Scanner;
public class DuckNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int val=s.nextInt();
	int prod=1;
	while(val!=0) {
		int rem=val%10;
		prod=prod*rem;
		val=val/10;
	}
	if(prod==0) {
		System.out.println("Duck Number");
	}
	else {
		System.out.println("Not a Duck Number");
	}
}
}
//duck number means any number which contains 0 but it not start with 0 
//EX:1807 is duck number EX:0987 not a duck number
//if we multiply by any number we get a zero is duck number so we take a prodcuct of all the number and compare to 0 it we get 0 is duck
//1807!=10=7 prod=1*7=7 val=1807/10=180
//180!=10=0 prod=7*0=0 val=180/10=18
//18!=10=7 prod=0*7=0 val=1807/10=180 anything multiply by 0 is 0 only so the OUTPUT IS DUCK