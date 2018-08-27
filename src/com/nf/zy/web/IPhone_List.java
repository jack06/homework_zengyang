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
import java.util.List;
@WebServlet("/index")

public class IPhone_List extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IPhone iPhone=new IPhone_All();
        List<IPhone_Attribute> iPhones=iPhone.gitAll();
        req.setAttribute("iphones",iPhones);
        req.getRequestDispatcher("/jsp/layouts/iphone_list.jsp").forward(req,resp);
    }
}
