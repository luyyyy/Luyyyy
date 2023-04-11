import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Random;
import java.util.Scanner;
/*
思路整理：
1.Scanner读取键盘输入的金额；
2.利用之前的方法取出数字放入数组
3.arr[i]表示的是拆分后的数字，i为0-7，arr[i]为0-9，利用哈希映射将数字0-9映射到大写中文
4.遍历得到结果
5.优化思路：防止用户输入无效金额，提高代码健壮性，加入while循环判断输入是否合法
 */
public class 金额转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        int remain = 0;
        int [] arr = new int[7];
        int count = 0;
        String [] arrA = {"零","壹","贰","参","肆","伍","陆","柒","捌","玖"};
        while (true) {
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if(money>=0&&money<=9999999){
                break;
            }else{
                System.out.println("输入无效！");
            }
        }
        for(int i=0;i<7;i++){
            remain = money%10;
            money /= 10;
            arr[i]=remain;
            count ++;}

        System.out.print(arrA[arr[6]]+"佰"+arrA[arr[5]]+"拾"+arrA[arr[4]]+"万"+arrA[arr[3]]+"千"+arrA[arr[2]]+"佰"+arrA[arr[1]]+"拾"+arrA[arr[0]]+"元");

    }
}
