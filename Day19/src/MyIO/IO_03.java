package MyIO;

import java.io.FileInputStream;
import java.io.IOException;

public class IO_03 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("Day19\\a.txt");
        int b;
        while((b=file.read())!=-1){
            System.out.print((char)b);
        }
        file.close();
    }
}
