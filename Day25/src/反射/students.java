package 反射;

public class students {
    public String name;
    public int age;

    public students() {
    }

    public students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private students(String s){
        this.name=s;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "students{name = " + name + ", age = " + age + "}";
    }
}
