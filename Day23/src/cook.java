public class cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (desk.lock) {
                if (desk.count!=0) {
                    if (desk.foodflag == 0) {
                        //制作面条
                        System.out.println("厨师做了一碗面条");
                        desk.foodflag = 1;
                        desk.lock.notify();
                    } else {
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } else {
                    break;
                }
            }
        }
    }
}
