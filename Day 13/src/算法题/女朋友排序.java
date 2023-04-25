package 算法题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/*
定义数组并存储女朋友对象，利用arrays进行排序
两个要求：
1.属性有姓名、年龄、身高
2.按照年龄排序，年龄一样按照身高排序，身高一样按照姓名首字母排序
 */
/*
算法思路：
1.首先创建数组和女朋友对象，将女朋友对象存入数组
2.用arrays进行排序，重写sort方法
注意事项：
1.string的compareTo可以比较字母在字典中的顺序
2.匿名内部类可以用lambda表达式简化
3.三元运算符比较
 */
public class 女朋友排序 {
    public static void main(String[] args) {
        girlfriend gr1 = new girlfriend(18, "xiaomeng",175);
        girlfriend gr2 = new girlfriend(19, "yanlingji",170);
        girlfriend gr3 = new girlfriend(18, "shaosiming",171);
        girlfriend [] arr = {gr1,gr2,gr3};
        Arrays.sort(arr, new Comparator<girlfriend>() {
            @Override
            public int compare(girlfriend g1, girlfriend g2) {
                double temp = g1.getAge() - g2.getAge();
                temp = temp ==0 ? g1.getHight()-g2.getHight():temp;
                temp = temp==0 ? g1.getName().compareTo(g2.getName()):temp;
                if (temp>0){
                    return 1;
                }else if (temp<0){
                    return -1;
                }else {
                    return 0;

                }}
        });
        System.out.println(Arrays.toString(arr));
    }
}
