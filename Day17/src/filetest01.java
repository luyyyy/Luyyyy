import java.io.File;
import java.math.BigInteger;
import java.text.SimpleDateFormat;

public class filetest01 {
    public static void main(String[] args) {
        File file1 = new File("c:\\a.txt");
        File file2 = new File("c:\\", "b.txt");
        File file3 = new File(file1, "c.txt");
        System.out.println(file3);
        System.out.println(file3.getAbsoluteFile());
        System.out.println(file3.getPath());
        File file = new File("a.txt");
        System.out.println(file.getAbsoluteFile());
        BigInteger date = new BigInteger("1667380952425");
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(date));
    }
}
