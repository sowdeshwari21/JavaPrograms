package com.github;
import java.util.Scanner;
public class MaxElement {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your value");
	int size=s.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=s.nextInt();
	}
	int max=arr[0];
	for(int j=0;j<arr.length;j++) {
		if(max<arr[j]) {
			max=arr[j];
		}
	}
	System.out.println("The maximum element is"+max);
}
}
