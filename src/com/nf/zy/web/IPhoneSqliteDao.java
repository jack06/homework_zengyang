package com.nf.zy.web;

import com.nf.zy.dao.IPhone;
import com.nf.zy.entity.IPhone_Attribute;

import java.sql.*;
import java.util.List;

public class IPhoneSqliteDao implements IPhone {
    @Override
    public List<IPhone_Attribute> gitAll() {
        Connection conn=null;
        Statement st=null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection("jdbc:sqlite:test.db");
//            PreparedStatement preparedStatement=conn.prepareStatement("");
//            CallableStatement callableStatement=conn.prepareCall("");

            ResultSet rs=st.executeQuery("select * from iphone");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public IPhone_Attribute getIPhoneById(int id) {
        return null;
    }

    @Override
    public List<IPhone_Attribute> getIPhoneByName(String name) {
        return null;
    }

    @Override
    public boolean update(IPhone_Attribute iPhone) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public IPhone_Attribute add(IPhone_Attribute iPhone) {
        return null;
    }
}
