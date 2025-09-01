package com.github;
import java.util.Scanner;
public class SPYNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int val=s.nextInt();
		int sum=0;
		int prod=1;
		while(val!=0) {
			int rem=val%10;
			sum=sum+rem;
			prod=prod*rem;
			val=val/10;
		}
		if(sum==prod) {
			System.out.println("This is SPY Number");
		}
		else {
			System.out.println("This is NOT A SPY Number");
		}
	}

}//tracing 123 -->this is spy number
//123!=0 true rem=123%10=3 sum=0+3=3 prod=1*3=3 val=123/10=12
//12!=0 true rem=12%10=2 sum=3+5   prod=3*2=6 val=12/10=1
//1!=0 true rem=1%10=1 sum=5+1=6 prod=6*1=6 
