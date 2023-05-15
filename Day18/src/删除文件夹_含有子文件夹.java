import java.io.File;

public class 删除文件夹_含有子文件夹 {
    public static void main(String[] args) {
        String s = "D:\\test";
        System.out.println(delDir(s));
    }

    public static boolean delDir(String s) {
        File p = new File(s);
        if (p.isFile()) {
            return p.delete();
        } else if (p.isDirectory()) {
                if(p.listFiles().length!=0){
                    for (int i = 0; i < p.listFiles().length; i++)
                    delDir(p.listFiles()[i].toString());
                }else{
                    return p.delete();
                }

        }
        return false;
    }
}
