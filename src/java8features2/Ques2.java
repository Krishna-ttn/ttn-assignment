package java8features2;
// Ques2:
// Create and access default and static method of an interface.


interface MyInterface
{
    default void defaultMethod()
    {
        System.out.println("This is default method");
    }
    static void staticMethod()
    {
        System.out.println("This is static method");
    }
}


public class Ques2 implements MyInterface{
    public static void main(String[] args) {
        Ques2 msg = new Ques2();

        msg.defaultMethod();
        MyInterface.staticMethod();

    }
}