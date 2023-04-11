import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//输入一串字符串，判断字符串中有几个大写字母，几个小写字母，几个数字
/*整体思想：
1.通过Scanner获取键盘输入
2.定义三个计数器记录大写字母,小写字母和数字的个数
3.遍历字符串得到每个字节
4.注意char类型直接比较，数字转为字符再与字符比较
 */
public class 字符个数判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        int countA = 0,counta = 0,countInt=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>'a'&&c<'z'){
                counta++;
            } else if (c>'A'&&c<'Z') {
                countA++;
            } else if (c>='0'&&c<='9') {
                countInt++;
            }else{
                System.out.println("输入有误！");
            }
        }
        System.out.println("小写字母的个数是："+counta);
        System.out.println("大写字母的个数是："+countA);
        System.out.println("数字的个数是："+countInt);
    }
}
