package com.honghua.controller;

import com.honghua.dao.PO.User;
import com.honghua.service.UpdateService;
import com.honghua.tools.Message;
import com.honghua.tools.SetSex;
import com.mysql.cj.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

    UpdateService uploadService = new UpdateService();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();

        System.out.println("xinbie:"+SetSex.setSex(request.getParameter("rsex")));

        User user = User.builder()
                .id(Integer.parseInt(request.getParameter("rid")))
                .name(request.getParameter("rname"))
                .sex(SetSex.setSex(request.getParameter("rsex")))
                .age(Integer.parseInt(request.getParameter("rage")))
                .phone(request.getParameter("rphone"))
                .email(request.getParameter("remail"))
                .psw(request.getParameter("rpsw"))
                .build();
        
        
        Message msg = uploadService.upload(user);

        
        
        if(msg.getCode()==1){
            request.getSession().setAttribute("msg",msg);
            response.sendRedirect("update.jsp");
        }else{
            request.getSession().setAttribute("msg",msg);
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
        
        
        
    }
}
