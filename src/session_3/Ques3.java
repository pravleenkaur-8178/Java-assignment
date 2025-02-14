package session_3;

import java.util.*;

class Emp {
    String name;
    int age;
    String designation;

    public Emp(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", designation='" + designation + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp employee = (Emp) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Map<Emp, Double> employeeSalaryMap = new HashMap<>();
        employeeSalaryMap.put(new Emp("John Doe", 30, "Developer"), 50000.0);
        employeeSalaryMap.put(new Emp("Alice Smith", 25, "Manager"), 60000.0);
        employeeSalaryMap.put(new Emp("Bob Johnson", 35, "Tester"), 45000.0);

        List<Map.Entry<Emp, Double>> entries = new ArrayList<>(employeeSalaryMap.entrySet());

        entries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Employees sorted by Salary (reverse order):");
        for (Map.Entry<Emp, Double> entry : entries) {
            System.out.println(entry.getKey() + " -> Salary: " + entry.getValue());
        }
    }
}
