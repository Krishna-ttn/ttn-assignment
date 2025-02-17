package multithreading_1;
//Q2)Use Synchronize method and synchronize block to enable synchronization
// between multiple threads trying to access method at same time.
public class Ques2 {
    //Q2)Use Synchronize method and synchronize block to enable synchronization
// between multiple threads trying to access method at same time.
    int count = 0;
    public static void main(String[] args) {
        Ques2 test = new Ques2();
        Thread t1 = new Thread(()->{
            test.increment();
            test.decrement();
        });
        t1.setName("t1");

        Thread t2 = new Thread(()->{
            test.increment();
            test.decrement();
        });
        t2.setName("t2");

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(test.count);

    }
    // synchronized method
    public synchronized void increment(){
        System.out.println("Entering increment method by " + Thread.currentThread().getName());
        for(int i=0;i<1000;i++){
            count++;
        }
        System.out.println("Exting increment method by " + Thread.currentThread().getName());
    }
    // synchronized block
    public void decrement(){
        System.out.println("Entering decrement method by " + Thread.currentThread().getName());
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                count--;
            }
        }
        System.out.println("Exitin decrement method by " + Thread.currentThread().getName());
    }
}


