import java.util.ArrayList;
import java.util.Collections;

public class 综合练习 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","天明","少司命","晓梦");
        ArrayList <String> temp = new ArrayList<>();
        Collections.shuffle(list);
        while (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
                temp.add(list.remove(i));
            }
        }
        System.out.println("现在开始第二轮点名：");
        Collections.shuffle(temp);

        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));
        }
    }
}
