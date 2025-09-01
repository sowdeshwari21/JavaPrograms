package com.github;

public class BubbleSort {
public static void main(String[] args) {
	String s="absdif";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length-1;i++) {
		for(int j=0;j<ch.length-1-i;j++) {
			if(ch[j]>ch[j+1]) {
				char temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
		}
	}
	String ans=new String(ch);
	System.out.println(ans);
	
}
}
//BUBBLE SORT:It works by repeatedly comparing adjacent elements and swapping them if they are in the wrong order
//TRACING:
//i=0;0<6-1(5) true--------------------->1st iteration

//j=0;0<6-1-0(5)true-->compare a&b ->no swap
//j=1; 1<6-1-0(5) true → compare b & s → no swap
//j=2; 2<6-1-0(5) true → compare s & d → swap → a b d s i f (S to D)d shoud come first according to alphabetical order.
//j=3; 3<6-1-0(5) true → compare s & i → swap → a b d i s f (S to I)i shoud come first according to alphabetical order.
//j=4; 4<6-1-0(5) true → compare s & f → swap → a b d i f s (S to F)f shoud come first according to alphabetical order.
//👉 End of Pass 1 → a b d i f s

//Pass 2 (i=1; 1<6-1(5) → true)------------------------>2nd iteration

//Inner Loop: j=0 to 3 (since n-1-i = 4)
//j=0; 0<6-1-1(6-1=5)(5-1=4)(4) true → compare a & b → no swap
//j=1; 1<6-1-1(4) true → compare b & d → no swap
//j=2; 2<6-1-1(4) true → compare d & i → no swap
//j=3; 3<4 true → compare i & f → swap → a b d f i s (F to I)i shoud come first according to alphabetical order.

//👉 End of Pass 2 → a b d f i s

//Pass 3 (i=2; 2<5 → true)---------->3rd iteration

//Inner Loop: j=0 to 2
//j=0; 0<6-1-2(6-1=5)(5-2=3)(3) true → compare a & b → no swap
//j=1; 1<6-1-2(6-1-2)3 true → compare b & d → no swap
//j=2; 2<3 true → compare d & f → no swap
//👉 End of Pass 3 → a b d f i s

//Pass 4 (i=3; 3<5 → true)--------------->4th iteration

//Inner Loop: j=0 to 1

//j=0; 0<(6-1-3)(6-1=5)(5-3=2)(2) true → compare a & b → no swap
//j=1; 1<(6-1-3)(2) true → compare b & d → no swap

//👉 End of Pass 4 → a b d f i s

//Pass 5 (i=4; 4<5 → true)----------------->5th iteration

//Inner Loop: j=0 only

//j=0; 0<1 true → compare a & b → no swap

//👉 End of Pass 5 → a b d f i s