package net.xdclass.sp.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    //Ŀ����
    private Object targetObject;

    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();
        //���ô�����ĸ��ࣨĿ���ࣩ
        enhancer.setSuperclass(this.targetObject.getClass());//����
        //���ûص�����
        enhancer.setCallback(this);
        //��������(�������)
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        try {
            System.out.println("ͨ��cglib��̬�������"+method.getName()+",��ӡ��־ begin");
            methodProxy.invokeSuper(o, args);
            System.out.println("ͨ��cglib��̬�������"+method.getName()+",��ӡ��־ end");

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
