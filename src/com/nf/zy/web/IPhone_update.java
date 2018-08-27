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

@WebServlet("/update")
public class IPhone_update extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id= Integer.parseInt(req.getParameter("id"));
        IPhone iPhone=new IPhone_All();
        IPhone_Attribute iPhone_all=iPhone.getIPhoneById(id);
        req.setAttribute("iphone",iPhone);
        req.getRequestDispatcher("/jsp/layouts/iPhone_update.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id")); //获取手机的编号
        String  name =req.getParameter("name"); //手机的名字
        String attribute=req.getParameter("attribute"); //手机的型号
        float price= Float.parseFloat(req.getParameter("price")); //手机的价格
        String date=req.getParameter("date"); //手机的保修日期
        IPhone_Attribute iPhone=new IPhone_Attribute(id,name,attribute,price,date);
        IPhone iP=new IPhone_All();
        iP.update(iPhone);
        req.getSession().setAttribute("msg","更新成功！");
        resp.sendRedirect("/index");

    }
}
