package IO_字符字节练习;

import java.io.*;

public class 转换流练习 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\b.txt"));
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        br.close();
    }
}
