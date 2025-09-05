package com.jspider;
import java.util.Scanner;
public class LeftDiagonalSum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("row");
	int r=s.nextInt();
	System.out.println("column");
	int c=s.nextInt();
	int ld=0;
	int arr[][]=new int[r][c];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(i==j) {
				ld=ld+arr[i][j];
			}
		}
	}
	System.out.println(ld);
}
}
