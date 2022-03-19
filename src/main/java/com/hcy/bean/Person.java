package com.hcy.bean;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Auther HCY
 * @Date 2022/3/13 21:22
 * @Version V1.0
 */
public class Person {
    private int id;
    private String name;
    private int age;
    private String gender;

    private Date date;
    private String[] hobbies;
    private Address address;

    private List<Address> lists;
    private Set<String> sets;
    private Map<String, Object> maps;
    private Properties properties;


    public Person() {
        System.out.println("Person被创建。");
    }

    public Person(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        System.out.println("ING...");
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("INA...");
    }

    public void init(){
        //编写N行逻辑代码完成初始化功能
        System.out.println("person对象初始化完成");
    }

    public void destory(){
        //编写N行逻辑代码完成初始化功能
        System.out.println("person对象被销毁");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setLists(List<Address> lists) {
        this.lists = lists;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", address=" + address +
                ", lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
