package com.nf.zy.web;

import com.nf.zy.dao.IPhone;
import com.nf.zy.dao.IPhone_All;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class IPhoneDel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id")); //获取手机的编号
        IPhone ip=new IPhone_All();
        String msg="";
        if (ip.delete(id)){
            msg+="删除成功！";
        }else {
            msg+="删除失败！";
        }
        req.getSession().setAttribute("msg", msg);
        resp.sendRedirect("/index");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //多个一起删除
        String[] ids=req.getParameterValues("id");
        IPhone_All ip=new IPhone_All();
        for (String id:ids){
            ip.delete(Integer.parseInt(id));
        }
        req.getSession().setAttribute("msg","删除成功！");
        resp.sendRedirect("/jsp/iphone_list.jsp");

    }
}
