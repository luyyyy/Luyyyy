import java.util.ArrayList;
import java.util.StringJoiner;

public class arraylisttest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("hello");
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < list.size(); i++) {
            sj.add(list.get(i));
        }
        System.out.println(sj);
    }
}
