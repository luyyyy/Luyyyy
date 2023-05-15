package chetroom;

import com.sun.tools.javac.Main;

import java.io.IOException;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1008);
        byte[] arr = new byte[1024];
        DatagramPacket dp = new DatagramPacket(arr, arr.length);
        while (true){
            ds.receive(dp);
            InetAddress add = dp.getAddress();
            int length = dp.getLength();
            int port = dp.getPort();
            System.out.println(new String(dp.getData(),0,dp.getLength())+"数据是从"+add+"发出的，"+"端口是"+port+"总长度是"+length);
        }
    }
}
