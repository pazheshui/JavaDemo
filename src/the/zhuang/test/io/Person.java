package the.zhuang.test.io;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;

    @Override
    public String toString() {
        return super.toString();
    }

    private static final long serialVersionUID = 7782452211244920811L;

    public Person(String name) {
        this.name = name;
    }
}
