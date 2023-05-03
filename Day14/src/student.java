import java.util.Objects;

public class student implements Comparable<student>{
    private String name;
    private int age;
    private int point1;
    private int point2;
    private int point3;


    public student() {
    }

    public student(String name, int age, int point1, int point2, int point3) {
        this.name = name;
        this.age = age;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
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

    /**
     * 获取
     * @return point1
     */
    public int getPoint1() {
        return point1;
    }

    /**
     * 设置
     * @param point1
     */
    public void setPoint1(int point1) {
        this.point1 = point1;
    }

    /**
     * 获取
     * @return point2
     */
    public int getPoint2() {
        return point2;
    }

    /**
     * 设置
     * @param point2
     */
    public void setPoint2(int point2) {
        this.point2 = point2;
    }

    /**
     * 获取
     * @return point3
     */
    public int getPoint3() {
        return point3;
    }

    /**
     * 设置
     * @param point3
     */
    public void setPoint3(int point3) {
        this.point3 = point3;
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + ", point1 = " + point1 + ", point2 = " + point2 + ", point3 = " + point3 + "}";
    }

    @Override
    public int compareTo(student s) {
        int sum1 =this.getPoint1()+this.getPoint2()+this.getPoint3();
        int sum2 =s.getPoint1()+s.getPoint2()+s.getPoint3();
        int temp = sum1-sum2;
        temp=temp==0?this.getPoint1()-s.getPoint1():temp;
        temp=temp==0?this.getPoint2()-s.getPoint2():temp;
        temp=temp==0?this.getPoint3()-s.getPoint3():temp;
        temp=temp==0?this.getAge()-s.getAge():temp;
        temp=temp==0?this.getName().compareTo(s.getName()):temp;
        return temp;
    }
}
