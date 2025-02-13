package beyondjava8_2;
//Q1)Create a Record for the Student with the following Fields: id name standard
//Q2)Make sure that no null values should be used for initialization.
//Q3)Use equal and hashCode methods with Student records

import java.util.Objects;

// ques 1:
record Student(int id, String name, int standard) {

    //compact constructor ques2:
    Student {
        //if null will throw an exception with message
        Objects.requireNonNull(id, "id can't be null");
        Objects.requireNonNull(name, "name can't be null");
        Objects.requireNonNull(standard, "standard can't be null");
    }
     // Ques 3 :
    //  there was no need overide equlas and hashcode here as record already does them by default
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && standard == student.standard && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, standard);
    }
}

public class Ques1_2_3 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Krishna",12);
        Student s2 = new Student(1,"Krishna",12);
        Student s3 = new Student(2,"Sanchit",12);
        //Ques3:
        //using equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        //using hashcode
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }
}
