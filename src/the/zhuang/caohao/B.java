package the.zhuang.caohao;

public class B extends A{
    public void put2() {
        System.out.println(22222);
    }

    public static void main(String[] args) {
        A a = new B();
        a.put();
        a.put2();
    }
}
