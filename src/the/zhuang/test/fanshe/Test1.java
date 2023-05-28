package the.zhuang.test.fanshe;

public class Test1 {
    private  int i = 2;
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<Test1> test1Class = Test1.class;
        Test1 test1 = test1Class.newInstance();
        System.out.println(test1.i);
    }
}
