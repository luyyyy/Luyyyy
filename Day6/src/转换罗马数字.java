import java.util.Scanner;

public class 转换罗马数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        String [] arr ={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        char [] arr1 = new char[9];
        int num;
        while(str.length()<=9){
            for (int i = 0; i < str.length(); ) {
                char c = str.charAt(i);
                if(c>='0'&&c<=9){
                    num = c-'0';
                    arr1[i] = c;
                    i++;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
