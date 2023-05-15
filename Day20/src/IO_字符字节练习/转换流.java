package IO_字符字节练习;

import java.io.*;

public class 转换流 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\b.txt");
        InputStreamReader ipr = new InputStreamReader(new FileInputStream(file),"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\c.txt"), "gbk");
        int b;
        while ((b=ipr.read())!=-1){
            osw.write(b);
        }
        osw.write("哈哈哈哈哈");
        osw.close();
        ipr.close();
    }
}
