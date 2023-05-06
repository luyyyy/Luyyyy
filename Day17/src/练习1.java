import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 练习1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            list.add(i);
        }
        Integer[] i = list.stream().filter(j -> j % 2 == 0).toArray(c -> new Integer[c]);
        System.out.println(Arrays.toString(i));
    }
}
