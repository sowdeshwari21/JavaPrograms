package com.github;
import java.util.Scanner;
public class SwapUsingXOR {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your First Number as Before Swapping");
	int a=s.nextInt();
	System.out.println("Enter Your Second Number As Before Swapping");
	int b=s.nextInt();
	 a=a^b;
	 b=a^b;
	 a=a^b;
	System.out.println("After Swapping "+a);
	System.out.println("After Swapping"+b);
}
}
//tracing a=3,b=7
//using binary values will find this for 3 binary value 0011 for 7 binary value 0111
//a-->    0011
//b-->    0111
//a=a^b-->0100 (xor so different value only get 1 same value 0)

//a-->    0100(new value of a)
//b-->    0111
//b=a^b-->0011 (xor so different value only get 1 same value 0)
//here the b value is 0011 as its binary value if we convert as actual value its 3

//a-->    0100(new value of a)
//b-->    0111(new value of b)
//a=a^b-->0111 (xor so different value only get 1 same value 0)
//here the a value is 0111 as its binary value if we convert as actual value its 7