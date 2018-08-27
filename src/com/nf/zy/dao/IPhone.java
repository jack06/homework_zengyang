package com.nf.zy.dao;

import com.nf.zy.entity.IPhone_Attribute;

import java.util.List;

//定义手机接口
public interface IPhone {
    List<IPhone_Attribute> gitAll(); //获取所有手机的方法
    IPhone_Attribute getIPhoneById(int id); //通过id获取手机
    List<IPhone_Attribute> getIPhoneByName(String name); //通过手机名字获取手机
    boolean update(IPhone_Attribute iPhone); //修改手机信息
    boolean delete(int id); //通过手机id删除手机
    IPhone_Attribute add(IPhone_Attribute iPhone);//添加手机
}
