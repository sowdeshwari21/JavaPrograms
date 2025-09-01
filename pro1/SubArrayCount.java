package com.github;

public class SubArrayCount {
public static void main(String[] args) {
	int arr[]= {3,3,3,1,2,8,8,8,8};
	int count=1,maxcount=1,number=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==arr[i+1]) {
			count++;
		}
		else {
			System.out.println(arr[i]+"count ="+count);
			
			if(count>maxcount) {
				maxcount=count;
				number=arr[i];
			}
			count=1;
		}
	}
	System.out.println(arr[arr.length-1]+"count ="+count);
		if(count>maxcount) {
			maxcount=count;
			number=arr[arr.length-1];
		}
	
	System.out.println("OverAll Array values are :"+number);
	System.out.println("The maximum occurance value is "+maxcount+"and the number is "+number);
}
}
//logic:occurance of numbers and maximum occurance.
//i=0;0<arr.length-1(8) true if(arr[0](3)==arr[1](3)] true count++=(2);
//i=1;1<arr.length-1(8) true if(arr[1](3)==arr[2](3)] true count++=(3);
//i=2;2<arr.length-1(8) true if(arr[2](3)==arr[3](1)] FALSE go to else and print arr[i]is 3 and count =3;
//check (count>maxcount)(3>1) true then maxcount=count;(MAXCOUNT IS 3)number=arr[i](3);
//count starts from 1 again go to loop now it start from i=3;
//i=3;3<arr.length-1(8) true if(arr[3](1)==arr[4](2)] FALSE go to else and print arr[i]is 1 and count =1;
//check (count>maxcount)(1>3) FALSE then maxcount=count;(MAXCOUNT IS 3)number=arr[i](3);no change of maxcount
//count starts from 1 again go to loop now it start from i=4;
//i=4;4<arr.length-1(8) true if(arr[4](2)==arr[5](8)] FALSE go to else and print arr[i]is 2 and count =1;
//check (count>maxcount)(1>3) true then maxcount=count;(MAXCOUNT IS 3)number=arr[i](3);no change of maxcount
//count starts from 1 again go to loop now it start from i=5;
//i=5;5<arr.length-1(8) true if(arr[5](8)==arr[6](8)] true count++=(2);
//i=6;6<arr.length-1(8) true if(arr[6](8)==arr[7](8)] true count++=(3);
//i=7;7<arr.length-1(8) true if(arr[7](8)==arr[8](8)] true count++=(4);
//i=8;8<arr.length-1(8) condition fails and print arr(arr.length-1)is 8 and count is 4);
//now check (count>maxcount)(4>3)TRUE ------>MAXCOUNT=4 NUMBER arr[i]=8