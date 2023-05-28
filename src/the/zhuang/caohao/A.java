package the.zhuang.caohao;

import java.util.LinkedHashSet;

public class A {
    public void put() {
        this.put2();
    }
    public void put2() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(2);
        linkedHashSet.add(23);
        linkedHashSet.add(12113);
        linkedHashSet.add(712113);
        linkedHashSet.add(9712113);
        linkedHashSet.add(89712113);
        System.out.println(linkedHashSet);
    }
}
