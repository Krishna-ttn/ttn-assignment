package beyondjava8_2;

//Q5)Mark Child classes as final, sealed, and non sealed and observe their behavior

// Sealed Parent class
sealed class Parent permits ChildA, ChildB, ChildC {
    void show() {
        System.out.println("Parent");
    }
}

// final child class: this type of class can not be extended further
final class ChildA extends Parent {
    @Override
    void show() {
        System.out.println("ChildA");
    }
}

// sealed child class: this type of child class must declare classe which can further extend it
sealed class ChildB extends Parent permits GrandChildB {
    @Override
    void show() {
        System.out.println("ChildB");
    }
}

// non-sealed child class: this type of child class is open for further inheritance
non-sealed class ChildC extends Parent {
    @Override
    void show() {
        System.out.println("ChildC");
    }
}

// GrandChildB is a subclass of a child sealed class that is ChildB
final class GrandChildB extends ChildB {
    @Override
    void show
            () {
        System.out.println("GrandChildb , father is :ChildB , ancestor is :Parent");
    }
}


public class Ques5 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();

        ChildA childA = new ChildA();
        childA.show();

        ChildB childB = new ChildB();
        childB.show();

        ChildC childC = new ChildC();
        childC.show();

        GrandChildB grandChildB = new GrandChildB();
        grandChildB.show();

    }
}
