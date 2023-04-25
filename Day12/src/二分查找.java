public class 二分查找 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,9,8,7,10};
        int p = 77;
        binarySearch(arr,p);
    }
    public static void binarySearch(int [] arr,int p){
        int high = arr.length-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<p){
                low = mid +1;
            } else if (arr[mid]>p) {
                high = mid-1;
            }else{
                System.out.println("找到了！");
                break;
            }
        }
        if(low>high){
            System.out.println("没有这个数字！");
        }
    }

}
