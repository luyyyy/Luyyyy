public class Tst11 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        System.out.println(GetMax(arr));
    }
    public static int GetMax(int [] p){
        int max = p[0];
        for(int i=0;i<p.length;i++){
           max = max>p[i]?max:p[i];
        }
        return max;
    }
}
