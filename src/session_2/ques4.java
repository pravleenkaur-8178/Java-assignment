package session_2;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName() {
        return fullName.split(" ")[0];
    }
}

public class ques4 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Taylor Alison Swift", 5000L, "Mumbai"),
                new Employee("Jennie Ruby Jane", 4000L, "Delhi"),
                new Employee("Harry Styles", 4000L, "Delhi"),
                new Employee("Raja Kumari", 3500L, "Delhi"),
                new Employee("Rita Agarwal", 4500L, "Delhi")
        );

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("even numbers: " + evenNumbers);

        List<String> uniqueFirstNames = employees.stream()
                .filter(e -> e.salary < 5000 && e.city.equals("Delhi"))
                .map(Employee::getFirstName)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("first names: " + uniqueFirstNames);
    }
}












