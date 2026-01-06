package Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class usingArrayList {

	public static void main(String[] args) {

		// Count the number of names starting with Alphabet A in list

		// create an ArrayList with String type and add values to it
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amba");
		names.add("Samba");
		names.add("Ramba");
		names.add("Aalo");
		names.add("Aata");
		names.add("Kata");

		int count = 0;

		// Run a for loop to iterate all the values
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			String actual = names.get(i);

			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);

		streamFilter();
	}

	public static void streamFilter() {
		// create an ArrayList with String type and add values to it
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amba");
		names.add("Samba");
		names.add("Ramba");
		names.add("Aalo");
		names.add("Aata");
		names.add("Kata");

		// using streams and lambda expression to count the alphabets starting with A
		// and getting the count of it
		long type = names.stream().filter(s -> s.startsWith("A")).count();

		System.out.println("A: " + type);
	}
}
