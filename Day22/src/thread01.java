public class thread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName()+"你好！");
        }
    }
}
