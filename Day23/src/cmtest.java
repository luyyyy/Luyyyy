public class cmtest {
    public static void main(String[] args) {
        cook producer = new cook();
        foodie consumer1 = new foodie();
        foodie consumer2 = new foodie();
        foodie consumer3 = new foodie();
        foodie consumer4 = new foodie();
        consumer1.setName("1");
        consumer2.setName("2");
        consumer3.setName("3");
        consumer4.setName("4");
        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
    }
}
