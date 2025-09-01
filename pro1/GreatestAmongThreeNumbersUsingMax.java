package com.github;
import java.util.Scanner;
public class GreatestAmongThreeNumbersUsingMax {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your First Value");
	int a=s.nextInt();
	System.out.println("Enter Your Second Value");
	int b=s.nextInt();
	System.out.println("Enter Your Third Value");
	int c=s.nextInt();
	int max=a;
	if(max<b)
		max=b;
	if(max<=c)
		max=c;
	System.out.println("The maximum value is :"+max);
}
}
