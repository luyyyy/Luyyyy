public class Test14 {
    public static void main(String[] args) {
        double price = Price(1800, 11, "头等舱");
        System.out.println(price);
    }
    public static double Price(double price,int month,String select) {
        if (month > 5 && month < 10) {
            if (select == "头等舱") {
                price = 0.9 * price;
            } else if (select == "经济舱") {
                price = 0.85 * price;
            } else {
                System.out.println("输入有误，请稍后再试！");
            }
        } else if (month > 0 && month <= 4 || month > 10 && month < 12) {
            if (select == "头等舱") {
                price = 0.7 * price;
            } else if (select == "经济舱") {
                price = 0.65 * price;
            } else {
                System.out.println("输入有误，请稍后再试！");
            }
        }
        return price;
}}
