package java8features2;
//Ques4
//Write a program to showcase the use of optional class
import java.util.Optional;


public class Ques4 {
    public static void main(String[] args) {

        Optional<String> randomValue = Optional.of("Hello World");
        if(randomValue.isPresent()){
            System.out.println(randomValue.get());
        }
        Optional<String> emptyVlaue = Optional.ofNullable(null);
        System.out.println(emptyVlaue.orElse("Default Value"));
        emptyVlaue = Optional.of("Hello ");
        System.out.println(emptyVlaue.orElse("Default Value"));

    }
}
