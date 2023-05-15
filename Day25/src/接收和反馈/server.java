package 接收和反馈;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket so = ss.accept();
        InputStream is = so.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int t;
        while((t=isr.read())!=-1){
            System.out.print((char)t);
        }
        so.close();
        ss.close();
        Socket socket = new Socket("127.0.0.1",10087);
        OutputStream os = socket.getOutputStream();
        String s = "已收到数据！";
        os.write(s.getBytes());
        socket.close();
    }
}
