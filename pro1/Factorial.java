package com.github;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your Number");
	int val=s.nextInt();
	int temp=1;
    for(int i=1;i<=val;i++) {
    	temp=temp*i;
        System.out.println("The values Are :"+temp);
    }

}	
}
//tracing val=5;temp=1;
//i=1 i<=5 True -->temp=1*1=1;
//i=2 i<=5 True -->temp=1*2=2;
//i=3 i<=5 True -->temp=2*3=6;
//i=4 i<=5 True -->temp=6*4=24;
//i=5 i<=5 True -->temp=25*5=120;
//i=6 i<=5 false end loop
