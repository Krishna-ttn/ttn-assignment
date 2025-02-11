package java8features2;
// Ques 5:
// Given a list of objects of following class:
//      class Employee{
//      String fullName;
//      Long salary;
//      String city;
//      }
//Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class Ques5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Krishna Kumar Sharma",15000l,"Delhi");
        Employee emp2 = new Employee("Abhishek Kumar Rawat",4000l,"Delhi");
        Employee emp3 = new Employee("Sanchit Kumar Arora",4000l,"Delhi");
        Employee emp4 = new Employee("Sanchit Krishna Yadav",3000l,"Delhi");
        Employee emp5 = new Employee("Devansh Vinod Sharma",3000l,"Jaipur");

        List<Employee> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5);

        List<String>uniqueFirstNames =list.stream()
                .filter(emp -> emp.salary < 5000 && emp.city.equals("Delhi"))
                .map(emp -> emp.fullName.split(" ")[0])
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueFirstNames);
    }
}
