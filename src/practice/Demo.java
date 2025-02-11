package practice;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo {
    public static void main(String[] args) {
//        Object[] arr = new Object[10];
//        arr[0]=0;
//        arr[1]=1;
//        arr[2] = 'a';
//        List<Integer> list =new ArrayList<>();
//        list.add(1);
//        Stream<Integer> stream = list.stream();
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(
                list.stream()
                        .collect(Collectors.toMap(e -> e, e -> e + " Number" ))
        );





    }
}
