import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class filetest02 {
    public static void main(String[] args) {
        File p = new File("D:\\");
        System.out.println(Arrays.toString(p.listFiles()));

    }
}
