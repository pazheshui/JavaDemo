package the.zhuang.test.fanshe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class AA {
    private int i;
    private static String name = "sssssssdsdsdsd";
    static {
        name ="112323";
    }
    @Override
    public String toString() {
        return "AA{" +
                "name='" + name + '\'' +
                ", i=" + i +
                '}';
    }
    public AA(String a, int i){
        name = a;
        this.i = i;
    }
    private AA(String a){
        name = a;
    }
    private void  show(){
        System.out.println(111);
    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, ClassNotFoundException, IOException {
//        Class clazz = AA.class;
//        System.out.println(clazz);
//
//        AA aa = new AA("String", 1);
//        Class a = aa.getClass();
//
//        Class b = Class.forName("the.zhuang.test.fanshe.AA");
//
//        System.out.println(clazz == a);
//        System.out.println(a == b);
//
//        ClassLoader classLoader = AA.class.getClassLoader();
//        Class aClass = classLoader.loadClass("the.zhuang.test.fanshe.AA");
//        System.out.println(aClass == a);


    }
}
