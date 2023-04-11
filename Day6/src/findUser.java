import java.util.ArrayList;
import java.util.Scanner;
/*
需求：
1.main方法中定义一个集合，存入三个用户对象。
用户属性为: id , username, password
2.要求:定义一个方法，根据id查找对应的用户信息,如果存在，返回true
如果不存在，返回false
思路：
1.arrarList 存入对象
2.bool判断是否存在这样一个id
3.返回参数

 */
public class findUser {
    public static void main(String[] args) {
        ArrayList <user> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的id：");
        String findUser = sc.next();
        user user1 = new user("0001","张三","123456");
        user user2 = new user("0002","李四","123456");
        user user3 = new user("0003","王五","123456");
        list.add(user1);
        list.add(user2);
        list.add(user2);
        boolean flag = ifIn(list, findUser);
        System.out.println(flag);
    }
    public static boolean ifIn (ArrayList <user> list,String s1){
        for (int i = 0; i < list.size(); i++) {
            user user = list.get(i);
            if(user.getId().equals(s1)){
                return true;
            }
        }
        return false;
    }

}
