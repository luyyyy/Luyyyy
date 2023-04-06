public class Test12 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
       boolean i= IfIn(88,arr);
       if(i==true){
           System.out.println("该数字在数组中！");
       }else{
           System.out.println("该数字不在数组中！");
       }
    }
    public static boolean IfIn(int p,int []q){
        for (int i = 0;i<q.length;i++){
            if (p==q[i]){
                return true;
            }
        }
        return false;
    }
}
