package the.zhuang.caohao;

import java.util.LinkedHashSet;
import java.util.Objects;

public class C {
    private String name;

    public C(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return Objects.equals(name, c.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        int  ss = 'a' - 'b';
    }
}
