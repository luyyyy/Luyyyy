import java.util.Scanner;
/*
思路：
1.Scanner键盘输入
2.substring截取字符串
3.重点：str.charAt[]可以获取char
4.char和数字比较时比如'9'和数字进行比较，int num = char-'0'可以得到char对应的数字
 */
public class 打印身份证信息 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身份证号");
        String number = sc.next();
        String date = number.substring(6, 14);
        char sex = number.charAt(16);
        String year = date.substring(0, 4);
        String month = date.substring(4, 6);
        String day = date.substring(6,8);
        System.out.println("人物信息为");
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");
        int gender = sex-'0';
        if(gender%2==0){
            System.out.println("性别为：女");
        }System.out.println("性别为：男");


    }
}
