package Day1;

import java.util.Scanner;

public class DayOneExercise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个三位数字：");
        int i = sc.nextInt();
        System.out.println("该数字的百位是：");
        System.out.println(i/100);
        System.out.println("该数字的十位是：");
        System.out.println(i%100/10);
        System.out.println("该数字的个位是：");
        System.out.println(i%100%10);




    }
}
