package com.github;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int val=s.nextInt();
	int count=0;
	for(int i=1;i<=val;i++) {
		if(val%i==0) {
			count++;
		}
	}
		if(count==2) {
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	
}
}//tracing val=10 ,val=5
//i=1 1<=10 if(10%1==0) true count++ 1 if(count==2) output |||||| i=1 1<=5 if(5%1==0) true count++ 1 if(count==2) output 
//2=1 2<=10 if(10%2==0) true count++ 2 if(count==2) output |||||| i=2 2<=5 if(5%2==0) false count++ 1if(count==2) output 
//3=1 3<=10 if(10%3==0) false count++ 1 if(count==2) output |||||| i=3 3<=5 if(5%3==0) false count++ 1 if(count==2) output 
//4=1 4<=10 if(10%4==0) false count++ 1 if(count==2) output |||||| i=4 4<=5 if(5%4==0) false count++ 1 if(count==2) output 
//5=1 5<=10 if(10%5==0) true count++ 3 if(count==2) output |||||| i=5 i5=5 if(5%5==0) true count++ 2 if(count==2) output 
//here the count is 3 so no need to check other condition           output is prime
//output is not prime