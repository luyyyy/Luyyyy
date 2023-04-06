public class Test08 {
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        int temp = array[0];
        array[0]=array[4];
        array[4]=temp;
        for(int i=0;i<5;i++){
            System.out.println(array[i]);
        }
    }
}
