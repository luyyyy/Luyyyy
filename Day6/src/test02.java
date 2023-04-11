import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        ArrayList <student> list = new ArrayList<>();
        student stu1 = new student("梨花",12);
        student stu2 = new student();
        stu2.setAge(18);
        stu2.setName("小明");
        list.add(stu1);
        list.add(stu2);
        for (int i = 0; i < list.size(); i++) {
            student student = list.get(i);
            System.out.println("第"+(i+1)+"名学生的名字是："+student.getName());
            System.out.println("第"+(i+1)+"名学生的年龄是："+student.getAge());
        }
    }
}
