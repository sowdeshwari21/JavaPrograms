package com.github;
public class AddingNumbersUptoValuesIMP {
public static void main(String[] args) {
	boolean flag=true;int sum=0;
	int arr[]= {1,2,3,6,4,5,6,7,5};
	for(int i=0;i<arr.length;i++) {
	if(arr[i]==6) {
		flag=false;
	}
	if(flag==true) {
		sum=sum+arr[i];
	}
	if(arr[i]==7) {
		flag=true;
	}
}
	System.out.println(sum);
}
}
//logic:Before 6 it will add upto 7 inbetween not add anything.
//here the starting value is 6 and ending value is 7.
//array values are[1,2,3,6,4,5,6,7,5]it will add upto 2nd index and skip values upto 7th index again add 8th index value.
//i=0 ; i<arr.length(9) true --->if(arr[0](1)==6) no flag is value is true only.so sum=0+1; sum=1;
//i=1 ; i<arr.length(9) true --->if(arr[1](2)==6) no flag is value is true only.so sum=1+2; sum=3;
//i=2 ; i<arr.length(9) true --->if(arr[2](3)==6) no flag is value is true only.so sum=3+3; sum=6;
//i=3 ; i<arr.length(9) true --->if(arr[3](6)==6) YES flag is value is  FALSE so NOT DOING SUM SKIP THE VALUES UPTO THE FLAG BECOME TRUE MEANS THE VALUE BECOME 7.
//i=4 ; i<arr.length(9) true --->if(arr[4](4)==7) flag is value is  FALSE so NOT DOING SUM SKIP THE VALUES UPTO THE FLAG BECOME TRUE MEANS THE VALUE BECOME 7.
//i=5 ; i<arr.length(9) true --->if(arr[5](5)==7) flag is value is  FALSE so NOT DOING SUM SKIP THE VALUES UPTO THE FLAG BECOME TRUE MEANS THE VALUE BECOME 7.
//i=6 ; i<arr.length(9) true --->if(arr[6](6)==7)  flag is value is  FALSE so NOT DOING SUM SKIP THE VALUES UPTO THE FLAG BECOME TRUE MEANS THE VALUE BECOME 7.
//i=7 ; i<arr.length(9) true --->if(arr[7](7)==7) flag is value is true but it will add the values ON NEXT ITERATION.
//i=8 ; i<arr.length(9) true --->if(arr[8](5)==6) flag is value is true only.so sum=6+5; sum=11 output IS 11.
//i=9 ; i<arr.length(9) false the loop ends.
