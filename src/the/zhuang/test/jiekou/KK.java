package the.zhuang.test.jiekou;

public interface KK {
    public default void SS(){
        System.out.println("默认方法，可以通过接口实现类的对象调用");
    };
    public static void sta(){
        System.out.println("静态方法，通过接口.方法名调用");
    };
    default void testChongXie(){
        System.out.println("接口的方法");
    };
}
