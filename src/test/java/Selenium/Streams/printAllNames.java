package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class printAllNames {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amba");
		names.add("Sambe");
		names.add("Ramba");
		names.add("Aalo");
		names.add("Aata");
		names.add("Kata");

		ArrayList<String> list3 = new ArrayList<String>();

		// Add values in ArrayList
		list3.add("Hii");
		list3.add("Geeks");
		list3.add("for");
		list3.add("Geeks");

		// print all names of ArrayList using streams
		names.stream().forEach(s -> System.out.println("List of all names from ArrayList: " + s));

		// print all names of ArrayList using streams where length greater than 4
		names.stream().filter(s -> s.length() > 4)
				.forEach(s -> System.out.println("List of names where length greater then 4:" + s));

		// print only first names from the list whose length is > 4
		names.stream().filter(s -> s.length() > 4).limit(1)
				.forEach(s -> System.out.println("first name where length greater then 4:" + s));

		// print only first name from the ArrayList
		names.stream().limit(1).forEach(s -> System.out.println("first name from the list:" + s));

		// print list of all names from list and sorted
		names.stream().sorted().forEach(s -> System.out.println("list of all names from list and sorted: " + s));

		// applying 2 filters together
		names.stream().filter(s -> s.length() > 4).filter(s -> s.endsWith("e")).forEach(s -> System.out.println(s));

		// check if Amba is present in the list or not
		boolean lang = names.stream().anyMatch(s -> s.equalsIgnoreCase("Amba"));
		System.out.println("lang"+lang);

		// merge 2 arrayLists, and	 check if Amba is present in the list
		// first you have to concat both the list and then appy anyMatch() to check for "Amba" in the merged list
		Stream<String> newName = Stream.concat(names.stream(), list3.stream());
		System.out.println(newName.anyMatch(s -> s.equalsIgnoreCase("Amba1")));
		
		
		List<Integer> num = Arrays.asList(7, 5, 4, 3, 6, 7, 98, 1, 2, 3, 4, 5, 6);

		// print unique numbers from this array and sort it
		num.stream().distinct().sorted().forEach(s -> System.out.println(s));
		
		// print 2 value from the result
		num.stream().distinct().sorted().limit(2).forEach(s -> System.out.println(s));
		
		
										
	}
}
