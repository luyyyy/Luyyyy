import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ticket implements Runnable{
    int tickets = 0;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if (tickets==100){
                    break;
                }else{
                    tickets++;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
            System.out.println(Thread.currentThread().getName()+" "+tickets);
        }
    }
}
