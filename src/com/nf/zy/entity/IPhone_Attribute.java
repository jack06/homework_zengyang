package com.nf.zy.entity;

import java.util.List;

//定义手机类
public class IPhone_Attribute {
    int id; //第几款手机
    String name;//手机名
    String attribute; //手机属性
    float price; //手机价格
    String date; //手机生产日期-保修期

    public IPhone_Attribute() {
    }

    public IPhone_Attribute(int id, String name, String attribute, float price, String date) {
        this.id = id;
        this.name = name;
        this.attribute = attribute;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "IPhone_Attribute{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}







