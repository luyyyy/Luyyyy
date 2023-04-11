import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        if (isBilateral(s)) {
            System.out.println("hao");
        }
    }
    public static boolean isBilateral(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        StringBuilder reverse = sb.reverse();
        String reverseStr = reverse.toString();
        if(s.equals(reverseStr)){
            return true;
        }
        return false;
    }
}