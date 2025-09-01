package com.github;
import java.util.Scanner;
public class AmstrongNumber {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your value");
	int val=s.nextInt();
	int temp=val;int sum=0;
	int exp=count(val);
	while(val!=0) {
		int rem=val%10;
		sum=sum+power(rem,exp);
		val=val/10;
	}
	if(temp==sum) {
		System.out.println("Armstrong Number");
	}
	else {
		System.out.println("Not A Armstrong Number");
	}
}

static int count(int n) {
	int count=0;
	while(n!=0) {
		n=n/10;
		count++;
	}
	return count;
}

static int power(int base,int exp) {
	int pow=1;
	for(int i=1;i<=exp;i++) {
		pow=pow*base;
	}
	return pow;
}
}//tracing val=153
//logic:Count how many digits the number has.
//Take each digit, raise it to that count (power), and add them all.
//If the total equals the original number → it’s an Armstrong Number.

//153!=0 true rem=153%10=3 sum=sum+power(rem,exp) go to method here exp is count method to find count--->153/10=3 count++=1;15/10 count++=2;1/10 count++=3 so THE COUNT IS 3;
//now go to the power method here base =rem ,and exp as count.
//sum=sum+pow(3,3)inside pow method (for int i=1;i<=3;true pow=1*3=3
                        //          (for int i=2;i<=3;true pow=3*3=9
//                                  (for int i=3;i<=3;true pow=9*3=27.
//val=153/10=15
//rem=15%10=5
//sum(27)=27+pow(5,3)(for int i=1;i<=3;true pow=1*5=5
//                   (for int i=2;i<=3;true pow=5*5=25
//                   (for int i=3;i<=3;true pow=25*5=125.
//15%10=1
//sum(27+125)=152(5,1)(for(int i=1;i<=1; true pow=1*1=1)
//                     for(int i=2;2<=1 false
//sum(151+1)=153
//if(153==153)ARMSTRONG  NUMBER;
//