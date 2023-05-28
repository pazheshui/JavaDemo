package the.zhuang.niuke.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HeBingBiao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        Map<Integer,Integer> map = new HashMap(z);
        for(int i = 0;i < z; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (map.containsKey(x)) {
                map.put(x,map.get(x)+ y);
            }else {
                map.put(x,y);
            }
        }

        for (Integer s : map.keySet()) {
            System.out.print(s + " "+ map.get(s));
            System.out.println();
        }
    }
}
