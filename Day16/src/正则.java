import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则 {
    public static void main(String[] args) {
        String num = "/dev/mnt";
        Pattern p = Pattern.compile("/^\\/(?:[^/]+\\/)*[^/]+$/");
        Matcher m = p.matcher(num);
        System.out.println(m.find());

    }
}
