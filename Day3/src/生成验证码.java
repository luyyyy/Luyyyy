import java.util.Random;

public class 生成验证码 {
    public static void main(String[] args) {
        char []chr = new char[52];
        for(int i=0;i<chr.length;i++){
            if(i<25) {
                chr[i] = (char) (i + 97);
            } else if (i>25&&i<chr.length) {
                chr[i]=(char)(i+65-26);
            }
        }
        Random ran = new Random();
        int num = ran.nextInt(10);
        String result = "";
        for (int i=0;i<4;i++){
           int randomindex =ran.nextInt(52);
           result = result + chr[randomindex];
        }
        System.out.println(result+num);
    }
}
