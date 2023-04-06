public class Test02 {
    public static void main(String[] args) {
        int Height = 8844420;
        double Paper = 0.1;
        int count = 0;
        while(Paper < Height){
            Paper *=2;
            count ++;
        }
        System.out.println("纸要折到珠穆朗玛峰高度至少需要"+count+"次折叠!");
        System.out.println("此时纸巾的高度是："+ Paper);
    }
}
