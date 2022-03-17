package com.hcy.factory;

import com.hcy.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Auther HCY
 * @Date 2022/3/17 23:14
 * @Version V1.0
 */
/**
 * 此方法时spring创建方式的一种补充，用户可以按照需求创建对象，
 * 创建的对象交由spring IOC容器来进行管理，
 * 无论是否单例，都是在用到的时候创建，不用则不创建
* */
public class MyFactoryBean implements FactoryBean<Person> {

    //获取返回的bean
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setId(3);
        person.setName("王五");

        return person;
    }

    //获取返回bean的类型
    public Class<?> getObjectType() {
        return Person.class;
    }

    //判断当前bean是否时单例的
    public boolean isSingleton() {
        return false;
    }
}
