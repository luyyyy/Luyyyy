package Day4;

import java.util.Random;

public class role {
    private String name;
    private int blood;
    private String preferance;
    private String gender;
    private String attackMode;
    private String ingurymode;

    public role() {
    }

    public role(String name, int blood, String preferance, String gender, String attackMode, String ingurymode) {
        this.name = name;
        this.blood = blood;
        this.preferance = preferance;
        this.gender = gender;
        this.attackMode = attackMode;
        this.ingurymode = ingurymode;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     * @return preferance
     */
    public String getPreferance() {
        return preferance;
    }

    /**
     * 设置
     * @param preferance
     */
    public void setPreferance() {
        String[] mode = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
        Random r = new Random();
        int select = r.nextInt(mode.length);
        this.preferance=mode[select];
    }



    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return attackMode
     */
    public String getAttackMode() {
        return attackMode;
    }

    /**
     * 设置
     * @param attackMode
     */
    public void setAttackMode() {
        String[] attack={
                "使出了一招【背心钉】，转到对方的身后，一掌向对方背心的灵台穴拍去。", "使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向对方",
                "大喝一声，身形下伏，一招【劈雷坠地】，捶向对方", "运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向对方", "阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向对方", "上步抢身，招中套招，一招【劈挂连环】，连环攻向对方"
        };
        Random r = new Random();
        int select = r.nextInt(attack.length);
        this.attackMode=attack[select];

    }

    /**
     * 获取
     * @return ingurymode
     */
    public String getIngurymode() {

        return ingurymode;
    }

    /**
     * 设置
     * @param ingurymode
     */
    public void setIngurymode() {
        String[] injure={ "退了半步，毫发无损", "身体出现一处瘀伤",
                "被一击命中，痛得弯下腰肢",
                "痛苦地闷哼了一声，显然受了点内伤", "摇摇晃晃，一跤摔倒在地",
                "脸色一下变得惨白，连退了好几步", "受到重伤，口中鲜血狂喷而出", "一声惨叫，像滩软泥般塌了下去"
        };
        Random r = new Random();
        int select = r.nextInt(injure.length);
        this.ingurymode =injure[select];

    }
}
