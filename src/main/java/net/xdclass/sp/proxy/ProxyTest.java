package net.xdclass.sp.proxy;

public class ProxyTest {

    public static void main(String[] args) {
//        PayService payService = new PayServiceImpl();
//        payService.callback("adsdfdafdf");
//        PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
//        payService.callback("323423412123");
//        payService.save(123, 123);
        //JDK动态代理
//        JdkProxy jdkProxy = new JdkProxy();
        //获取代理类对象
//        PayService payServiceProxy =(PayService) jdkProxy.newProxyInstance(new PayServiceImpl());
//
//        payServiceProxy.callback("afsdfadf");
//        payServiceProxy.save(23, 434343);
        //CGlib动态代理
        CglibProxy cglibProxy = new CglibProxy();
        PayService payService = (PayService) cglibProxy.newProxyInstance(new PayServiceImpl());

        //调用目标方法
        payService.save(23, 2343);
        payService.callback("1231231jjafkfj123");

    }
}
