package code;
/*
细节
1.用户输入时，用next接收字符串，如果用nextInt接收，用户输入其他类型会报错，不利于代码健壮性
2.可以给循环起名字，比如loop：while，退出时break loop；
3.System.exit(0) 停止虚拟机
 */
import jdk.swing.interop.SwingInterOpUtils;

import java.net.http.HttpConnectTimeoutException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class 学生管理系统 {
    public static void main(String[] args) {
       loop: while(true){
            showMenu();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择：");
            String select = sc.next();
            ArrayList <student> list = new ArrayList<>();
            switch(select){
                case"1":
                    System.out.println("请输入学生的ID：");
                    String ID = sc.next();
                    System.out.println("请输入学生的地址：");
                    String Address =sc.next();
                    System.out.println("请输入学生的姓名：");
                    String Name =sc.next();
                    System.out.println("请输入学生的年龄：");
                    int Age = sc.nextInt();
                    addStu(ID, Name, Age, Address, list);
                    continue;
                case "2":
                    System.out.println("请输入要删除学生的ID：");
                    String Id = sc.next();
                    boolean flag = delete(Id, list);
                    if(flag){
                        System.out.println("删除成功！");
                    }
                    System.out.println("该用户不存在！");
                case "3":

                case "4":
                    findstu(list);
                case"5":
                    break loop;
                default:
                    System.out.println("输入有误！");
            }
        }
    }
    public static void showMenu(){
        System.out.println("-------------------欢迎来到黑马学生管理系统-----------------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出系统");
    }
    public static void addStu(String id,String name,int age,String address,ArrayList <student> list){
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                System.out.println("该用户已存在！");
                return ;
            }
        }
        student Student = new student(id,name,age,address);
        list.add(Student);
    }
    public static boolean delete (String id,ArrayList<student>list){
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    public static void findstu(ArrayList<student>list){
        System.out.println(list.get(0).getId());
        if(list.size()==0){
            System.out.println("当前学生列表为空！");
            return;
        }
        System.out.println("ID\t\t姓名\t年龄\t家庭住址\t");
        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
        }

    }



}
