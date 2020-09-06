package removeDuplicates;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String[] names = { "Jim", "Enock", "Andre", "Plan", "Jim" };

		List<String> myNames = Arrays.asList(names);

		Set<String> newNames = new TreeSet<>(myNames);

		System.out.println(newNames);

	}

}
