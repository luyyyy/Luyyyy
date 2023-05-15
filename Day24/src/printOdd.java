public class printOdd implements Runnable{
    int num=0;
    @Override
    public void run() {
        while (true){
            synchronized (printOdd.class){
                if (num==100){
                    break;
                }else{
                    if (num%2==1){
                        System.out.println(Thread.currentThread().getName()+"在执行！");
                        System.out.println(num);
                    }
                    num++;
                }
            }
        }

    }
}
