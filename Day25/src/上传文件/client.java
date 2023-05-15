package 上传文件;

import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a.txt");
        FileInputStream fis = new FileInputStream(file);
        Socket socket = new Socket("127.0.0.1", 10086);
    }
}
