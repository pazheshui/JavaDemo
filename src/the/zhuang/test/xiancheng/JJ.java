package the.zhuang.test.xiancheng;

public class JJ {
    private int i = 99;
    private JJ(){
        System.out.println(112323);
        new Thread(()->{
            System.out.println(this.i);
        }).start();

        try {
            Thread.sleep(10000);
            System.out.println(166666666);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new JJ();
    }
}
