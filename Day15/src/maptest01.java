import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class maptest01 {
    public static void main(String[] args) {
        Map <String,String> m = new HashMap<>();
        m.put("a","b");
        m.put("b","c");
        m.put("c","d");
        m.forEach((key, value)->System.out.println(key+"="+value)
        );
    }
}
