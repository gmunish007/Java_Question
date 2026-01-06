package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class mapMethod {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Amba");
		names.add("Sambe");
		names.add("Ramba");
		names.add("Aalo");
		names.add("Aata");
		names.add("Kata");

		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(5);
		lst.add(6);
		lst.add(4);
		lst.add(7);

		// Array converted into List whose type in Integer
		List<Integer> lst2 = Arrays.asList(5, 6, 7, 8, 3, 4, 9);
		
		ArrayList<String> list3 = new ArrayList<String>(); 

	    // Add values in ArrayList 
	    list3.add("Hii"); 
	    list3.add("Geeks"); 
	    list3.add("for"); 
	    list3.add("Geeks");
	    

		// print names of length > 4 in Upper case
		// to manipulate our stream, we use map()

		names.stream().filter(s -> s.length() > 4).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// print names which have first letter as A with upper case and sorted
		names.stream().filter(s -> s.startsWith("A")).map(s -> s.toUpperCase()).sorted()
				.forEach(s -> System.out.println("first letter as A with uppercase and sorted: " + s));

		// print list of all names from list and sorted in upper case
		names.stream().sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println("list of all names from list and sorted: " + s));

		// merge 2 arrayLists and sort the result
		Stream.concat(lst.stream(), lst2.stream()).sorted()
				.forEach(s -> System.out.println("merge of both lists and sorted: " + s));

		// addition of arrayList 1
		System.out.println(lst.stream().mapToInt(s -> s).sum());
		
		

	}

}
