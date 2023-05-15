package IO_字符字节练习;

import java.io.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class 综合练习 {
//    public static void main(String[] args) throws IOException {
//        File input = new File("D:\\IO_test");
//        File output = new File("D:\\");
//        copy(input,output);
//    }
//    public static void copy(File input,File output) throws IOException {
//        if (input.isFile()){
//            FileInputStream fis = new FileInputStream(input);
//            FileOutputStream fos = new FileOutputStream(output+input.getName());
//            int b;
//            byte[] arr = new byte[1024 * 1024 * 10];
//            while((b=fis.read(arr))!=-1){
//                fos.write(arr,0,b);
//            }
//            fos.close();
//            fis.close();
//        }else{
//            if (input.listFiles().length!=0){
//                for (File file : input.listFiles()) {
//                    copy(file,output);
//                }
//            }
//        }
//    }
public static void main(String[] args) throws IOException {
    File input = new File("D:\\IO_test\\a.txt");
    File output = new File("D:\\"+input.getName());
    copy(input,output);
}
public static void copy(File i,File o) throws IOException {
    if (i.isFile()){
        BufferedReader br = new BufferedReader(new FileReader(i));
        BufferedWriter bw = new BufferedWriter(new FileWriter(o));
        int b;
        char[] arr = new char[1024 * 1024 * 10];
        while ((b=br.read(arr))!=-1){
            bw.write(arr,0,b);
        }
        PrintStream ps = new PrintStream("D:\\" + i.getName());
        ps.println("你好你好");
        bw.close();
        br.close();
        ps.close();
        
    }
}

}
