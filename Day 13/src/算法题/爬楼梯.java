package 算法题;

import java.util.concurrent.atomic.AtomicBoolean;

public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(getNUm(20));
    }
    public static int getNUm(int num){
        if(num==1){
            return 1;
        } else if (num==2) {
            return 2;
        } else if (num==3) {
            return 4;
        }
        return getNUm(num-1)+getNUm(num-2)+getNUm(num-3);
    }

}
