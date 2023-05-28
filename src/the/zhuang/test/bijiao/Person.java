package the.zhuang.test.bijiao;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Person implements Comparable{
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
//        Person p = (Person)o;
//        if (this.age > p.age) {
//            return -1;
//        }else if(this.age < p.age) {
//            return 1;
//        }else {
//            return this.name.compareTo(p.name);
//        }
        return 0;
    }

    public static void main(String[] args) {
        Person abc = new Person(2, "abc");
        Person abc1 = new Person(533, "xabbc");
        Person abc2 = new Person(22, "tabvc");
        Person abc3 = new Person(3, "abcv");
        Person abc4 = new Person(2, "sabc");
        Person abc5 = new Person(4, "abvc");


        TreeSet<Person> treeSet = new TreeSet();
        treeSet.add(abc);
        treeSet.add(abc1);
        treeSet.add(abc2);
        treeSet.add(abc3);
        treeSet.add(abc4);
        treeSet.add(abc5);
        System.out.println(treeSet);
        Person[] oo  = new Person[6];
        oo[0]= abc;
        oo[1]= abc1;
        oo[2]= abc2;
        oo[3]= abc3;
        oo[4]= abc4;
        oo[5]= abc5;

        Arrays.sort(oo);

        System.out.println(Arrays.toString(oo));


        TreeMap treeMap = new TreeMap();
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯");
        treeMap.put("smith", "斯密斯");
        treeMap.put("abc", "帅哥");

        System.out.println(treeMap);


        Scanner in = new Scanner(System.in);
        int i = Integer.parseInt(in.nextLine());
        String[] arr = new String[i];
        for (int j = 0; j < i; j++) {
            arr[j] = in.nextLine();
        }

        Arrays.sort(arr);

        for (int z = 0; z<i; z++) {
            System.out.println(arr[z]);
        }

    }

    public static void ss(){

    }
}
