package AarayPracticeQuestion;

import java.util.Arrays;

public class ThirdHighestNumber {
public static void main(String[] args) {
	int [] b = {10,20,60,70,80,90,100,200,700,500};
	Arrays.sort(b);
	System.out.println("Third Highest Number : "+ b[b.length -3]);
}
}
