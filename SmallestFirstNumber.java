package AarayPracticeQuestion;

import java.util.Arrays;

public class SmallestFirstNumber {
public static void main(String[] args) {
	int [] a = {10,20,30,40,50,60,70,80,90};
	Arrays.sort(a);
	System.out.println("sfsdg"+Arrays.toString(a));
	System.out.println("smaller First number: "+ a[0]);
	System.out.println("smaller second number: "+ a[1]);
	System.out.println("smaller Third number: "+ a[2]); 
	System.out.println("----------");
	System.out.println("biggest first number" + a[a.length -1]);
	System.out.println("Biggest Second Number  : " + a[a.length -2]);
	System.out.println("Biggest third number:" + a[a.length-3]);
	
}}

