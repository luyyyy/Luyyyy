public class dog extends animal implements swim{
    @Override
    public void activity() {
        System.out.println("吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨会不会！");
    }
}
