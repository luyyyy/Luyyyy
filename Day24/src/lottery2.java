import java.util.ArrayList;
import java.util.Random;

public class lottery2 extends Thread {
    public static int[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};
    public static ArrayList<Integer> list1 = new ArrayList<>();
    public static ArrayList<Integer> list2 = new ArrayList<>();
    static  int max1, max2;
    static int sum1 = 0, sum2 = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (lottery.class) {
                if (list1.size() + list2.size() == 11) {
                    break;
                } else {
                    if (getName() == "抽奖箱1") {
                        int i = new Random().nextInt(11);
                        if (!list1.contains(arr[i])) {
                            list1.add(arr[i]);
                        }
                    } else if (getName() == "抽奖箱2") {
                        int i = new Random().nextInt(11);
                        if (!list2.contains(arr[i])) {
                            list2.add(arr[i]);
                        }
                    }
                }
            }
        }
        }
        //---------------------------
    }
