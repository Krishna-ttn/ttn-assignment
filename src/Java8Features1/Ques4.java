package Java8Features1;

@FunctionalInterface
interface MyInterface{
    Student create(String name);
}

public class Ques4 {
    public static void main(String[] args) {
        MyInterface myInterface = Student::new;
        System.out.println(myInterface.create("krishna"));

    }
}
class Student{
    private String name;

    Student(String name){
        this.name =name;
    }


    @Override
    public String toString() {
        return "Student :" + name;
    }
}
