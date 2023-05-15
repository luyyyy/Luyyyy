package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10010);
        OutputStream os = socket.getOutputStream();
        os.write("你好啊".getBytes());
        os.close();
        socket.close();
    }
}
