package com.github;
import java.util.Scanner;
public class MissedNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Total number ");
	int a=s.nextInt();
	System.out.println("Enter Your 1st missing number ");
	int b=s.nextInt();
	System.out.println("Enter Your 2nd missing number ");
	int c=s.nextInt();
	for(int i=0;i<=a;i++) {
		if(i==b || i==c) {
			continue;
		}
		System.out.println("Your Acutal Values "+i);
	}
	
	
}
}

//continue used to skip the iteration......
//tracing total value is 10 1st number 3 2nd number 7
//i=0; i<=10 true -->if(i==3||i==7) no than print 0;
//i=1; 1<=10 true -->if(i==3||i==7) no than print 1;
//i=2; 2<=10 true -->if(i==3||i==7) no than print 2;
//i=3; 3<=10 true -->if(i==3||i==7) Yes than continue Nothing will print
//i=4; 4<=10 true -->if(i==3||i==7) no than print 4;
//i=5; 5<=10 true -->if(i==3||i==7) no than print 5;
//i=6; 6<=10 true -->if(i==3||i==7) no than print 6;
//i=7; 7<=10 true -->if(i==3||i==7) Yes than continue Nothing will print
//i=8; 8<=10 true -->if(i==3||i==7) no than print 8;
//i=9; 9<=10 true -->if(i==3||i==7) no than print 9;
//i=10;10<=10 true -->if(i==3||i==7) no than print 10;
//i=11;11<=10 false