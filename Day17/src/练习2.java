import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class 练习2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("zhangsan,23");
        list.add("lisi,24");
        list.add("wangwu,25");
        Map<String,Integer> m = list.stream().filter(s->Integer.parseInt(s.split(",")[1])>=24).collect(Collectors.toMap(s->s.split(",")[0], v->Integer.parseInt(v.split(",")[1])));
        System.out.println(m);
    }
}
