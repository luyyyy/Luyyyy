import java.math.BigInteger;
import java.util.Random;

public class 插入排序 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int [] arr =new int [1000];
        Random rn = new Random();
        for (int i = 0; i < 1000; i++) {
            arr [i] =rn.nextInt(10000);
        }
       insertSort(arr);
        long end = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(

        );
        System.out.print("程序运行了：");
        System.out.println(end-start+"毫秒");
    }

    private static void insertSort(int[] arr) {
        int startIndex = -1;//对startIndex进行初始化
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                startIndex = i+1;
                break;//找到无序的第一个索引
            }
        }
        //遍历无序的数据部分
        for (int i = startIndex; i < arr.length; i++) {
            //拿到了每一个数字，将其插入到有序序列
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]=temp;
                j--;//从后往前依次判断

            }
        }
    }
}
