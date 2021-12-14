package com.honghua.controller;


import com.honghua.dao.PO.User;
import com.honghua.service.LogService;
import com.honghua.tools.Message;
import com.honghua.tools.NotNull;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private LogService logService = new LogService();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String lid = request.getParameter("lid");
        String lpsw = request.getParameter("lpsw");

        Message msg = logService.login(lid,lpsw);

        if(msg.getCode()==1){
            request.getSession().setAttribute("msg",msg);
            response.sendRedirect("index.jsp");

        }else{
            request.getSession().setAttribute("msg",msg);
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }
}
