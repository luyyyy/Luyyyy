package 算法题;
/*
猴子每天吃掉一般桃子再多吃一个，到第十天发现只剩一个桃子了，求原来有多少个桃子
反向递归
 */
public class 猴子吃桃子 {
    public static void main(String[] args) {
        System.out.println(getNUm(1));
    }
    public static int getNUm(int day){
        if(day==10){
            return 1;
        }
        return (getNUm(day+1)+1)*2;
    }

}
