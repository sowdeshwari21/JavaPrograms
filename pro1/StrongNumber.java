package com.github;
import java.util.Scanner;
public class StrongNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int val=s.nextInt();
	int temp=val;
	int sum=0;
	while(val!=0) {
		int rem=val%10;
		 sum=sum+fact(rem);
		 val=val/10;
	}
	if(temp==sum) {
		System.out.println("Strong Number");
	}else {
		System.out.println("Not a Strong number");
	}
}

static int fact(int f) {
	int fact=1;int i=1;
	while(i<=f) {
		fact=fact*i;
		i++;
	}
	return fact;
}
}
//tracing val=145
//145!=0 ;
//rem=145%10 ;sum=0+fact(5)--fact=5 go to method (1<=5 true fact=1*1=1)
//                           fact=5 go to method (2<=5 true fact=1*2=2) 
//                           fact=5 go to method (3<=5 true fact=2*3=6) 
//                           fact=5 go to method (4<=5 true fact=6*4=24) 
//                           fact=5 go to method (5<=5 true fact=24*5=120)  
//val=145/10--->14 rem=14%10 =4
//sum=120+fact(4)--fact=5 go to method (1<=4 true fact=1*1=1)
//fact=5 go to method (2<=4 true fact=1*2=2) 
//fact=5 go to method (3<=4 true fact=2*3=6) 
//fact=5 go to method (4<=4 true fact=6*4=24) 
//val=14/10 =1
//sum=(120+24)fact(1)--fact=1 go to method (1<=1 true fact=1*1=1) val=1/10=0;
//sum(120+24+1)=145 
//whil(0!=0)-->condition fails
//145==145---------->STRONG NUMBER