import java.io.File;
import java.io.IOException;

public class file01 {
    public static void main(String[] args) {
        File p = new File("a.txt");
        System.out.println(p.delete());
//        try {
//            System.out.println(p.createNewFile());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
