import java.lang.management.LockInfo;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class present extends Thread{
    public static int present = 0;
    static Lock lock = new ReentrantLock();//注意要是同一个锁
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if(present==90){
                    break;
                }else{
                    present++;
                    System.out.println(getName()+"正在派送礼物！");
                    System.out.println("还剩余"+(100-present)+"个礼物！");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
