import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamdemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三三-23");
        list.add("张四-2");
        list.add("张五-25");
        list.add("赵六-25");
        Map <String,Integer> m =list.stream().collect(Collectors.toMap(s->s.split("-")[0], s->Integer.parseInt(s.split("-")[1])));
        System.out.println(m);
    }
}

