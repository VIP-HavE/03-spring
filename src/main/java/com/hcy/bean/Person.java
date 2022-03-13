package com.hcy.bean;

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

    public Person() {
        System.out.println("Person被创建。");
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
