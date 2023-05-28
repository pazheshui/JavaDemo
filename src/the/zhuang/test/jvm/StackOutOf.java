package the.zhuang.test.jvm;

public class StackOutOf {
    private  static int count = 0;
    public static void main(String[] args) {
        count++;
        System.out.println(count);
        main(args);
    }
}
