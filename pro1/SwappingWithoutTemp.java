package com.github;
import java.util.Scanner;
public class SwappingWithoutTemp {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your First Number as Before Swapping");
	int a=s.nextInt();
	System.out.println("Enter Your Second Number As Before Swapping");
	int b=s.nextInt();
	 a=a+b;
	 b=a-b;
	 a=a-b;
	System.out.println("After Swapping "+a);
	System.out.println("After Swapping"+b);
}
}
//tracing a=10,b=20
//a=a+b  (10+20)=30
//b=a-b (30-20)=10  //here b value is 10
//a=a-b (30-10)=20  //here avalue is 20
