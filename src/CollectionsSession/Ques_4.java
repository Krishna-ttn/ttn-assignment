package CollectionsSession;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employe {
    private String name;
    private int age;
    private String designation;

    public Employe(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return age == employe.age && Objects.equals(name, employe.name)
                && Objects.equals(designation, employe.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
}
public class Ques_4 {
    public static void main(String[] args) {
        Map<Employe, Double> employeMap = new HashMap<>();
        employeMap.put(new Employe("Krishna",21,"Developer"),1000000.0);
        employeMap.put(new Employe("Kunal",21,"Developer"),200000.0);
        employeMap.put(new Employe("Kanishk",21,"Tester"),600000.0);
    }
}
