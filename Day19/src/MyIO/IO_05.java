package MyIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class IO_05 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\a.txt");
        fw.write("你真帅！");
        fw.close();
        FileReader fd = new FileReader("D:\\a.txt");
        char []arr = new char[1024];
        int len;
        while((len=fd.read(arr))!=-1){
            System.out.println(new String(arr, 0, len));
        }
    }
}
