public class 类练习 {
    public static void main(String[] args) {
        Girl gr = new Girl();
        System.out.println("老婆的名字是：");
        gr.setName("永真");
        String name =gr.getName();
        System.out.println(name);
        System.out.println("老婆的年龄是：");
        gr.setAge(18);
        int age = gr.getAge();
        System.out.println(age);

    }
}
