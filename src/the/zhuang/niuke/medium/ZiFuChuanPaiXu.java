package the.zhuang.niuke.medium;

import java.util.*;
import java.util.Scanner;

public class ZiFuChuanPaiXu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = chuli(s1);
        System.out.println(s2);
    }

    public static String chuli (String str) {
        List<Character> l = new ArrayList();

        // 收集字母
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                l.add(c);
            }
        }
        new String("1").equals(new String("1"));

        // 排序收集的字母
        l.sort((o1,o2) -> {
            return Character.toLowerCase(o1) - Character.toLowerCase(o2);
        });

        // 遍历源字符串中每个字符，判断字符：如果是字母，从集合取字母，如果不是，则从源字符串取
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                sb.append(l.get(j));
                j++;
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
