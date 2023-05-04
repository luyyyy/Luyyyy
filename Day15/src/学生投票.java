import java.util.*;

public class 学生投票 {
    public static void main(String[] args) {
        ArrayList <student> list = new ArrayList<>();
        String str = "ABCD";
        int sumA=0;
        int sumB=0;
        int sumC=0;
        int sumD=0;
        int num =0;
        for (int i = 0; i < 80; i++) {
            student stu = new student("name"+i,i);
            list.add(stu);
        }
//        for (student student : list) {
//            System.out.println(student);
//        }
        HashMap <student,String> hm = new HashMap<>();
        for (student stu : list) {
            num = (int)(Math.random() * 4);
            hm.put(stu,""+str.charAt(num));
        }
        Set<Map.Entry<student, String>> entries = hm.entrySet();
//        for (Map.Entry<student, String> entry : entries) {
//            System.out.println(entry);
//        }
        Set<student> students = hm.keySet();
        for (student student : students) {
            String value = hm.get(student);
            if(value.equals("A")){
                sumA++;
            } else if (value.equals("B")) {
                sumB++;
            }else if (value.equals("C")) {
                sumC++;
            }else{
                sumD++;
            }
        }
        int max = sumA>=sumB?sumA:sumB;
        max = max>=sumC?max:sumC;
        max = max>=sumD?max:sumD;
        System.out.println(sumA);
        System.out.println(sumB);
        System.out.println(sumC);
        System.out.println(sumD);
        System.out.println(max);
    }
}