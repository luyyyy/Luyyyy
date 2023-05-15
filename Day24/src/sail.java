public class sail extends Thread{
    public static int tickets = 0;
    @Override
    public void run() {
        while (true){
            synchronized (sail.class){
                if (tickets==1000){
                    break;
                }else{
                    tickets++;
                    try {
                        System.out.println("线程"+getName()+"在卖票！");
                        System.out.println("剩余"+(1000-tickets)+"张票！");
                        sail.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
