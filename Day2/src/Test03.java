import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数值：");
        int a = sc.nextInt();
        int num=0;
        int b =a;
        while(b!=0){
            int ge = b%10;
            b/=10;
            num = num*10 +ge;
        }
        System.out.println(num);
        if(a==num){
            System.out.println("您输入的数字是回文数！");
        }else{
            System.out.println("您输入的不是回文数！");
        }
    }
}
