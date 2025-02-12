package beyondjava8_1;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Ques3:
// Use Of method to create List, Set and Map
public class Ques3 {
    public static void main(String[] args) {
        List<String> list = List.of("Krishna","Kunal","Sanchit");
        System.out.println(list);

        Set<Integer> integerSet = Set.of(1,2,3,4,5,6,7);
        System.out.println(integerSet);

        Map<String,Integer> salaryMap = Map.of("Abhishek",200000,"Kunal",150000);
        System.out.println(salaryMap);

    }
}
