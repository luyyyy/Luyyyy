public class Test10 {
    public static void main(String[] args) {
       int max =  Compare(Size(20,30),Size(10,60));
        System.out.println(max);
    }
   public static int Size(int length,int width){
        return length*width;
   }
   public static int Compare(int S1,int S2){
        return Math.max(S1,S2);
   }
}
