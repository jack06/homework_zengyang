package com.nf.zy.test;

import com.nf.zy.dao.IPhone;
import com.nf.zy.dao.IPhone_All;
import com.nf.zy.entity.IPhone_Attribute;

public class Main {
    public static void main(String[] args) {
        IPhone  ip=new IPhone_All();
        IPhone_Attribute ii=new IPhone_Attribute();
        ii.setId(2);
        ii.setName("ss");
        ip.update(ii);
        System.out.println(ip.gitAll().toString());

    }
}
