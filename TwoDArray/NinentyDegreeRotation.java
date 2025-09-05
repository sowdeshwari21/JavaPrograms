package com.jspider;

public class NinentyDegreeRotation {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr[i].length;j++) {
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		}
	}
	for(int i=0;i<arr.length;i++) {
		rev(arr[i]);
	}

	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

static void rev(int arr[]) {
	int l=0,h=arr.length-1;
	while(l<h) {
		int temp=arr[l];
		arr[l]=arr[h];
		arr[h]=temp;
		l++;h--;
	}
}
}

