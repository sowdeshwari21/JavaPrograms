package com.github;

public class OccuanceOfWords {
public static void main(String[] args) {
	String s="catscatstcatopcat";
	int count=0;
	for(int i=0;i<s.length()-2;i++) {
		if(s.charAt(i)=='c'&&s.charAt(i+1)=='a'&&s.charAt(i+2)=='t') {
			count++;
		}
	}
	System.out.println(count);
}
}
