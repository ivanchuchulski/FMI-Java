import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ArrayList<PrintTask> tasks = new ArrayList<>();

        tasks.add(new PrintTask("1st"));
        tasks.add(new PrintTask("2nd"));
        tasks.add(new PrintTask("3rd"));

        System.out.printf("starting executor service%n");

        ExecutorService threadExecutor = Executors.newCachedThreadPool();

        for (PrintTask task: tasks) {
            threadExecutor.execute(task);
        }

        // shutting the executor down means he cant receive more requests for thread execution
        threadExecutor.shutdown();

        System.out.printf("tasks started, main ends%n");
    }
}
