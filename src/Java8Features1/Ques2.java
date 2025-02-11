package Java8Features1;

@FunctionalInterface
interface ArithmaticOperation{
    int operation(int a, int b);
}

public class Ques2 {
    public static void main(String[] args) {
        Operations obj = new Operations();

        ArithmaticOperation addition = obj::add; // (a , b)->  a + b; lambda
        System.out.println("add:" + addition.operation(1,3));

        ArithmaticOperation subtraction = obj::subtract;
        System.out.println("subtraction:" + subtraction.operation(8,5));

        ArithmaticOperation multiplication = Operations::multiply;
        System.out.println("multiply:" + multiplication.operation(4,5));

    }
}
class Operations{
    public int add(int a ,int b){
        return a + b;
    }
    public int subtract(int a , int b){
        return a-b;
    }
    public static int multiply(int a , int b){
        return a*b;
    }
}