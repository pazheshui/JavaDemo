package the.zhuang.test.fanxing;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class CC<T> {
    private T t;
    public T getT(){
        return t;
    }
}
// 是泛型类
class DD<T> extends CC<T> {
    public static void main(String[] args) {
        DD<String> dd = new DD();
        System.out.println(dd.getT());
    }
}
// 不是泛型类
class FF extends CC<Integer>{
    public static void main(String[] args) {
        FF ff = new FF();
        Integer t = ff.getT();
    }
}


class OO {

}
 class PP extends OO{
    public static void main(String[] args) {

//        List<PP> ss = new ArrayList<>();
//
//        ssss(ss);
//
//        List<OO> dd = new ArrayList<>();
//
//        uuuuuuu(dd);
//
//        Double aDouble = new Double(1.1);
//        Integer integer = new Integer(1);
//        double v = aDouble + integer;

        Integer integer = new Integer(1);
        Integer integer1 = new Integer(1);
        System.out.println(integer == integer1);

        Integer i = 1;
        Integer j = 1;
        System.out.println(i == j);

        Integer integer2 = Integer.valueOf(1);
        Integer integer3 = Integer.valueOf(1);
        System.out.println(integer2 == integer3);

        Double aDouble = new Double(2.2);



    }
    public static void ssss(List<? extends OO> oos){

    }
    public static void uuuuuuu(List<? super OO> oos){

    }
}

