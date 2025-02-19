package multithreading_2;

import java.util.concurrent.locks.ReentrantLock;

//Improve the code written in Basics of Multi Threading Part 1 exercise question 4
// to handle the deadlock using reentract lock.
public class Ques2 {
    public static void main(String[] args) {
//        Object resource1 = new Object();
//        Object resource2 = new Object();

        ReentrantLock resourcelock1 = new ReentrantLock();
        ReentrantLock resourcelock2 = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            if(resourcelock1.tryLock()) {
                 try {
                     System.out.println("Utilizing Resource 1 in " + Thread.currentThread().getName());
                     System.out.println("Waiting for resource 2 in " + Thread.currentThread().getName());
                     if (resourcelock2.tryLock()) {
                         System.out.println("utilizing Resource 2 in " + Thread.currentThread().getName());
                         resourcelock2.unlock();
                     }else{
                         System.out.println(Thread.currentThread().getName() + " could not acquire resource 2");
                     }
                 }finally {
                     resourcelock1.unlock();
                 }
            }else{
                System.out.println(Thread.currentThread().getName() +  " could not acquire resource 1");
            }
        });
        t1.setName("t1");

        Thread t2 = new Thread(() -> {
            if(resourcelock2.tryLock()) {
                try {
                    System.out.println("Utilizing Resource 2 in " + Thread.currentThread().getName());
                    System.out.println("Waiting for resource 1 in " + Thread.currentThread().getName());
                    if (resourcelock1.tryLock()) {
                        System.out.println("utilizing Resource 1 in " + Thread.currentThread().getName());
                        resourcelock1.unlock();
                    }else{
                        System.out.println(Thread.currentThread().getName() + " could not acquire resource 1");
                    }
                }finally {
                    resourcelock2.unlock();
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " could not acquire resource 2");
            }
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
    }
}

