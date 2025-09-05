package com.jspider;
import java.util.Scanner;
public class UserInput {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your column");
	int c=s.nextInt();
	System.out.println("Enter your row");
	int r=s.nextInt();
	int arr[][]=new int[r][c];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=s.nextInt();
		}
	}
	System.out.println("__________");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
