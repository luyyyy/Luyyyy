package IO_字符字节练习;

import java.io.*;

public class 拷贝文件夹 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IO_test");
        copyDir(file);
    }
    public static void copyDir(File p) throws IOException {
        if (p.isFile()){
            FileInputStream fis = new FileInputStream(p);
            String name = p.getName();
            FileOutputStream fos = new FileOutputStream("D:\\"+name);
            int len;
            byte []arr = new byte[1024*1024*10];
            while ((len=fis.read(arr))!=-1){
                fos.write(arr,0,len);
            }
            fos.close();
            fis.close();
        }else{
            if (p.listFiles().length!=0){
                for (File file : p.listFiles()) {
                    copyDir(file);
                }
            }
        }
    }
}
