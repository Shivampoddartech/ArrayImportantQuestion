package AarayPracticeQuestion;
	import java.util.Arrays;
// first highest number to 2 3 4 5 6  lower number
	public class SecondHighest {
	    public static void main(String[] args) {
	        int[] a = {10, 5, 20, 8, 25, 18}; // Example array

	        Arrays.sort(a); // Sort the array in ascending order

	        System.out.println("The second highest number is: " + a[a.length  -1 ]);
	    }
	}


