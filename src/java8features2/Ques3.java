package java8features2;
//Ques 3:
//Sum all the numbers greater than 5 in the integer list using streams

import java.util.Arrays;
import java.util.List;

public class Ques3 {
    public static void main(String[] args) {
        List<Integer> listOfNum = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(
                "Sum of list greater than 5 :- "+listOfNum
                        .stream()
                        .filter(a-> a>5)
                        .reduce(0,(a,b)->a+b)
        );
    }
}
