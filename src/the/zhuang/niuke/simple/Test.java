package the.zhuang.niuke.simple;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s1 = in.next().toLowerCase();
//        String s2 = in.next().toLowerCase();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1.length() - s1.replaceAll(s2,"").length());

        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        // 不足的是有几位
        int len = s1.length()%8;
        // 得出要补多少个0
        int addZero = 8 - len;

        StringBuilder sb = new StringBuilder();
        sb.append(s1);

        // 根据要补的数量，添加到字符串
        if((addZero > 0)&&(addZero < 8)) {
            sb.append("0");
            addZero--;
        }

        String res = sb.toString();
        int i = res.indexOf(0);
        // 每隔8位，输出
        char a = 'a';
        System.out.println(a +"");
        while(res.length() > 0) {
            System.out.println(res.substring(0,8));
            res = res.substring(8);
        }
    }
}
