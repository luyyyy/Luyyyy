package IO_字符字节练习;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class 程序运行次数 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\login.txt");
        login(file);
    }

    public static void login(File p) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(p));
        int index;
        index = bis.read();
        System.out.println(index);
        index++;
        if (index >= 3) {
            System.out.println("请注册会员再使用！");
        } else {
            System.out.println("欢迎使用！您的第"+index+"次使用免费！");
        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\login.txt"));
        bos.write(index);
        bos.close();
        }
}
