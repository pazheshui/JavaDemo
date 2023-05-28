//package the.zhuang.test.authority;
//
//import java.util.Arrays;
//import java.util.concurrent.CountDownLatch;
//import java.util.function.Function;
//
//public class A {
//    private  String name;
//
//    public String getName() {
//        return this.name;
//    }
//
//    public A(String ss){
//        this.name = ss;
//    }
//    public static String sss(){
//        return this.name;
//    }
//}
//
//class B  {
//
//
//    public static void main(String[] args) throws InterruptedException {
//        CountDownLatch countDownLatch = new CountDownLatch(2);
//        new Thread(() -> {
//            System.out.println("1");
//            countDownLatch.countDown();
//        }).start();
//        new Thread(() -> {
//            System.out.println("2");
//            countDownLatch.countDown();
//        }).start();
//        countDownLatch.await();
//        System.out.println("sad");
//    }
//
//}
//
//interface PP {
//    int a = 1;
//
//    default void getA() {
//        System.out.println(1);
//        String aa = "a";
//    }
//
//    ;
//
//    default void getV() {
//        System.out.println(1211);
//    }
//}
//
