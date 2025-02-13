package beyondjava8_2;
//Q4)Use a Sealed class Class concept to create a class hierarchy

// sealed class
sealed class Vehicle permits Car, Bike {
    public void start(){
        System.out.println("Vehicle is Starting");
    }
}
// class extending seal class
final class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Car is Starting");
    }
}

final class Bike extends Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is Starting");
    }
}


public class Ques4 {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle bike = new Bike();
        car.start();
        bike.start();
    }
}
