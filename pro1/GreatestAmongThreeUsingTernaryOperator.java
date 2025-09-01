package com.github;

import java.util.Scanner;

public class GreatestAmongThreeUsingTernaryOperator {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your First Value");
	int a=s.nextInt();
	System.out.println("Enter Your Second Value");
	int b=s.nextInt();
	System.out.println("Enter Your Third Value");
	int c=s.nextInt();
	int ans=(a>b)?(a>c)?a:c:(b>c)?b:c;
	System.out.println(ans);	
}
}
//tracing a=30,b=60,c=50
//(30>60)?[its a condition] if true return 30 else return 60(30>50)[its a condition]?if condition are true return  30 else return 50 (60>50)if true return 60 else return 50.
//here both are false so return 60,50 and here condition true return 60 