package com.github;

public class OccuranceWithKeyIMP {
public static void main(String[] args) {
	int arr[]= {5,6,3,6,2,2,4,2,6,3};
	int key=3;
	int max=arr[0];
	int ans=-1;
	for(int ele:arr) {
		if(ele>max) {
			max=ele;
		}
	}
	int temp[]=new int[max+1];
	for(int ele:arr) {
		temp[ele]++;
		if(temp[ele]==key) {
			ans=ele;
			break;
		}
	}
	System.out.println(ans);
}
}
