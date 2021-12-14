package com.honghua.controller;

import com.honghua.dao.PO.User;
import com.honghua.service.RegService;
import com.honghua.tools.SetSex;
import com.honghua.tools.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {

    private RegService regService = new RegService();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");







        User user = User.builder()
                .id(Integer.parseInt(request.getParameter("rid")))
                .name(request.getParameter("rname"))
                .sex(SetSex.setSex(request.getParameter("rsex")))
                .age(Integer.parseInt(request.getParameter("rage")))
                .phone(request.getParameter("rphone"))
                .email(request.getParameter("remail"))
                .psw(request.getParameter("rpsw"))
                .build();
        

        Message msg = regService.register(user);



        if(msg.getCode()==1){
            request.getSession().setAttribute("user",msg.getObject());
            response.sendRedirect("login.jsp");
        }else{
            request.getSession().setAttribute("msg",msg);
            request.getRequestDispatcher("reg.jsp").forward(request,response);
        }


    }
}

