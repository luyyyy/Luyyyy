import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class 练习3 {
    public static void main(String[] args) {
        ArrayList<String> actormale = new ArrayList<>();
        ArrayList<String> actorfemale = new ArrayList<>();
        actormale.add("张三,23");
        actormale.add("胡歌,20");
        actormale.add("周杰伦,30");
        actormale.add("阿信,33");
        actormale.add("林俊杰,34");
        actormale.add("胡彦斌,28");
        actorfemale.add("迪丽热巴，19");
        actorfemale.add("杨千嬅，19");
        actorfemale.add("杨蓉，20");
        actorfemale.add("程潇，19");
        actorfemale.add("周冬雨，25");
        actorfemale.add("赵薇，30");
        //筛选
        Stream<String> acm = actormale.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        Stream<String> acf = actorfemale.stream().filter(s -> s.startsWith("杨")).skip(1);
        Stream<String> concat = Stream.concat(acm, acf);
        Stream<actor> actorStream = concat.map(s -> new actor(s));
        List<actor> actorList = actorStream.toList();
        System.out.println(actorList);
    }
}
