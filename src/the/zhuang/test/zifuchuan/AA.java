package the.zhuang.test.zifuchuan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class AA {
    private String name;
    public AA(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("asd");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AA aa = (AA) o;
        return Objects.equals(name, aa.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new AA("T"));
        collection.add(new AA("Tom"));
        System.out.println(collection.contains(new AA("Tom")));

        String a = new String("aaaaaa");
        String b = "aaaaaa";
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public static void gaibian(String str){
        str = "21";
    }
}
