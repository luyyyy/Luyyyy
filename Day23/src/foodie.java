public class foodie extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (desk.lock){
                if(desk.count==0){
                    break;
                }else{
                    if (desk.foodflag==0){
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        desk.count--;
                        System.out.println(getName()+"还能吃"+desk.count+"碗！");
                        desk.foodflag=0;
                        desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
