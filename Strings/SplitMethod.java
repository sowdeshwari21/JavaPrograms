package com.github;

public class SplitMethod {
public static void main(String[] args) {
	String s1="hello@hi@good@morning";
	String[] arr=s1.split("@");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
//split( ) used to split the sentence or words according to our condition.here inside a method will mention @ so wherever it present that place it will be splited.
//step 1:look the splitedplace here @ according to that array will be generated.
//"hello" "hi" "good" "morning".
//step 2:
//arr[0] = "hello"
//arr[1] = "hi"
//arr[2] = "good"
//arr[3] = "morning"
//step 3:i=0;0<arr.length(4) true-->print hello i++
//       i=1;1<arr.length(4) true-->print hi i++
//       i=2;2<arr.length(4) true-->print good i++
//       i=3;3<arr.length(4) true-->print morning i++
//       i=4;4<arr.length(4) false..........