package com.hcy.factory;

import com.hcy.bean.Person;

/**
 * @Auther HCY
 * @Date 2022/3/17 22:32
 * @Version V1.0
 */
//静态工厂类
public class PersonStaticFactory {
    public static Person getInstance(String name){
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        person.setAge(11);

        return person;
    }
}
