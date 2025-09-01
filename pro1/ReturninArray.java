package com.github;
import java.util.Scanner;
public class ReturninArray {
public static void main(String[] args) {
	String[] fruits=val();
	for(int i=0;i<fruits.length;i++) {
		System.out.println(fruits[i]);
	}
	
}
static String[] val() {
	String arr[]=new String[5];
	arr[0]="Apple";
	arr[1]="Banana";
	arr[2]="Orange";
	arr[3]="Grapes";
	arr[4]="Pomogranent";
	 return arr;
}
}
