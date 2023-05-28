package the.zhuang.test.fanxing;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AA <T,U> extends BB{
    private T t;
    private U u;
    private    static int sss;
    public T  getT(){
        return this.t;
    }

    public void getTT(T t){
        this.t = t;
    }
    public void getUU(U u){
        this.t = t;
    }
    public static <X extends Comparable> X getSS(X xx){
        System.out.println("调用成功");
        return xx;
    }
    public static void print1(){
        System.out.println(1122222221);
    }
    public static void main(String[] args) {
        AA<String,String> stringAA = new AA();
        String t = stringAA.getT();


        AA<Object, Object> objectObjectAA = new AA<>();
        objectObjectAA.print1();

    }
}
class  BB{
    static int x = 1;
    public static void print1(){
        System.out.println(111);
    }
}
