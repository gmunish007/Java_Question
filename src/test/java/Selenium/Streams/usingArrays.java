package Streams;

import java.util.Arrays;

public class usingArrays {

	public static void main(String[] args) {

		// Applying streams on a list of Arrays

		int[] lst = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12 };
		System.out.println("Average of arrays: " + Arrays.stream(lst).average());

	}
}
