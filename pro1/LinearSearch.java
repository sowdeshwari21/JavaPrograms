package com.github;
import java.util.Scanner;
public class LinearSearch {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your value");
	int size=s.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=s.nextInt();
	}
	System.out.println("Enter Your Position");
	int key=s.nextInt();
	int pos=-1;
	for(int j=0;j<=arr.length;j++) {
		if(arr[j]==key) {
			pos=j;
			break;
		}
	}
		System.out.println("Your Position is :"+pos);

			
	
}
}
//tracing if the position is available it will print that index or else it print -1