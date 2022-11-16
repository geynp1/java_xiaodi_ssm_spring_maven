package net.xdclass.sp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    //Ŀ����
    private Object targetObject;
    //��ȡ�������
    public Object newProxyInstance(Object targetObject){
        this.targetObject=targetObject;
        //�󶨹�ϵ��Ҳ���Ǻ;�����ĸ���ʵ�ֹ���
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        try {
            System.out.println("ͨ��JDK��̬�������"+method.getName()+",��ӡ��־ begin");
            result = method.invoke(targetObject, args);
            System.out.println("ͨ��JDK��̬�������"+method.getName()+",��ӡ��־ end");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
