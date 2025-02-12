package beyondjava8_1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//Ques2:
//Convert an Optional type into Stream
public class Ques2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,7,8);
        // to get an Optional Type done this:
        Optional<Integer> optional = list.stream().filter(e->e>6).findAny();
        // Optional to Stream
        Stream<Integer> streamOfIntegers = optional.stream();
        // Printing the stream
        streamOfIntegers.forEach(System.out::println);


        // you can also just simply do:
        //Optional <Integer> optionalInteger = Optional.of(1);
        //Stream<Integer> integerStream = optionalInteger .stream();

    }
}
