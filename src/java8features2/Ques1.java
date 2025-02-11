package java8features2;

//Question :Implement following functional interfaces from java.util.function using lambdas:
//
//1. Consumer
//2. Supplier
//3. Predicate
//4. Function


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques1 {
    public static void main(String[] args) {
        Consumer<String> printHello = x -> System.out.println(x);
        printHello.accept("Hello World");

        Supplier <Integer> giveaNumber = () -> 20;
        System.out.println(giveaNumber.get());

        Predicate <Integer> isEven = (x)-> x%2==0;
        System.out.println(isEven.test(6));

        Function<Integer,Integer> square = (x) -> x*x;
        System.out.println(square.apply(4));


    }
}
