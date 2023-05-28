package the.zhuang.test.jihe;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

public class AA {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(12);
        treeSet.add(12);
        treeSet.add(1222);
        treeSet.add(322);
        treeSet.add(422);
        treeSet.add(2);
        treeSet.add(22);
        System.out.println("测试TreeSet" + treeSet);

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(2);
        arrayList2.add(3);

        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);


        String[] strings = new String[]{"a"};
        List<String> strings1 = Arrays.asList(strings);
        System.out.println(strings1);


        Object[] objects = strings1.toArray();
        System.out.println(objects);


        String sss = "aa";
        String kk = "aabb";
        System.out.println(sss.compareTo(kk));

        System.out.println("111111111111111");
        ArrayList arrayList1 = new ArrayList(10);
        arrayList1.add(11);
        arrayList1.add(11);
        arrayList1.add(12);
        arrayList1.add(13);

        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList1);
        System.out.println(hashSet);
        ArrayList arrayList3 = new ArrayList(hashSet);
        System.out.println(arrayList3);

    }
}
class KKKK{
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KKKK kkkk = (KKKK) o;
        return Objects.equals(name, kkkk.name);
    }



    public KKKK(String name) {
        this.name = name;
    }
}
