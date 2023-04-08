package Day4;

import java.util.Random;

public class User {

    private String name;
    private String password;
    private String email;
    private int preferance;
    private String gender;
    private int attackMode;
    private int ingurymode;


    public User() {
    }

    public User(String name, String password, String email, int preferance, String gender, int attackMode, int ingurymode) {
        this.name = name;
        this.password = password;
        this.email = email;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return preferance
     */
    public int getPreferance() {
        return preferance;
    }

    /**
     * 设置
     * @param preferance
     */
    public String setPreferance() {
        String [] mode = {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
        Random r = new Random();
        int select = r.nextInt(mode.length);
        return mode[select];

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
    public int getAttackMode() {
        return attackMode;
    }

    /**
     * 设置
     * @param attackMode
     */
    public void setAttackMode(int attackMode) {
        this.attackMode = attackMode;
    }

    /**
     * 获取
     * @return ingurymode
     */
    public int getIngurymode() {
        return ingurymode;
    }

    /**
     * 设置
     * @param ingurymode
     */
    public void setIngurymode(int ingurymode) {
        this.ingurymode = ingurymode;
    }

    public String toString() {
        return "User{name = " + name + ", password = " + password + ", email = " + email + ", preferance = " + preferance + ", gender = " + gender + ", attackMode = " + attackMode + ", ingurymode = " + ingurymode + "}";
    }
}
