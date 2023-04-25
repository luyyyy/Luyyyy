import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class te {
   public static void main(String[] args) throws ParseException {
      String text = "2000-11-11";
      SimpleDateFormat si = new SimpleDateFormat("yyyy-mm-dd");
      SimpleDateFormat s2 = new SimpleDateFormat("yyyy年mm月dd日");
      Date date = si.parse(text);
      String s = s2.format(date);
      System.out.println(s);

   }
}
