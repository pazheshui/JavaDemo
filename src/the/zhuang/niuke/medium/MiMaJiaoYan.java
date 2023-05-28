package the.zhuang.niuke.medium;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MiMaJiaoYan {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String next = sc.next();
            if (next.length() <= 8) {
                System.out.println("NG");
                continue;
            }

            if (getStr1(next,0,3)) {
                System.out.println("NG");
                continue;
            }

            if (isLocal(next)) {
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }
    public static boolean getStr(String str, int l, int r) {
        if (l >= str.length()) {
            return false;
        }
        if (str.substring(r).contains(str.substring(l,r))) {
            return true;
        } else {
            return getStr(str,l+1,r+1);
        }

    }

    // 检验是否有重复的字串
    public static boolean getStr1(String str, int left , int right) {
        if (left>=str.length()) {
            return false;
        }

        if (str.substring(right).contains(str.substring(left,right))) {
            return true;
        } else {
            return getString(str, left+1, right +1);
        }

    }
    // 检验是否包含4种中的3种
    public static boolean isLocal(String str) {
        int count = 0;
        Pattern p1 = Pattern.compile("[A-Z]");
        if (p1.matcher(str).find()) {
            count++;
        }

        Pattern p2 = Pattern.compile("[a-z]");
        if (p2.matcher(str).find()) {
            count++;
        }

        Pattern p3 = Pattern.compile("[0-9]");
        if (p3.matcher(str).find()) {
            count++;
        }

        Pattern p4 = Pattern.compile("[^0-9a-zA-Z]");
        if (p4.matcher(str).find()) {
            count++;
        }
        // 至少有3种满足，则返回false
        if (count >=3) {
            return false;
        } else {
            return true;
        }

    }
























    // 校验是否有重复子串
    private static boolean getString(String str, int l, int r) {
        if (r >= str.length()) {
            return false;
        }
        if (str.substring(r).contains(str.substring(l, r))) {
            return true;
        } else {
            return getString(str,l+1,r+1);
        }
    }
    // 检查是否满足正则
    private static boolean getMatch(String str){
        int count = 0;
        Pattern p1 = Pattern.compile("[A-Z]");
        if(p1.matcher(str).find()){
            count++;
        }
        Pattern p2 = Pattern.compile("[a-z]");
        if(p2.matcher(str).find()){
            count++;
        }
        Pattern p3 = Pattern.compile("[0-9]");
        if(p3.matcher(str).find()){
            count++;
        }
        Pattern p4 = Pattern.compile("[^a-zA-Z0-9]");
        if(p4.matcher(str).find()){
            count++;
        }
        if(count >= 3){
            return false;
        }else{
            return true;
        }
    }
}
