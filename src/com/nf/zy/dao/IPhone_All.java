package com.nf.zy.dao;

import com.nf.zy.entity.IPhone_Attribute;

import java.util.ArrayList;
import java.util.List;

//定义全部手机的类型
public class IPhone_All implements IPhone {

    private static List<IPhone_Attribute> iPhones=new ArrayList<>();

    static {
        IPhone_Attribute iPhone1=new IPhone_Attribute(1,"苹果","iPhone X",8999,"2018-2020");
        IPhone_Attribute iPhone2=new IPhone_Attribute(2,"三星","S8300C",1999,"2018-2020");
        IPhone_Attribute iPhone3=new IPhone_Attribute(3,"小米8","6S",2699,"2018-2020");
        IPhone_Attribute iPhone4=new IPhone_Attribute(4,"摩托罗拉","XT17",1399,"2018-2020");
        IPhone_Attribute iPhone5=new IPhone_Attribute(5,"诺基亚","NOKAI8",3499,"2018-2020");

        iPhones.add(iPhone1);
        iPhones.add(iPhone2);
        iPhones.add(iPhone3);
        iPhones.add(iPhone4);
        iPhones.add(iPhone5);
    }


    @Override
    public List<IPhone_Attribute> gitAll() {
        return iPhones;
    }

    @Override
    public IPhone_Attribute getIPhoneById(int id) {
        for (IPhone_Attribute iPhone_attribute :iPhones){
            if (iPhone_attribute.getId()==id){
                return iPhone_attribute;
            }
        }
        return null;
    }

    @Override
    public List<IPhone_Attribute> getIPhoneByName(String name) {
        ArrayList<IPhone_Attribute> iPhone_attributes=new ArrayList<>();
        for (IPhone_Attribute iPhone_attribute :iPhones){
            String realName=iPhone_attribute.getName().toLowerCase();
            if (realName.contains(name.toLowerCase())){
                iPhone_attributes.add(iPhone_attribute);
            }
        }
        return iPhone_attributes;
    }

    @Override
    public boolean update(IPhone_Attribute iPhone) {
        for (IPhone_Attribute iPhone_attribute :iPhones){
            if (iPhone_attribute.getId()==iPhone.getId()){
                iPhone_attribute.setName(iPhone.getName());
                iPhone_attribute.setAttribute(iPhone.getAttribute());
                iPhone_attribute.setPrice(iPhone.getPrice());
                iPhone_attribute.setDate(iPhone.getDate());
                return  true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for (IPhone_Attribute iPhone :iPhones){
            if (iPhone.getId()==id){
                return  iPhones.remove(iPhone);
            }
        }
        return false;
    }

    @Override
    public IPhone_Attribute add(IPhone_Attribute iPhone) {
        if (iPhones.add(iPhone)){
            return  iPhone;
        }
        return null;
    }
}
