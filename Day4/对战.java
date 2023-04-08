package Day4;

import javax.lang.model.element.QualifiedNameable;
import java.util.Random;

public class 对战 {
    public static void main(String[] args) {
        role Qiaofeng = new role();
        Qiaofeng.setName("Qiaofeng");
        Qiaofeng.setBlood(100);
        Qiaofeng.setGender("男");
        Qiaofeng.setPreferance();
        Qiaofeng.setAttackMode();
        Qiaofeng.setIngurymode();
        role JiuMoZhi = new role();
        JiuMoZhi.setBlood(100);
        JiuMoZhi.setName("JiuMoZhi");
        JiuMoZhi.setGender("男");
        JiuMoZhi.setPreferance();
        JiuMoZhi.setIngurymode();
//        JiuMoZhi.setAttackMode();
        System.out.println("选手简介：");
        System.out.println("登场的第一位选手是："+Qiaofeng.getName());
        System.out.println("选手: "+Qiaofeng.getName());
        System.out.println("性别: "+Qiaofeng.getGender());
        System.out.println("长相: "+Qiaofeng.getPreferance());
        System.out.println("登场的第二位选手是："+JiuMoZhi.getName());
        System.out.println("选手: "+JiuMoZhi.getName());
        System.out.println("性别: "+JiuMoZhi.getGender());
        System.out.println("长相: "+JiuMoZhi.getPreferance());
        System.out.println("--------------------------------------------");
        System.out.println("开始对战");
        System.out.println("--------------------------------------------");
        Compete(Qiaofeng, JiuMoZhi);
    }

    public static void Compete(role c1, role c2) {
        Random r = new Random();
        int remainQ = c1.getBlood(), remainJ = c2.getBlood();
        while (remainQ > 0 && remainJ > 0) {
            c1.setIngurymode();
            c2.setIngurymode();
            c2.setAttackMode();
            c1.setAttackMode();
            int hurtQ = r.nextInt(20);
            remainQ -= hurtQ;
            if (remainQ <= 0) {
                System.out.println(c2.getName()+c2.getAttackMode()+","+c1.getName()+c1.getIngurymode()+","+c2.getName()+"对"+c1.getName()+"造成了" + hurtQ + "点伤害,"+c1.getName()+"血量已耗尽！");
                break;
            }
            System.out.println(c2.getName()+c2.getAttackMode()+","+c1.getName()+c1.getIngurymode()+","+c2.getName()+"对"+c1.getName()+"造成了" + hurtQ + "点伤害，"+c1.getName()+"还剩下" + remainQ + "点血！");
            int hurtJ = r.nextInt(20);
            remainJ -= hurtJ;
            if (remainJ <= 0) {
                System.out.println(c1.getName()+c1.getAttackMode()+","+c2.getName()+c2.getIngurymode()+","+c1.getName()+"对"+c2.getName()+"造成了" + hurtJ + "点伤害,"+c2.getName()+"血量已耗尽！");
                break;
            }
            System.out.println(c1.getName()+c1.getAttackMode()+","+c2.getName()+c2.getIngurymode()+","+c1.getName()+"对"+c2.getName()+"造成了" + hurtJ + "点伤害，"+c2.getName()+"还剩下" + remainJ + "点血！");
        }
        if (remainQ <= 0) {
            System.out.println("鸠摩智K.O.了乔峰！");
        } else {
            System.out.println("乔峰K.O.了鸠摩智！");
        }
    }
}
