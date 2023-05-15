import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class 统计文件夹中文件的个数 {
    public static void main(String[] args) {
        File file = new File("D:\\迅雷下载");
        System.out.println(count(file));
    }

    public static HashMap<String, Integer> count(File file) {
        HashMap<String, Integer> hm = new HashMap<>();
            for (File f : file.listFiles()) {
                if (f.isFile()){
                    String k = f.getName().split("\\.")[1];
                    if (hm.containsKey(k)){
                        Integer aa = hm.get(k);
                        aa++;
                        hm.put(k,aa);
                    } else{
                        hm.put(k,1);
                    }
                }else{
                    HashMap<String, Integer> sonmap = count(f);
                    for (Map.Entry<String, Integer> entry : sonmap.entrySet()) {
                        String key = entry.getKey();
                        int value = entry.getValue();
                        if (hm.containsKey(key)){
                            value = hm.get(key)+value;
                            hm.put(key,value);
                        }else{
                            hm.put(key,value);
                        }
                    }
                }
            }
            return hm;
        }
}
