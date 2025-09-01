package com.github;
import java.util.Scanner;
public class GreatestAmongThreeNumbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your First Value");
	int a=s.nextInt();
	System.out.println("Enter Your Second Value");
	int b=s.nextInt();
	System.out.println("Enter Your Third Value");
	int c=s.nextInt();
	
	if(a>=b && a>=c) {
		System.out.println("First value is bigger And the Value is :"+a);
	}
	else if(b>=c) {
		System.out.println("Second value is bigger And the Value is :"+b);
	}
	else {
		System.out.println("Third value is bigger And the Value is :"+c);

	}
}
}
//tracing a=90 b=30 c=10
//90>=30 && 90>=10 true so 90 is bigger no need to check other condition
//a=30 b=50 c=10
//30>=50 && 30>=10 here the first condition fails so its not check next condition
//b>=c 30>=10 true b is bigger
////a=10 b=30 c=50
//10>30 no not check next condition
//30>50 no
//in else c is bigger