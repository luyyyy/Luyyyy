import java.util.Scanner;

public class 综合练习 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入姓名：");
                String name = sc.nextLine();
                System.out.println("请输入年龄：");
                String agestr = sc.nextLine();
                int age = Integer.parseInt(agestr);
                if(name.length()<2||name.length()>10){
                    throw new NameFormatException();
                }
                if (age<18||age>60){
                    throw new AgeOutOfBoundException();
                }
                break;
            } catch (NameFormatException e) {
                System.err.println("姓名不符合要求！请重新输入：");
            }catch (AgeOutOfBoundException aa){
                System.err.println("年龄不符合要求！请重新输入：");}
            catch(NumberFormatException a){
                System.err.println("年龄格式错误！请重新输入：");
            }
        }
    }
}
