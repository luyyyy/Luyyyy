public class 冒泡排序 {
    public static void main(String[] args) {
        int [] array = {1,2,3,7,9,3,5,7};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
            }
            }
        }
    }
}
