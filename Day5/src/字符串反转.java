import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        char [] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result[i]=c;
        }
        System.out.println("反转后的字符串为：");
        for (int i = result.length-1; i >=0; i--) {
            System.out.print(result[i]);
        }
    }
}
