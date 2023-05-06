public class 练习8 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,9,3,7,98};
        getMax(arr);
    }
    public static void  getMax (int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max=max>arr[i]?max:arr[i];
        }
        System.out.println(max);
    }
}
