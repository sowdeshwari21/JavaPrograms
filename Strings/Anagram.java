package com.github;

public class Anagram {
public static void main(String[] args) {
	String s1="listen";
	String s2="silent";
	String ans1=sent(s1);
	String ans2=sent(s2);
	if(ans1.equals(ans2)) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("Not Anagram");
	}
}

static String sent(String s) {
	char arr[]=s.toCharArray();
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				char temp=arr[j];
			    arr[j]=arr[j+1];
			    arr[j+1]=temp;
			}
		}
	}
		String ans=new String(arr);
	
	return ans;
	
}
}
