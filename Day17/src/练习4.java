import java.util.Arrays;

public class 练习4 {
    public static void main(String[] args) {
        //倒序排列数组
        Integer [] arr = {1,2,3,4,5,6,7,8};
        Arrays.sort(arr,(o1,o2)-> o2-o1);
        System.out.println(Arrays.toString(arr));
    }
}
