import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udprc {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1008);
        byte[] arr = new byte[1024];
        DatagramPacket dp = new DatagramPacket(arr, arr.length);
        ds.receive(dp);
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        int length = dp.getLength();
        System.out.println("接收到数据"+new String(arr,0,length)+"数据从"+port+"端口发出");
        ds.close();
    }
}
