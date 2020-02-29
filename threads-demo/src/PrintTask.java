import java.net.StandardSocketOptions;
import java.util.Random;

public class PrintTask implements Runnable {
    private final int sleepTime;
    private final String taskName;
    private final static Random randomGenerator = new Random();


    public PrintTask(String taskName) {
        this.taskName = taskName;
        sleepTime = randomGenerator.nextInt(5000);
    }

    @Override
    public void run() {
        try {
            System.out.printf("task %s GTS for %d seconds%n", taskName, sleepTime);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.printf("%s terminated prematurely due to interruption");
            e.printStackTrace();
        }

        System.out.printf("task %s done sleeping%n", taskName);
    }
}
