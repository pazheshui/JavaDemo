package the.zhuang.niuke.simple;

import java.util.BitSet;

public class ZiFuGeShu {
    public static void main(String[] args) throws Exception{
//                 BitSet bs = new BitSet();
//                 int[] nums={1,2,3,4,5,6,7,8,9,10,10};
//                 for (int num : nums) {
//                         if(bs.get(num)){
//                                 System.out.println(num);    //10
//                                 break;
//                         }else {
//                                 bs.set(num);
//                         }
//                     }
                 String a = "a1";
//        char[] chars = a.toCharArray();

        StringBuilder stringBuilder = new StringBuilder(a);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        String[] a12 = new String[]{"a1"};
//        a12.length
    }
}
