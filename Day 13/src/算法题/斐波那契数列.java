package 算法题;
//递归方式求斐波那契数列
public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(getSum(12));
    }
    public static int getSum(int month){
        if (month==1||month==2){
            return 1;
        }
        return getSum(month -1)+getSum(month-2);
    }

}
