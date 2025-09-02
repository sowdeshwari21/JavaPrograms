package com.github;

public class UsingLengthWithoutUsingLength {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int len=0;
	while(true) {
		try {
		int temp=arr[len];
		len++;
	}
	catch(Exception e) {
		break;
	}
	}
	System.out.println(len);
}
}
//LOGIC:without using length or any predefined methods to find a length.
