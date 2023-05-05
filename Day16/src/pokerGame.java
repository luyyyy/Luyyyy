import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class pokerGame {
    static ArrayList <Integer>list = new ArrayList<>();
    static HashMap <Integer,String> hm = new HashMap<>();
    static {
        //准备有序牌
        String [] color = {"♠","♣","♥","♦"};
        String [] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int num = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < color.length; j++) {
                hm.put(num,color[j]+number[i]);
                list.add(num);
                num++;
            }
        }
        hm.put(num,"小王");
        list.add(num);
        num++;
        list.add(num);
        hm.put(num,"大王");
        TreeSet <Integer> lord= new TreeSet<>();
        TreeSet <Integer> player1= new TreeSet<>();
        TreeSet <Integer> player2= new TreeSet<>();
        TreeSet <Integer> player3= new TreeSet<>();
    }
    public pokerGame(){
        TreeSet <Integer> lord= new TreeSet<>();
        TreeSet <Integer> player1= new TreeSet<>();
        TreeSet <Integer> player2= new TreeSet<>();
        TreeSet <Integer> player3= new TreeSet<>();
        //洗牌
        Collections.shuffle(list);
        //发牌
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(i<3){
                lord.add(num);
            } else if (i%3==0) {
                player1.add(num);
            } else if (i%3==1) {
                player2.add(num);
            }else{
                player3.add(num);
            }
        }
//        System.out.println(lord);
//        System.out.println(player1);
//        System.out.println(player2);
//        System.out.println(player3);
        //看牌:创建方法
        lookPoker("底牌",lord);
        lookPoker("张三",player1);
        lookPoker("李四",player2);
        lookPoker("王五",player3);
    }
    public void lookPoker(String name,TreeSet <Integer> ts){
        System.out.println(name+":");
        for (Integer t : ts) {
            System.out.print(hm.get(t));
        }
        System.out.println();
    }

}
