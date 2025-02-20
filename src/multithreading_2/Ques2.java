package multithreading_2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Ques2 {
    public static void main(String[] args) {
        ReentrantLock resourcelock1 = new ReentrantLock();
        ReentrantLock resourcelock2 = new ReentrantLock();

        Runnable task1 = () -> acquireLocks(resourcelock1, resourcelock2, "t1");
        Runnable task2 = () -> acquireLocks(resourcelock2, resourcelock1, "t2");

        Thread t1 = new Thread(task1);
        t1.setName("t1");
        Thread t2 = new Thread(task2);
        t2.setName("t2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void acquireLocks(ReentrantLock lock1, ReentrantLock lock2, String threadName) {
        while (true) {
            try {
                boolean acquiredLock1 = lock1.tryLock(500, TimeUnit.MILLISECONDS);
                boolean acquiredLock2 = lock2.tryLock(500, TimeUnit.MILLISECONDS);

                if (acquiredLock1 && acquiredLock2) {
                    try {
                        System.out.println(threadName + " both locks aquired");
                        System.out.println("working...");
                        Thread.sleep(1000);
                        return;
                    } finally {
                        lock2.unlock();
                        lock1.unlock();
                        System.out.println(threadName + " work finished releasing both locks.");
                    }
                }

                if (acquiredLock1) lock1.unlock();
                if (acquiredLock2) lock2.unlock();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
