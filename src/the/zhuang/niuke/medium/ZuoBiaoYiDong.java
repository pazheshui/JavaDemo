package the.zhuang.niuke.medium;

import java.math.BigDecimal;
import java.util.Scanner;

public class ZuoBiaoYiDong {
    static int x;
    static int y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入的坐标移动指令,需要过滤掉不合法的
        String next = sc.next();
        // 多个指令，封号分割
        String[] split = next.split(";");
        // 遍历指令，根据每个指令，更新当前坐标
        for (String s : split) {
            update(s);
        }
        System.out.println(x + "," + y);
    }

    // 根据指令，更新当前坐标
    public  static  void update(String zhiLing){
        String caoZuo = zhiLing.substring(0,1);
        String data = zhiLing.substring(1,3);
        BigDecimal dataDecimal = new BigDecimal(data);
        BigDecimal xDecimal = new BigDecimal(x);
        BigDecimal yDecimal = new BigDecimal(y);
        BigDecimal xResult;
        BigDecimal yResult;
        switch (caoZuo) {
            case "A":
                xResult = xDecimal.subtract(dataDecimal);
                x = xResult.intValue();
                break;
            case "D":
                xResult = xDecimal.add(dataDecimal);
                x = xResult.intValue();
                break;
            case "W":
                yResult = yDecimal.add(dataDecimal);
                y = yResult.intValue();
                break;
            case "S":
                yResult = yDecimal.subtract(dataDecimal);
                y = yResult.intValue();
                break;
        }
    }
}
