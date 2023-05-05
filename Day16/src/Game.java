import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Game {
    static ArrayList <String> list=new ArrayList<>();//静态访问静态
    HashMap <String,Integer>hm = new HashMap<>();
    //准备牌：静态代码块
    static {
        String [] color = {"♠","♣","♥","♦"};
        String [] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int j=0;j<4;j++) {
            for (int i = 0; i < number.length; i++) {
                list.add(color[j]+number[i]);
            }
        }
        list.add(" King");
        list.add(" Queen");
    }
    public Game(){
        //洗牌
        Collections.shuffle(list);
//        for (String s : list) {
//            System.out.println(s);
//        }


        //发牌：四个集合存储牌
        ArrayList <String>lord = new ArrayList<>();
        ArrayList <String>player1 = new ArrayList<>();
        ArrayList <String>player2 = new ArrayList<>();
        ArrayList <String>player3= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i>=0&&i<3){
                lord.add(list.get(i));
            } else if (i%3==0) {
                player1.add(list.get(i));
            }else if (i%3==1) {
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }
//        System.out.println(player1.size());
//        System.out.println(player2.size());
//        System.out.println(player3.size());


        //排序
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("King",17);
        hm.put("Queen",16);
        //创建方法实现
        sort(lord);
        sort(player1);
        sort(player2);
        sort(player3);
        //看牌:创建一个方法实现
        lookpoker("底牌",lord);
        lookpoker("张三",player1);
        lookpoker("李四",player2);
        lookpoker("王五",player3);
    }
    public void lookpoker(String name,ArrayList<String>list){
        System.out.println(name + ":");
        for (String s : list) {
            System.out.print(s);
        }
        System.out.println();
    }
    public void sort (ArrayList<String>list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                String color2 = o2.substring(0, 1);
                String value1 = o1.substring(1);
                String value2 = o2.substring(1);
                int i = getValue(value1) - getValue(value2);
                return i ;
            }
        });
    }
    public int getValue(String value){
        if(hm.containsKey(value)){
            return hm.get(value);
        }else{
            return Integer.parseInt(value);
        }
    }

}
