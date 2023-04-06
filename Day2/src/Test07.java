import java.util.Random;

public class Test07 {
    public static void main(String[] args) {
        int[]array=new int[10];
        int i = 0;
        for( i =0;i<10;i++){
            Random random=new Random();
            array[i]=random.nextInt(99)+1;
            System.out.println(array[i]);
        }
    }
}
