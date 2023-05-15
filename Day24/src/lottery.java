import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class lottery extends Thread{
    public static int []arr = {10,5,20,50,100,200,500,800,2,80,300,700};
    public static ArrayList<Integer>list = new ArrayList<>();
    @Override
    public void run() {
        while (true) {
            synchronized (lottery.class) {
                if (list.size() == 11) {
                    break;
                } else {
                    int i = new Random().nextInt(11);
                    if (!list.contains(arr[i])) {
                        System.out.println(getName() + "产生了" + arr[i] + "元大奖！");
                        list.add(arr[i]);
                    }
                }

            }
        }
    }
}

