package multithreading_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to submit
// a list of tasks and wait for completion of all tasks.
public class Ques3 {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        for (int id = 0; id < 5; id++) {
            taskList.add(new Task(id));
        }

        // Using SingleThreadExecutor
        System.out.println("Single Thread Executor");
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        executeAndPrint(singleThreadExecutor, taskList);

        // Using CachedThreadPool
        System.out.println("CachedThreadPool");
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        executeAndPrint(cachedThreadPool, taskList);

        // Using FixedThreadPool(3)
        System.out.println("FixedThreadPool(3)");
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        executeAndPrint(fixedThreadPool, taskList);
    }

    private static void executeAndPrint(ExecutorService executor, List<Task> tasks) {
        List<Future<String>> futures = null;
        try {
            futures = executor.invokeAll(tasks);
            for (Future<String> future : futures) {
                // Waits for task completion
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}

class Task implements Callable<String> {
    private final int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Task " + id + " running in " + Thread.currentThread().getName());
        Thread.sleep(1000);
        return "Completed" + "Task " + id;
    }
}