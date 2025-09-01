package com.github;
import java.util.Scanner;
public class SwapTwoNumberUsingTemp {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your First Number as Before Swapping");
	int a=s.nextInt();
	System.out.println("Enter Your Second Number As Before Swapping");
	int b=s.nextInt();
	int temp=a;
	a=b;
	b=temp;
	System.out.println("After Swapping "+a);
	System.out.println("After Swapping"+b);
}
}
//tracing a=10,b=20
//temp=a(10);
//a=b 10=20; so here a is 20
//b=temp;20=10 so here b is 10