package com.github;
import java.util.Scanner;
public class SumOfElementExcludingValue {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your size of Array");
	int size=s.nextInt();
	int arr[]=new int[size];
	for(int j=0;j<size;j++) {
		arr[j]=s.nextInt();
		System.out.println("Your Array values are :"+arr[j]);
	}
	System.out.println("Enter Your Excluding value");
	int val=s.nextInt();
	int sum=0;
	
	for(int i=0;i<size;i++) {
		if(arr[i]==val) {
			i++;
		}
		else {
			sum=sum+arr[i];
		}
	}
	System.out.println(sum);

}
}//here the excluding value represents the actual value and the next nearby value .for that i++ it skip the next iteration.
//size =5;arr[]={1,2,3,4,5}; exclude value=3;OP=8
//i=0;0<5 true if(1==3)false so the else statement sum=0+1=1;
//i=1;1<5 true if(2==3)false so the else statement sum=1+2=3;
//i=2;2<5 true if(3==3)TRUE so the IF statement SKIP
//i=3;3<5 true if(4==3)false BUT THE NEARBY VALUE SO SKIP
//i=4;4<5 true if(5==3)false so the else statement sum=3+5=8;
//i=5;5<5 false end loop