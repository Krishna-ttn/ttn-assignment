package introtojava1;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    // Default constructor
    public Employee() {
        this.firstName = "Krishna";
        this.lastName = "Sharma";
        this.age = 21;
        this.designation = "Software Developer Trainee";
    }
    // Parameterized constructor
    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }
    // Copy constructor
    public Employee(Employee emp) {
        this.firstName = emp.firstName;
        this.lastName = emp.lastName;
        this.age = emp.age;
        this.designation = emp.designation;
    }
    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // Overriding toString method
    @Override
    public String toString() {
        return "Main Details: " +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAge: " + age +
                "\nDesignation: " + designation;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1);
        emp1.setFirstName("Kunal");
        System.out.println(emp1);
    }
}