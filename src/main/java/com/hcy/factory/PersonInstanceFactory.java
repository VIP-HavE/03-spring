package com.hcy.factory;

import com.hcy.bean.Person;

/**
 * @Auther HCY
 * @Date 2022/3/17 22:32
 * @Version V1.0
 */
//实例工厂
public class PersonInstanceFactory {
    public Person getInstance(String name){
        Person person = new Person();
        person.setId(2);
        person.setName(name);
        person.setAge(22);

        return person;
    }
}
