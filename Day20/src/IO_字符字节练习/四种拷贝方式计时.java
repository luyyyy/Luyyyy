package IO_字符字节练习;

import javax.swing.*;
import java.io.*;

public class 四种拷贝方式计时 {
    public static void main(String[] args) throws IOException {
        //字节流拷贝
        File file = new File("D:\\IO_test\\a.txt");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("D:\\b.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int num;
        long start = System.currentTimeMillis();
        while((num=bis.read())!=-1){
            fos.write(num);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
