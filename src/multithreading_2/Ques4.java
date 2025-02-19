package multithreading_2;

import java.util.Random;
import java.util.concurrent.*;

//WAP to return a random integert value from a thread execution using Future.
public class Ques4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> submit = executorService.submit(new Callable<Integer>() {
            Random random = new Random();
            @Override
            public Integer call() throws Exception {
                return random.nextInt(100);
            }
        });
        try {
            System.out.println("Random Integer is " + submit.get() );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
