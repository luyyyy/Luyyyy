package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10010);
        Socket ac = ss.accept();
        InputStream is = ac.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        while ((b=isr.read())!=-1){
            System.out.println((char) b);
        }
        ac.close();
        ss.close();
    }
}