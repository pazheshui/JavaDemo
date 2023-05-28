package the.zhuang.test.shejimoshi.danli;

public class Erhan {
    private static Erhan erhan = new Erhan();
    private Erhan(){

    }
    public static Erhan getInstance(){
        return erhan;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                System.out.println(Erhan.getInstance().hashCode());
            }).start();
        }
    }
}
