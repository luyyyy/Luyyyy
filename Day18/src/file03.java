import java.io.File;
import java.util.Scanner;

public class file03 {
    public static void main(String[] args) {
        System.out.println("请输入路径：");
        String s = new Scanner(System.in).nextLine();
        ifExist(s);
    }

    public static void ifExist(String s) {
        File[] files = new File(s).listFiles();
        for (int i = 0; i < files.length; i++) {
            if(files[i].isFile()){
                if (files[i].getName().endsWith("mp4")) {
                    System.out.println(files[i].getName());
                }
            }else{
                ifExist(files[i].toString());
            }
        }
    }
}
