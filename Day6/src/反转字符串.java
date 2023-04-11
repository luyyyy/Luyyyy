import java.util.Scanner;
/*
思路分析：
1.首先要利用stringBuilder接收string拆分后的字母
2.stringBuilder tostring
3.用substring截取tostring里面的string
4.与str2进行比较
 */
public class 反转字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String str1 = sc.next();
        System.out.println("请输入第二个字符串：");
        String str2 = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            sb.append(c);
        }
        String string = sb.toString();
        boolean flag = ifSame(str1, str2,string);
        System.out.println(flag);

    }
    public static boolean ifSame (String str1,String str2,String string){
        for(int i = 0;i<str1.length();i++){
            String substring = string.substring(i, i + str1.length() );
            if(substring.equals(str2)){
                return true;
            }
        }
        return false;
    }
}
