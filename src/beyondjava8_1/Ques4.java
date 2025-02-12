package beyondjava8_1;
//Create Unmodifiable List from a Stream

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ques4 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1,10).boxed().collect(Collectors.toUnmodifiableList());

        System.out.println(list);

        //will throw exception UnsupportedOperationException
        //list.add(2);

    }
}
