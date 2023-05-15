package IO_字符字节练习;

import com.sun.tools.javac.Main;

import java.io.*;

public class 序列化流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        student stu1 = new student("zhangsan", 23);
        student stu2 = new student("lisi", 24);
        student stu3 = new student("wangwu", 25);
        student stu4 = new student("xiaomeng", 26);
        student stu5 = new student("laopo", 27);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\d.txt"));
        oos.writeObject(stu1);
        oos.writeObject(stu2);
        oos.writeObject(stu3);
        oos.writeObject(stu4);
        oos.writeObject(stu5);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\d.txt"));
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        ois.close();
    }
}
