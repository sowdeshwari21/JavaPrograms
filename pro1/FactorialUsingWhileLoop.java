package com.github;
import java.util.Scanner;
public class FactorialUsingWhileLoop {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Value");
	int val=s.nextInt();
    int i=1;int temp=1;
	while(i<=val) {
		temp=temp*i;
		i++;
		System.out.println("The values are :"+i+"And the Result is"+temp);
}
}
}
//i=1,val=5
//i=1 i<=5 true -->temp=1*1=1;
//i=2 i<=5 true -->temp=1*2=2;
//i=3 i<=5 true -->temp=2*3=6;
//i=4 i<=5 true -->temp=6*4=24;
//i=5 i<=5 true -->temp=24*5=120;
