package MyIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_01 {
    public static void main(String[] args) throws IOException {
        File file = new File("Day19\\a.txt");
        byte [] arr = {97,98,99,100};
        FileOutputStream output = new FileOutputStream(file,true);
        output.write(arr,1,3);
//        String str = "\r\n";
        output.write("\r\n".getBytes());
        output.write(99);
        output.close();
    }
}
