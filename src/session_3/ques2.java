package session_3;
import java.util.*;

class Employee implements Comparable<Employee> {
        Double Age;
        Double Salary;
        String Name;

        public Employee(String name, Double age, Double salary) {
            this.Name = name;
            this.Age = age;
            this.Salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{Name='" + Name + "', Age=" + Age + ", Salary=" + Salary + "}";
        }

        @Override
        public int compareTo(Employee other) {
            return this.Name.compareTo(other.Name);
        }
    }

public class ques2 {
    public static void main(String[] args) {
           List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 30.0, 50000.0));
        employees.add(new Employee("Alice Smith", 25.0, 60000.0));
        employees.add(new Employee("Bob Johnson", 35.0, 45000.0));

        Collections.sort(employees);
        System.out.println("Sorted by Name (default):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }


        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.Salary.compareTo(emp2.Salary);
            }
        });
        System.out.println("\n Sorted by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
