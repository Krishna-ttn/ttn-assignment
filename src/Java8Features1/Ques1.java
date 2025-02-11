package Java8Features1;

@FunctionalInterface
interface Greater{
    boolean isGreater(int a , int b );
}

@FunctionalInterface
interface IncrementByOne{
    int increase(int a);
}

@FunctionalInterface
interface Concatenation{
    String concat(String a , String b );
}

interface UppperCase{
    String upper(String a);
}

public class Ques1 {
    public static void main(String[] args) {
        Greater comparision = (a,b)-> a > b;
        System.out.println(comparision.isGreater(6,4));

        IncrementByOne increment = (a) -> a+=1;
        System.out.println(increment.increase(5));

        Concatenation concatenation = (a,b)-> a + b;
        System.out.println(concatenation.concat("Krishna" ,"Sharma"));

        UppperCase uppperCase = (a) -> a.toUpperCase();
        System.out.println(uppperCase.upper("krishna"));

    }
}
