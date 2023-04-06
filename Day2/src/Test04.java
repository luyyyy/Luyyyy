import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的被除数");
        int i = sc.nextInt();
        System.out.println("请输入您的除数");
        int j = sc.nextInt();
        int count = 0;
        int b = i;
        if (i > j) {
            while (b >= j) {
                b -= j;
                count++;
            }
            System.out.println("相除的结果是："+count+"余数是："+b);
        } else {
            System.out.println("相除的结果是0，余数是：" + (j - i));
        }
    }
}
