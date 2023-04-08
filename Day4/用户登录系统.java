package Day4;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class 用户登录系统 {
    public static void main(String[] args) {
        User luyyyy = new User();
        luyyyy.setName("luyyyy");
        luyyyy.setEmail("1332@qq.com");
        luyyyy.setPassword("220550");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        System.out.println("请输入邮箱地址：");
        String email = sc.next();
        if(user==luyyyy.getName()&&password==luyyyy.getPassword()&&email==luyyyy.getEmail()){
            System.out.println("登陆成功！");
        }else{
            System.out.println("登陆失败！");
        }


    }
}
