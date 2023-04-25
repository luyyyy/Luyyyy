public class frog extends animal implements swim {

    @Override
    public void activity() {
        System.out.println("吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳懂不懂？");
    }
}
