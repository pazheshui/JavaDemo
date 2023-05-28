package the.zhuang.test.fanshe;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Person {
    private String name;
    private int i;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", i=" + i +
                '}';
    }

    private Person(String a, int i){
        name = a;
        this.i = i;
    }
    private void  show(){
        System.out.println(111);
    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class clazz = Person.class;
//        BeanUtils.
        Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(false);
//        Person person = (Person) constructor.newInstance("222",2);
//        System.out.println(person);
//        Field name = clazz.getDeclaredField("name");
////        name.setAccessible(false);
//        name.set(person,"232323");
//        Method show = clazz.getDeclaredMethod("show");
////        show.setAccessible(false);
//        show.invoke(person);
//        System.out.println(person);
    }
}
