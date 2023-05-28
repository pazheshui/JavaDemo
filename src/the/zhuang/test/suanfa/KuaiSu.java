package the.zhuang.test.suanfa;

import java.util.Arrays;

// 从小到大排序
public class KuaiSu {
    public static void main(String[] args) {
        int[] a = new int[]{4,3,2,1,9,9,22,1,23,233,44,56,2,34,42,222};
        quick(a,0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quick(int[] a, int l, int h) {
        // 分区里面的元素个数，小于等于1时，退出递归
        if (l > h) {
            return;
        }
        // 先来一次分区排序
        int partition = partition(a, l, h);
        // 对左区域，分区排序
        quick(a, l, partition - 1);
        // 对右区域，分区排序
        quick(a, partition + 1 ,h);
    }

    public static int partition(int[] a, int l, int h) {
        // 保存基准值，便于双指针重叠时，做基准值的交换
        int pv = a[l];
        // 保存双指针
        int i = l;
        int j = h;
        while (i < j) {
            // 右指针，j 找 小数
            while (i < j && a[j] > pv) {
                j--;
            }

            // 左指针，i 找 大数
            while (i < j && a[i] <= pv) {
                i++;
            }
            // 交换大数和小数
            swap(a, i, j);
        }
        // 指针重合时，交换基准值
        swap(a, l, i);
        // 返回基准值的下标
        return i;
    }

    // 交换i和j上的值
    public static void swap(int[] a,int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
