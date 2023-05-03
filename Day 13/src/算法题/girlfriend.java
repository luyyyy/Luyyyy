package 算法题;

import java.util.Objects;

public class girlfriend {
    private int age;
    private String name;
    private double hight;

    public girlfriend() {
    }

    public girlfriend(int age, String name, double hight) {
        this.age = age;
        this.name = name;
        this.hight = hight;
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
     * @return hight
     */
    public double getHight() {
        return hight;
    }

    /**
     * 设置
     * @param hight
     */
    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        girlfriend that = (girlfriend) o;
        return age == that.age && Double.compare(that.hight, hight) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, hight);
    }

    public String toString() {
        return "女朋友类{age = " + age + ", name = " + name + ", hight = " + hight + "}";
    }
}
