import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要转换的字符串：");
            String str = sc.nextLine();
            String regex = "[1-9]\\d{0,9}";
            char [] arr = new char[str.length()];
            if(str.matches(regex)){
                Integer it = Integer.parseInt(str);
                System.out.println("转换后的数字为：");
                System.out.println(it);
                break;
            }else{
                System.out.println("字符串有误，请重新输入！");
                continue;
            }
        }
    }
}
