package Day4;

import java.util.Scanner;

public class 用户登录 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String muser = "luyyyy";
        String mpassword = "315231";
//        System.out.println("请输入您的用户名：");
//        String user =sc.next();
//        System.out.println("请输入您的密码：");
//        String password = sc.next();
//        boolean replyUser = user.equals(muser);
//        boolean replyPassword = password.equals(mpassword);
        for (int i = 0; i < 3; ) {
            System.out.println("请输入您的用户名：");
            String user = sc.next();
            System.out.println("请输入您的密码：");
            String password = sc.next();
            boolean replyUser = user.equals(muser);
            boolean replyPassword = password.equals(mpassword);
            if (replyPassword && replyUser) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("请您输入正确的账号或者密码！");
            if (i < 2) {
                    System.out.println("您还有" + (2 - i) + "次机会！");
                }
            i++;

            }
        }
        System.out.println("登陆失败！");
//            System.out.println("请您稍后再试！");
    }
}
