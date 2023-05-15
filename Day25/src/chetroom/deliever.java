package chetroom;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class deliever {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入您要说的话：");
            String s = sc.nextLine();
            byte[] arr = s.getBytes();
            InetAddress add = InetAddress.getByName("127.0.0.1");
            int port = 1008;
            DatagramPacket dp = new DatagramPacket(arr, arr.length, add, port);
            ds.send(dp);
            if (s.equals("886")){
                ds.close();
                break;
            }else{
                continue;
            }
        }
    }
}
