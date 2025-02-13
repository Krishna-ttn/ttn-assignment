package beyondjava8_2;
//Q6)Demonstrate the use of addFirst(), addLast, removeFirst(),
// removeLast, getFirst(), getLast(), reversed() in Set and List Sequenced collections

import java.util.*;


public class Ques6 {
    public static void main(String[] args) {
        //List
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println("Original list is: " + list + "\n");

        list.addFirst(0);
        list.addLast(6);
        System.out.println("First and last elements added: " + list + "\n");

        list.removeFirst();
        list.removeLast();
        System.out.println("First and last elements removed: " + list + "\n");

        System.out.println("First element in the list is : " + list.getFirst());
        System.out.println("Last element in the list is : " + list.getLast() + "\n");
        System.out.println("List in Reverse order : " + list.reversed());

        // Set:
        SequencedSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//it will be ignored

        System.out.println("Orginal set is : " + set + "\n");

        //add first and last
        set.addFirst(0);
        set.addLast(4);
        System.out.println("First and last elements added: " + set + "\n") ;

        //remove first and last
        set.removeFirst();
        set.removeLast();
        System.out.println("First and last elements removed: " + set + "\n");

        //get first and last from set
        System.out.println("First element in the set is : " + set.getFirst());
        System.out.println("Last element in the set is : " + set.getLast()+"\n");

        //reverse the set
        System.out.println("Set in Reverse order : " + set.reversed());

    }

}
