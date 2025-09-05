package com.jspider;

public class HighToLow {
public static void main(String[] args) {
	int n=634918;
	int size=count(n);
	int[] arr=new int[size];
	int rem=0,i=0;
	while(n!=0) {
		rem=n%10;
		arr[i]=rem;
		i++;
		n=n/10;
	}
	sort(arr);
	int ans=0;
	for(int ele:arr) {
		ans=(ans*10)+ele;
	}
	System.out.println(ans);

}
static int count(int n) {
	int c=0;
	while(n!=0) {
		c++;
		n=n/10;
	}
	return c;
}
static void sort(int[] arr) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]<arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
}
