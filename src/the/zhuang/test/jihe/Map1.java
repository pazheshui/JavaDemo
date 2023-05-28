package the.zhuang.test.jihe;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap();
        hashMap.put("1",222);
        hashMap.put("1aaa",222);
        hashMap.put("221",222);
        hashMap.put("1e",222);
        hashMap.put("1ea",222);
        hashMap.put("221ww",222);


        for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        TreeMap treeMap = new TreeMap();
        treeMap.put("bbc",123);
        treeMap.put("abc",123);
        treeMap.put("dbc",123);
        treeMap.put("sbc",123);
        treeMap.put("fbc",123);
        treeMap.put("gbc",123);
        System.out.println(treeMap);
    }
}
