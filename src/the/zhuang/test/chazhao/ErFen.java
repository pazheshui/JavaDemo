package the.zhuang.test.chazhao;

import the.zhuang.test.suanfa.KuaiSu;

import java.util.Arrays;

public class ErFen {
    public static void main(String[] args) {
        int[] a = {2,5,6,77,8,99,2,21,11,12,134,44,234,222};
        KuaiSu.quick(a,0,a.length - 1);
        System.out.println(Arrays.toString(a));
        int i = erFen(a, 8);
        System.out.println(i);
    }

    public static int erFen(int[] a, int target) {
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int m  = (l+r)/2;
            if (a[m] == target) {
                return m;
            } else if (a[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
