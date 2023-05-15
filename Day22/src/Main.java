import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        thread03 t03 = new thread03();
        FutureTask<Integer> ift = new FutureTask<>(t03);
        Thread thread = new Thread(ift);
        thread.start();
        System.out.println(ift.get());
    }
}