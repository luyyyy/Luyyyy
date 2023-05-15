public class redPacket extends Thread{
    public static int num = 100;
    public int money;
    @Override
    public void run() {
        synchronized (redPacket.class){
            if (num>0) {
                if (num>20) {
                    money = (int)(Math.random()*50);
                    System.out.println(getName()+"抢到了"+money+"元！");
                    num-=money;
                }else{
                    money=num;
                    System.out.println(getName()+"抢到了"+money+"元！");
                    num-=money;
                }
            }else{
                System.out.println(getName()+"没抢到！");
            }
        }
    }
}
//    public static void split(double num){
//        double []arr = new double[5];
//        double sum=0;
//        for (int i = 0; i < 4; i++) {
//            double money = Math.random() * 20;
//            arr[i] = money;
//            sum+=money;
//        }
//        arr[4]= 100-sum;
//    }
//}
