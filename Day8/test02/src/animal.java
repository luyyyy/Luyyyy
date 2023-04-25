public abstract class animal {
private String name;
private int age;


public animal() {
        }

public animal(String name, int age) {
        this.name = name;
        this.age = age;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public int getAge() {
        return age;
        }

public void setAge(int age) {
        this.age = age;
        }
public abstract void activity();
public void drink (){
    System.out.println("喝水");
        }
}
