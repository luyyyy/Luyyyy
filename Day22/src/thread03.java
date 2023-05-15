import java.util.concurrent.Callable;

public class thread03 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 50; i++) {
            sum+=i;
        }
        return sum;
    }
}
