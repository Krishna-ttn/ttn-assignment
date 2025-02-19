package multithreading_2;

import java.util.concurrent.*;

//WAP to show usage of Callable and demonstrate how it is different from Runnable
public class Ques1 {
    public static void main(String[] args) {
        MessageCallable messageCallable = new MessageCallable();
        // you cant pass callable to a thread
        // so you have to use ExecutorService to execute

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(messageCallable);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        // in Runnable:
        MessageRunnable messageRunnable = new MessageRunnable();
        //in thread
        new Thread(messageRunnable).start();

        // or you can also use ExecutorService
       executorService.execute(messageRunnable);

       executorService.shutdown();

    }
}

// unlike runnable callable also returns a result
class MessageCallable implements Callable<String> {
    @Override
    public String call() throws InterruptedException {
        // we use throws here but cant in Runnable
        Thread.sleep(2000);
        return "Hello from callable";
    }
}

class MessageRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello form the Runnable ");
    }
}

