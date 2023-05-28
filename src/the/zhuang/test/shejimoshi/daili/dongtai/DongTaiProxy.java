package the.zhuang.test.shejimoshi.daili.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DongTaiProxy {
    /**
     * 根据被代理类对象，生成代理对象
     *
     * @param obj obj
     * @return {@link Object}
     */
    public static Object getInstance(Object obj) {
        MyHandle myHandle = new MyHandle();
        myHandle.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),myHandle);
    }

    public static void main(String[] args) {
//        SuperMan superMan = new SuperMan();
        PC pc = new PC();
        USB human = (USB) DongTaiProxy.getInstance(pc);
        human.chuanshu();
    }
}
class MyHandle implements InvocationHandler{

    private Object object;
    public void bind(Object o){
        object = o;
    }

    // 通过代理类调用方法时，该方法也会被调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        HumanUtil humanUtil = new HumanUtil();
        humanUtil.method1();
        // method，也就是通过代理类调用的方法，它也作为被代理类要调用的方法
        Object invoke = method.invoke(object, args);
        humanUtil.method2();
        return  invoke;
    }
}
class HumanUtil{
    public void method1(){
        System.out.println("开始");
    }
    public void method2(){
        System.out.println("结束");
    }

}
