package com.nf.zy.web;

import com.nf.zy.dao.IPhone;
import com.nf.zy.dao.IPhone_All;
import com.nf.zy.entity.IPhone_Attribute;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//添加时跳转到的处理页面
@WebServlet("/add")
public class IPhone_Add extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id")); //获取手机的编号
        String  name =req.getParameter("name"); //手机的名字
        String attribute=req.getParameter("attribute"); //手机的型号
        float price= Float.parseFloat(req.getParameter("price")); //手机的价格
        String date=req.getParameter("date"); //手机的保修日期
        IPhone_Attribute iphone=new IPhone_Attribute(id,name,attribute, price,date);
        IPhone ip=new IPhone_All();
        ip.add(iphone);
        resp.sendRedirect("/index");


    }
}
