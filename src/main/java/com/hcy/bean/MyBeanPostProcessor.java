package com.hcy.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Auther HCY
 * @Date 2022/3/19 23:20
 * @Version V1.0
 */
public class MyBeanPostProcessor  implements BeanPostProcessor {
    /**
     * 在每一个对象的初始化方法前面执行
     * bean 表示创建的具体对象
     * beanName 表示bean的id属性
     * */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:" + beanName);
        return bean;
    }

    /**
     * 在每一个对象的初始化方法后面执行
     * */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:" + beanName);
        return bean;
    }
}
