import java.io.IOException;
import java.net.*;

public class udpts {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String str = "Hello World";
        byte[] arr = str.getBytes();
        InetAddress add = InetAddress.getByName("127.0.0.1");
        int pot = 1008;
        DatagramPacket dp = new DatagramPacket(arr, arr.length, add, pot);
        ds.send(dp);
        ds.close();
    }
}
