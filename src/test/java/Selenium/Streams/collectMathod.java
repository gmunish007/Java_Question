package Selenium.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectMathod {

	public static void main(String[] args) {

		// earlier we were taking List, ArrayList, Arrays and converting them into
		// Streams
		// collect() collects our results and convert it into a List

		ArrayList<String> names = new ArrayList<String>();
		names.add("Amba");
		names.add("Sambe");
		names.add("Ramba");
		names.add("Aalo");
		names.add("Aata");
		names.add("Kata");

		// get list of names ends with "a" in upper case, sort it and print the list
		names.stream().filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).sorted()
				.forEach(s -> System.out.println(s));

		
		// get the same result in a list
		// collects the result from map() and convert into a List using Collectors
		// and store the data in a List with type <String>
		List<String> ls = names.stream().filter(s -> s.endsWith("a")).sorted().map(s -> s.toUpperCase())
				.collect(Collectors.toList());

		System.out.println(ls);

		
		// print first element of the above list
		System.out.println(ls.get(0));

		
		List<Integer> num = Arrays.asList(7, 5, 4, 3, 6, 7, 98, 1, 2, 3, 4, 5, 6);

		// print 3rd value from output
		List<Integer> val = num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("getting 3rd value from list: " + val.get(2));

	}

}
