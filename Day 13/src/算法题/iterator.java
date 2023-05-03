package 算法题;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class iterator {
    public static void main(String[] args) {
        girlfriend gr1 = new girlfriend(18, "xiaomeng",175);
        girlfriend gr2 = new girlfriend(19, "yanlingji",170);
        girlfriend gr3 = new girlfriend(18, "shaosiming",171);
        Collection<girlfriend> coll = new ArrayList<>();
        coll.add(gr1);
        coll.add(gr2);
        coll.add(gr3);
        //contains方法测试
        girlfriend gr4 = new girlfriend(18, "shaosiming",171);
        boolean flag = coll.contains(gr4);
        System.out.println(flag);
        //迭代器遍历
        Iterator<girlfriend> it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //增强for遍历
       for(girlfriend gr :coll){
           System.out.println(gr);
       //lambda表达式遍历
           coll.forEach(s-> System.out.println(s));
        }
    }
}
