package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class test01 {
    public static void main(String[] args) throws IllegalAccessException {
        students s1 = new students("梨花", 18);
        teacher t1 = new teacher("晓梦", 18, 1000000);
        saveObject(s1);
        saveObject(t1);
    }
    public static void saveObject(Object obj) throws IllegalAccessException {
        Class clazz = obj.getClass();
        Field[] arr = clazz.getDeclaredFields();
        for (Field f : arr) {
            f.setAccessible(true);
            String name = f.getName();
            Object o = f.get(obj);
            System.out.println(name+"="+o);

        }
    }
}
