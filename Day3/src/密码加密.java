import java.util.Scanner;

public class 密码加密 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        System.out.println("请输入您的四位密码：");
        int Password = sc.nextInt();
        for(int i=0;i<4;i++){
           int num = Password % 10;
            Password /=10;
            arr[i]=num;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]+5)%10;
        }
        System.out.println("加密后的密码是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
