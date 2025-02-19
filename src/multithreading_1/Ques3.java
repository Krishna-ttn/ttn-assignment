package multithreading_1;

import java.util.Scanner;

//Q3)WAP to showcase the usage of volatile in java.
public class Ques3 {
    public static void main(String[] args) {
        VolatileExample thread = new VolatileExample();
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        thread.setFalse();
    }

}
class VolatileExample extends Thread{
    private volatile boolean start = true;

    @Override
    public void run() {
        while(start){
            System.out.println("Print till you press enter");
        }
    }
    public void setFalse(){
        start = false;
    }
}
