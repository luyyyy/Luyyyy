package IO_字符字节练习;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class 修改数据 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IO_test\\a.txt");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("D:\\b.txt");
        int[] arr = new int[6];
        arr[0]=fis.read();
        int index=1;
        while (fis.read()!=-1){
            arr[index]=fis.read();
            index++;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1){
                fos.write(arr[i]);
            }else{
                fos.write(arr[i]);
                fos.write(45);
            }
        }
        fos.close();
        fis.close();
    }
}
