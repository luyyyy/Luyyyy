import java.util.Scanner;
public class ScannerDemo {
    public static void main (String[]args){
        System.out.println("请输入：");
        Scanner sc =new Scanner(System.in);
        int i =sc.nextInt();
        System.out.println("您得到的结果是：");
        System.out.println(i);
    }
}