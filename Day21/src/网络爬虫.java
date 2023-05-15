import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 网络爬虫 {
    public static void main(String[] args) throws IOException {
        String familyNameNet = "https://www.diyifanwen.com/tool/baijiaxing/";
        //获取网站内容
        String s = webCrawl(familyNameNet);
        //正则表达式
        String regex = "[\\u4E00-\\u9FA5]{4}";
        getData(s,regex);
    }
    public static String webCrawl(String s) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(s);
        URLConnection conn = url.openConnection();
        InputStream inputStream = conn.getInputStream();
        InputStreamReader ir = new InputStreamReader(inputStream, Charset.forName("gbk"));
        int ch;
        while((ch = ir.read())!=-1){
            sb.append((char)ch);
        }
        ir.close();
        return sb.toString();
    }
    public  static ArrayList<String> getData(String s,String regex){
        ArrayList<String> list = new ArrayList<>();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
        return list;
    }

}
