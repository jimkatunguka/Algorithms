package comparer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Employee> employees = getUnsortedEmployeeList();

        //Compare by first name and then last name
        Comparator<Employee> compareByName = Comparator
                .comparing(Employee::getFirstName)
                .thenComparing(Employee::getLastName).reversed();

        List<Employee> sortedEmployees = employees.stream()
                .sorted(compareByName)
                .collect(Collectors.toList());

        List<Employee> sortedEmps = employees.stream()
                .sorted((n1, n2) -> n1.getFirstName().compareTo(n2.getFirstName()))
                .collect(Collectors.toList());

        System.out.println(sortedEmps);
    }

    private static ArrayList<Employee> getUnsortedEmployeeList()
    {
        ArrayList<Employee> list = new ArrayList<>();
        list.add( new Employee(2l, "Lokesh", "Gupta") );
        list.add( new Employee(1l, "Alex", "Gussin") );
        list.add( new Employee(4l, "Brian", "Sux") );
        list.add( new Employee(5l, "Neon", "Piper") );
        list.add( new Employee(3l, "David", "Beckham") );
        list.add( new Employee(7l, "Alex", "Beckham") );
        list.add( new Employee(6l, "Brian", "Suxena") );
        return list;
    }
}

