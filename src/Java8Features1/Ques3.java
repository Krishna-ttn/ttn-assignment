package Java8Features1;

interface Parent1{
    default void print(){
        System.out.println(" print method of Parent 1");
    }
}
interface Parent2{
    default void print(){
        System.out.println(" print method of Parent 2");
    }
}

public class Ques3 implements Parent1,Parent2{
    @Override
    public void print() {
        Parent1.super.print();
    }

    public static void main(String[] args) {
        Ques3 obj = new Ques3();
        obj.print();
    }
}
