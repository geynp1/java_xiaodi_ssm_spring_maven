package net.xdclass.sp.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    //目标类
    private Object targetObject;

    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();
        //设置代理类的父类（目标类）
        enhancer.setSuperclass(this.targetObject.getClass());//父类
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类(代理对象)
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        try {
            System.out.println("通过cglib动态代理调用"+method.getName()+",打印日志 begin");
            methodProxy.invokeSuper(o, args);
            System.out.println("通过cglib动态代理调用"+method.getName()+",打印日志 end");

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
