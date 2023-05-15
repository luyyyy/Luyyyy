package MyIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class IO_02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Day19\\a.txt");
        byte[] bytes = fis.readAllBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println((char)bytes[i]);
        }
        fis.close();

    }
}
