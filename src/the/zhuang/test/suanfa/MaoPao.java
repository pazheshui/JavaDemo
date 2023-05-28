package the.zhuang.test.suanfa;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
        int[] a = new int[]{4,3,2,1,9,9,22,1,23,233,44,56,2,34,42,222};
//        // 总共有几轮，比如总共有4个数，则有3轮
//        for (int i = 0; i<a.length-1; i++) {
//            // 每一轮比较的次数，如果有4个数，则第一轮比较的次数有3次，所以减1，又因为后续每一轮，需要排除之前每一轮中，已经排的数，所以减i
//            for (int j = 0; j<a.length-1-i; j++){
//                if (a[j] > a[j+1]) {
//                    int temp = a[j+1];
//                    a[j+1] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }


        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] >  a[j+1]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
