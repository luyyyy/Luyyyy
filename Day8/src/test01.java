import java.util.ArrayList;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        int sum = 0;
        while(sum<=200){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入1-100之间的整数：");
            int num = sc.nextInt();
            if (num<=100&&num>0){
                list.add(num);
                sum+=num;
            }else {
                System.out.println("输入的数据有误，请重新输入！");
            }
        }
        System.out.println("此时集合中的数字为：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
