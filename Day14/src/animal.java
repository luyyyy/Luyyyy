public abstract class animal {
    public static void main(String[] args) {
        student s1 = new student("zhangsan",23,90,90,90);
        student s2 = new student("wangwu",24,90,90,90);
        student s3 = new student("lisi",25,90,90,90);
        int i = s2.getName().compareTo(s3.getName());
        System.out.println(i);
    }

}
