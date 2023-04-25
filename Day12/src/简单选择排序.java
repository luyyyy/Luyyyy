public class 简单选择排序 {
    public static void main(String[] args) {
        int [] arr = {1,3,2,5,9,6,7,23,56,73,25,29};
        chooseSort( arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void chooseSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length;j++ ) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
