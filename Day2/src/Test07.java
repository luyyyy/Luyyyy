import java.util.Random;

public class Test07 {
    public static void main(String[] args) {
        int[]array=new int[10];
        int i = 0;
        System.out.println("数组中的元素为：");
        for( i =0;i<10;i++){
            Random random=new Random();
            array[i]=random.nextInt(99)+1;
            System.out.print(array[i]+" ");
        }
        int sum=0;
        int count=0;
        for(i=0;i<10;i++){
            sum+=array[i];
        }
        System.out.println("\n数组中所有元素的值之和为：");
        System.out.println(sum);
        System.out.println("数组中所有元素的平均值为：");
        System.out.println((double) sum/10);
        System.out.println("数组中小于平均值的元素为：");
        for(i=0;i<10;i++){
            if(array[i]<sum/10){
                System.out.print(array[i]+" ");
                count++;
            }
        }
        System.out.println("\n数组中小于平均值的元素个数为："+count);
    }
}
