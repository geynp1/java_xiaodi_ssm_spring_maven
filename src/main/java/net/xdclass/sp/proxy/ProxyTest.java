package net.xdclass.sp.proxy;

public class ProxyTest {

    public static void main(String[] args) {
//        PayService payService = new PayServiceImpl();
//        payService.callback("adsdfdafdf");
//        PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
//        payService.callback("323423412123");
//        payService.save(123, 123);
        //JDK��̬����
//        JdkProxy jdkProxy = new JdkProxy();
        //��ȡ���������
//        PayService payServiceProxy =(PayService) jdkProxy.newProxyInstance(new PayServiceImpl());
//
//        payServiceProxy.callback("afsdfadf");
//        payServiceProxy.save(23, 434343);
        //CGlib��̬����
        CglibProxy cglibProxy = new CglibProxy();
        PayService payService = (PayService) cglibProxy.newProxyInstance(new PayServiceImpl());

        //����Ŀ�귽��
        payService.save(23, 2343);
        payService.callback("1231231jjafkfj123");

    }
}
