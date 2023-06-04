package compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableSort {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25));
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 20));

        Collections.sort(persons);

        for (Person person : persons) {
            System.out.println(person.getName() + ", " + person.getAge());
        }

        System.out.println(persons.stream().map(Person::getName).collect(Collectors.joining(",")));
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public int compareTo(Person other) {
//        // Compare based on age
//        return Integer.compare(this.age, other.age);
//    }

    @Override
    public int compareTo(Person other) {
        // Compare based on age
        return this.name.compareTo(other.name);
    }
}
