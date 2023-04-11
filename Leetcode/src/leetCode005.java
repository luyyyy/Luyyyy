import java.util.Scanner;
/*
原始思路：
1.首先循环遍历得到string的所有字串
2.利用string array 存放 所有字串
3.利用数组遍历得到所有对称的字串
4.将所有对称的字串存入新的数组
5.新的数组遍历得到最长的字串
问题：数组的大小要用数学公式算
二重循环 数组大小为n*(n+1)/2，n为字符串长度
 */
public class leetCode005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        int n = s.length();
        String []str = new String[n*(n+1)/2];
        String [] Bilateral = new String[str.length];
        int index = 0;//伪造索引
        for (int i = 0; i < s.length(); i++) {
            for(int j=i+1;j<=s.length();++j){
                str[index]=s.substring(i,j);
                index++;
            }
        }
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
        for (int i = 0; i < str.length; i++) {
            if(isBilateral(str[i])){
                Bilateral[i] = str[i];
            }
        }
        String maxlen = maxlen(Bilateral);
        System.out.println("最长的回文字串是："+maxlen);

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
    public static String maxlen (String []s){
        String maxstring = new String();
        for (int i = 0; i < s.length;i++ ) {
            maxstring = s[i].length()>s[i+1].length()?s[i]:s[i+1];
        }
        return maxstring;
    }
}
