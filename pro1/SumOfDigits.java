package com.github;
import java.util.Scanner;
public class SumOfDigits {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int val=s.nextInt();
	int sum=0;
	while(val!=0) {
		int rem=val%10;
		sum=sum+rem;
		val=val/10;
	}
	System.out.println(sum);
}
}//tracing val=12345    OP-->15
//val!=0 true rem=12345%10 -->5 sum=0+5   val=12345/10=5;
//val!=0 true rem=1234%10 -->4 sum=5+4   val=1234/10=4;
//val!=0 true rem=123%10 -->3 sum=9+3   val=123/10=3;
//val!=0 true rem=12%10 -->2 sum=12+2   val=12/10=2;
//val!=0 true rem=1%10 -->1 sum=14+1   val=1/10=1;
//sum=15

