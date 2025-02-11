package introtojava1;

class Person {
    static String firstName = "Krishna";
    static String lastName = "Sharma";
    static int age = 21;

    // Static block
    static {
        System.out.println("Static Block");
        System.out.println("First Name : " + firstName);
        System.out.println("----------------------------");
    }

    // Static method
    static void printLastName() {
        System.out.println("Static Method");
        System.out.println("Last Name : " + lastName);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        printLastName();
        // static variable
        System.out.println("Static Variable");
        System.out.println("Age : " + age);
        System.out.println("----------------------------");
    }
}
