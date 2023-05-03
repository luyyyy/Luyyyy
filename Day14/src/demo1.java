import java.awt.*;
import java.util.*;

public class demo1{
    public static void main(String[] args) {
        student s1 = new student("zhangsan",23,99,100,80);
        student s2 = new student("wangwu",24,87,66,54);
        student s3 = new student("lisi",25,62,75,70);
        student s4 = new student("zhangsi",23,95,90,99);
        ArrayList <student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("排序前：");
        for (student s : list) {
            System.out.println(s);
        }
        System.out.println("排序后：");
        Collections.sort(list);
        for (student s : list) {
            System.out.println(s);
        }
//        TreeSet<student> ts = new TreeSet<>(new Comparator<student>() {
//            @Override
//            public int compare(student s, student t1) {
//                int sum1 =s.getPoint1()+s.getPoint2()+s.getPoint3();
//                int sum2 =t1.getPoint1()+t1.getPoint2()+t1.getPoint3();
//                int temp = sum1-sum2;
//                temp=temp==0?s.getPoint1()-t1.getPoint1():temp;
//                temp=temp==0?s.getPoint2()-t1.getPoint2():temp;
//                temp=temp==0?s.getPoint3()-t1.getPoint3():temp;
//                temp=temp==0?s1.getAge()-t1.getAge():temp;
//                temp=temp==0?s1.getName().compareTo(t1.getName()):temp;
//                return temp;
//            }
//        });
//        ts.add(s1);
//        ts.add(s2);
//        ts.add(s3);
//        ts.add(s4);
//        System.out.println(ts);
    }}
