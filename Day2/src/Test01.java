import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("请输入第一个整数：");
       int a = sc.nextInt();
       System.out.println("请输入第二个整数：");
       int b = sc.nextInt();
//       int max = a>b?a:b;
       int max = Math.max(a,b);
       int min= Math.min(a,b);
       int count = 0;
        System.out.println("既能被3整除，又能被5整除的范围内数字是：");
       for(int i=min;i<=max;i++){
           if (i%3==0 && i%5==0){
               count++;
               System.out.println(i);
           }
       }
        System.out.println("在"+min+"到"+max+"范围内"+"符合要求的数字有："+count+"个");

    }
}
