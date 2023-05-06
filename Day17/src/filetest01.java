import java.io.File;

public class filetest01 {
    public static void main(String[] args) {
        File file1 = new File("c:\\a.txt");
        File file2 = new File("c:\\", "b.txt");
        File file3 = new File(file1, "c.txt");
        System.out.println(file3);
    }
}
