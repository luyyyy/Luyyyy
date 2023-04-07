import java.util.Random;

public class 计算成绩 {
    public static void main(String[] args) {
        Random ran = new Random();
        int [] arr = new int [6];
        for (int i =0;i< arr.length;i++){
            arr[i] = ran.nextInt(20)+80;
            System.out.print(arr[i]+" ");
        }
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            }
        int max=arr[0], min = arr[0];
        for (int j =0;j<arr.length;j++){
            max=max>arr[j]?max:arr[j];
            min=min<arr[j]?min:arr[j];
        }
        double result = (sum-max-min)/4;
        System.out.println("选手的最终成绩为："+result);
    }
}
