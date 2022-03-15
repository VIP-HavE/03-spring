package com.hcy.bean;

import java.security.PrivateKey;

/**
 * @Auther HCY
 * @Date 2022/3/14 22:58
 * @Version V1.0
 */
public class Address {
    private String province;
    private String city;
    private String town;

    public Address() {
        System.out.println("address被创建");
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
