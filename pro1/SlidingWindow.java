package com.github;
import java.util.Scanner;
public class SlidingWindow {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your Array size");
	int size=s.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=s.nextInt();
	}
	int c=1;
	for(int j=0;j<arr.length-1;j++) {
		if(arr[j]==arr[j+1]) {
			c++;
		}
		else {
			System.out.println(c);
			c=1;
		}
	}
	System.out.println(c);
}
}///logic:subarray count here initial count is should be 1 because every we are calcuting not in 0;
//size=5 arr[]={1,1,2,2,3}; OP-->2 2 1
//j=0;0<5-1(4) true arr[0]==arr[1](1==1)true c++(2) print:
//j=1;1<5-1(4) true arr[1]==arr[2](1==2)false it goes ti else statement and print c value as print:2
//j=2;2<5-1(4) true arr[2]==arr[3](2==2)true AGAIN IT START AS 1 c++(1) print:
//j=3;3<5-1(4) true arr[3]==arr[4](2==3)false it goes ti else statement and print c value as print:2
//j=4;4<4 false but eventhoug it will print value last value as C is 1 because after loop will print again c.