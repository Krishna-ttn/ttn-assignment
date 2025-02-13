package beyondjava8_2;
//Q7)Demonstrate the use of firstEntry(), lastEntry(),
//pollFirstEntry(), pollLastEntry(), putFirst(), putLast(), reversed() with SequencedMap.

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class Ques7 {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Krishna");
        map.put(2, "Kunal");
        map.put(2, "Rohan");
        map.put(3, "Rohit");
        map.put(4, "Sanchit");


        System.out.println("Original map is : " + map + "\n");

        //printing first and last entry
        System.out.println("First entry in map is : " + map.firstEntry());
        System.out.println("Last entry in map is : " + map.lastEntry() + "\n");


        //adding value at first and last
        map.putFirst(0, "Abhinav");
        map.putLast(5, "Rahul");
        System.out.println("Added values at first and last position: " + map + "\n");

        // removing values from first and last
        System.out.println("Pulling key pair with least key: " + map.pollFirstEntry());
        System.out.println("Pulling key pair with greatest key: " + map.pollLastEntry() + "\n");

        //printing reverse map
        System.out.println(map.reversed());
    }
}
