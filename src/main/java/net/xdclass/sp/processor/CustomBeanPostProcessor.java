package net.xdclass.sp.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor postProcessBeforeInitialization beanName="+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor postProcessAfterInitialization beanName="+beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
