package AarayPracticeQuestion;

import java.util.Arrays;

public class FirstHighestNumber {
public static void main(String[] args) {
	int [] a = { 1,2,3,4,5,6,7,8,9,};
	Arrays.sort(a);
	System.out.println("First Highest Number is : " + a[a.length -1]);
}
}
