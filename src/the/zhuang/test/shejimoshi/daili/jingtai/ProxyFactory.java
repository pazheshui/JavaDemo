package the.zhuang.test.shejimoshi.daili.jingtai;

public class ProxyFactory implements MyFactory{
    private MyFactory myFactory;
    public ProxyFactory(MyFactory myFactory) {
        this.myFactory = myFactory;
    }
    public void test11(int i ,String s){
    }
    @Override
    public void show() {
        System.out.println("代理之前做的事");
        myFactory.show();
        System.out.println("代理之后做的事");
    }

    public static void main(String[] args) {
        NikeFactory nikeFactory = new NikeFactory();
        ProxyFactory proxyFactory = new ProxyFactory(nikeFactory);
        proxyFactory.show();
    }
}
