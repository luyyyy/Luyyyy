import java.util.Comparator;
import java.util.TreeMap;

public class treemap1 {
    public static void main(String[] args) {
        TreeMap <Integer,String> tm = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer t1) {
                return i-t1;
            }
        });
        tm.put(02,"mianbao");
        tm.put(01,"jiaozi");
        tm.put(03,"yutou");
        tm.forEach((id,name)-> System.out.println(id+"="+name));

    }
}
