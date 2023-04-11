import java.util.Scanner;
/*
思路：
1.Scanner获取输入
2.stringBuilder传入字符串
3.sb逆转
4.sb tostring
5.比较reverse和origin
 */
public class 字符串对称 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        String string = reverse.toString();
        System.out.println("反转后的字符串为：");
        System.out.println(reverse);
        if(string.equals(s)){
            System.out.println("字符串对称！");
        }else{
            System.out.println("字符串不对称！");
        }
    }
}
