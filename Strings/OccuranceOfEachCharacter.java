package com.github;

public class OccuranceOfEachCharacter {
public static void main(String[] args) {
	int arr[]=new int[129];
	String s="Apple Hello Hi";
	for(int i=0;i<s.length();i++) {
		arr[s.charAt(i)]++;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			System.out.println((char)(i)+":"+arr[i]);
		}
	}
}
}//OUTPUT: :2
//A:1 here it will make the order in special characters after capital letters after small letters.
//H:2
//e:2
//i:1
//l:3
//o:1
//p:2
//Index	Character	ASCII	Action(arr[ch]++)	Resulting count
//0	        A	      65	arr[65]++	            A=1
//1	        p	      112	arr[112]++	            p=1
//2	        p	      112	arr[112]++	            p=2(already its 1(p) and ++2)
//3	        l	      108	arr[108]++	            l=1
//4	        e	      101	arr[101]++	            e=1
//5	      (space)	  32	arr[32]++	            space=1
//6	        H	      72	arr[72]++	            H=1
//7	        e	      101	arr[101]++	            e=2
//8	        l	      108	arr[108]++	            l=2
//9	        l	      108	arr[108]++	            l=3
//10	    o	      111	arr[111]++	            o=1
//11	  (space)	  32	arr[32]++	            space=2
//12	    H	      72	arr[72]++	            H=2
//13	    i	      105	arr[105]++	            i=1
