import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class 练习5 {
    public static void main(String[] args) {
//        ArrayList <String> list = new ArrayList<>();
//        Collections.addAll(list,"张三，23","李四，24","王五，25");
//        Stream<student> studentStream = list.stream().map(student::new);
//        student[] students = studentStream.toArray(student[]::new);
//        System.out.println(Arrays.toString(students));
        int [] arr = {1,2,3,4};
        //可能会出现异常的代码
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        System.out.println("我在执行了");


    }
}
