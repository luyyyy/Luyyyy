import java.util.HashMap;

public class 学生籍贯对应 {
    public static void main(String[] args) {
        student stu1 = new student("zhangsan",23);
        student stu2 = new student("lisi",24);
        student stu3 = new student("wangwu",25);
        student stu4 = new student("wangwu",25);
        HashMap<student,String> hm = new HashMap<>();
        hm.put(stu1,"河南省");
        hm.put(stu2,"河南省");
        hm.put(stu3,"河南省");
        hm.forEach((stu,s)-> System.out.println(stu + "=" + s));
        System.out.println(stu4.getName().equals(stu3.getName()));
    }
}
