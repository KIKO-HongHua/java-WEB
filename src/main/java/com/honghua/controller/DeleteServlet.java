package com.honghua.controller;

import com.honghua.dao.PO.User;
import com.honghua.service.DeleteService;
import com.honghua.tools.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    private DeleteService deleteService = new DeleteService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Message msg1 = (Message) request.getSession().getAttribute("msg");
        User user = (User) msg1.getObject();
        int id = user.getId();
        Message msg = deleteService.deleteUser(id);
        System.out.println(msg.getMsg());

        if(msg.getCode()==1){
            request.getSession().removeAttribute("msg");
            response.sendRedirect("login.jsp");
        }else{
            request.getSession().setAttribute("msg",msg);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }
}
