import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 练习7 {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        Collections.addAll(list,new student("张三",23),
                new student("李四",24),new student("王五",25));
        String[] strings = list.stream().map(new 练习7()::pinjie).toArray(String[]::new);
        System.out.println(Arrays.toString(strings));
    }
    public String pinjie (student s){
        return s.getName()+s.getAge();
    }
}
