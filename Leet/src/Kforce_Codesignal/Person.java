package Kforce_Codesignal;

import java.util.HashMap;

public class Person extends HashMap<Person, String> {
	String fName;
	String lName;

	public Person(String fName, String lName) {
		// "normal constructor implementation."
		this.fName = fName;
		this.lName = lName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		return true;
	}

	public static void main(String[] args) {
		HashMap<Person, String> personMap = new HashMap<>();
		Person person1 = new Person("Smith", "John");
		Person person2 = new Person("Smith", "John");

		personMap.put(person1, "person1");
		System.out.println(personMap.get(person2));
		System.out.println(personMap.get(person1));
	}
}