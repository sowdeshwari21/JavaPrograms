package com.github;
import java.util.Scanner;
public class FibnocciSeries {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your value");
	int val=s.nextInt();
	int a=0,b=1,sum=0,i=1;
	while(i<=val) {
		System.out.println(a);
		sum=a+b;
		a=b;
		b=sum;
		i++;
	}
}
}
//tracing val=10;
//1<=10 true print=0 ;sum=0+1=1; a=1; b=1; i++=2;
//2<=10 true print=1 ;sum=1+1=2; a=1; b=2; i++=3;
//3<=10 true print=1 ;sum=1+2=3; a=2; b=3; i++=4;
//4<=10 true print=2 ;sum=2+3=5; a=3; b=5; i++=5;
//5<=10 true print=3 ;sum=3+5=8; a=5; b=8; i++=6;
//6<=10 true print=5 ;sum=5+8=13; a=8; b=13; i++=7;
//7<=10 true print=8 ;sum=8+13=21; a=13; b=21; i++=8;
//8<=10 true print=13 ;sum=13+21=34; a=21; b=34; i++=9;
//9<=10 true print=21 ;sum=21+34=55; a=34; b=55; i++=10;
//10<=10 true print=34 ;sum=34+55=89; a=55; b=89; i++=11;
//11<=10 false