package the.zhuang.test.zifuchuan;

import the.zhuang.test.zhujie.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class BB {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new OOO("AA"));
        hashSet.add(new OOO("AA"));
        System.out.println(hashSet);
    }

}
class OOO{
    private String name;

    public OOO(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OOO ooo = (OOO) o;
        return Objects.equals(name, ooo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
