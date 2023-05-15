package 接收和反馈;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class client {
    //发送数据
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10086);
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要发送的语句：");
        String s = sc.nextLine();
        os.write(s.getBytes());
        socket.close();
        //接受反馈
        ServerSocket ss = new ServerSocket(10087);
        Socket so = ss.accept();
        InputStream is = so.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int t;
        while((t=isr.read())!=-1){
            System.out.print((char)t);
        }
    }
}
