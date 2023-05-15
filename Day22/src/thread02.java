public class thread02 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"你好！");
    }
}
