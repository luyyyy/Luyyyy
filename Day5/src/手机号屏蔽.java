import java.util.Scanner;
/*
思路分析;
1.首先Scanner
2.定义一个char数组接收用charAt遍历的string
3.数组遍历中间四位转换成*
4.遍历数组
-------------------------------------------
优化方式：
1.用substring截取前三位和后四位的字符串
2.将两个字符串与****拼接
 */
public class 手机号屏蔽 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的手机号码：");//12345678998
        String number = sc.next();
        char chr [] = new char[11];
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            chr[i]=c;
        }
        for(int j = 3;j<7;++j){
            chr[j]='*';
        }
        for (int i = 0; i < chr.length; i++) {
            System.out.print(chr[i]);
        }
    }
}
