import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Random;

public class 直播抽奖 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 999, 9999};
        Random ran = new Random();
        int[] newarray = new int[arr.length];
        for (int i = 0; i < 5; i++) {
            int randomindex = ran.nextInt(arr.length);
            int prize = arr[randomindex];
            if(!Isin(prize,newarray)){
                newarray[i]=prize;
            }
        }
        for (int i = 0; i < newarray.length; i++) {
            System.out.println(newarray[i]);
        }

    }
    public static boolean Isin(int p,int arr[]){
        for (int i = 0; i < arr.length;i++) {
            if(p==arr[i]){
                return true;
            }
        }
        return false;
    }
}
