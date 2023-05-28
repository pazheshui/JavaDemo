package the.zhuang.test.shejimoshi.danli;

import java.util.Scanner;

public class Lanhan {
    private static Lanhan lanhan;
    private Lanhan(){

    }
    public static Lanhan getInstance(){
        if (lanhan == null) {
            synchronized (Lanhan.class){
                if (lanhan == null){
                    lanhan = new Lanhan();
                }
            }
        }
        return lanhan;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.hasNextLine());
        System.out.println(scan.hasNext());
//        while (scan.hasNext()) {
//
//        }
    }
}
