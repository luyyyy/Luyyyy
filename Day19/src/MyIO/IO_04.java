package MyIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_04 {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("Day19\\a.txt");
        FileOutputStream output = new FileOutputStream("D:\\a.txt");
        long start = System.currentTimeMillis();
        int b;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((b=input.read(bytes))!=-1){
            output.write(bytes,0,b);
        }
        output.close();
        input.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
