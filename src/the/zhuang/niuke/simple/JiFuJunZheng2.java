package the.zhuang.niuke.simple;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class JiFuJunZheng2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        String s1 = in.nextLine();
//        double res = 0;
//        String[] s2 = s1.split(" ");
//        ArrayList<String> zheng = new ArrayList();
//        ArrayList<String> fu = new ArrayList();
//        for (int i = 0; i < s2.length; i++) {
//            if (s2[i].contains("-")) {
//                fu.add(s2[i]);
//            } else {
//                zheng.add(s2[i]);
//            }
//        }
//
//        double all = 0;
//        if (zheng.size() > 0) {
//            for (String s3 : zheng) {
//                int re = Integer.parseInt(s3);
//                all += re;
//            }
//
//            res = all/zheng.size();
//        }
//
//        System.out.println(fu.size());
//        System.out.println(String.format("%.1f",res));



        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int temp = 0;
        int countN = 0;
        int countP = 0;
        double sum = 0.0;
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            temp = in.nextInt();
            if(temp<0){
                countN++;
            }else if(temp>0){
                countP++;
                sum += temp;
            }
        }
        System.out.println(countN);
        if(countP==0){
            System.out.printf("0.0");
        }else{
            System.out.printf("%.1f\n",sum/countP);
        }

        TreeMap treeMap = new TreeMap();
//        String a = '1';
//        a.indexOf()
    }
}
