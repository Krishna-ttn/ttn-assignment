package CollectionsSession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<>();
        list.add(1.2f);
        list.add(2.3f);
        list.add(4.5f);
        list.add(5.56f);
        list.add(9.99f);

        Iterator<Float> iter = list.iterator();
        float sum=0;
        while(iter.hasNext()){
            sum+= iter.next();
        }
        System.out.println("sum is " + sum);
    }
}
