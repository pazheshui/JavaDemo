package the.zhuang.niuke.medium;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ZiFuChuanJiaMi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 密钥
        String mi = in.nextLine().toUpperCase();
        char[] miC = mi.toCharArray();
        // 明文
        String str = in.nextLine();
        char[] strC = str.toCharArray();
        // 先得到新的字母表(元素都是大写)，要去重，保证顺序
        LinkedHashSet<Character> lds = new LinkedHashSet();
        for (int i = 0; i < miC.length; i++) {
            lds.add(miC[i]);
        }

        int k = 0;
        while (k < 26) {
            char c = (char)('A' + k);
            lds.add(c);
            k++;
        }

        ArrayList<Character> al = new ArrayList(lds);

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < strC.length; j++) {
            char c = strC[j];
            if (c == ' ') {
                sb.append(' ');
            } else if (c < 'a') {
                int index = c - 'A';
                sb.append(al.get(index));
            } else if (c >= 'a') {
                int index2 = (int)c - 'a';
                char sss = (char)(al.get(index2) + 'a' - 'A');
                sb.append(sss);
            }
        }

        System.out.println(sb.toString());
    }
}
