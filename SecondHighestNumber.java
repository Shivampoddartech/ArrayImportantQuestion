package AarayPracticeQuestion;

import java.util.Arrays;

public class SecondHighestNumber {
public static void main(String[] args) {
	int []a = {10,50,40,90,70,8,80,};
	
	Arrays.sort(a);
	System.out.println("Second highest number" + a[a.length -1]);
}
}
