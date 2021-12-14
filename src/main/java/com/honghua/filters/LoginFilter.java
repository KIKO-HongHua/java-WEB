package com.honghua.filters;

import com.honghua.tools.Message;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter("/*")
public class LoginFilter implements  Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String url = request.getRequestURI();

        if(url.contains("/js") || url.contains("/css") || url.contains("/index.jsp") ){
            chain.doFilter(request, response);
            return;
        }
        Message msg = (Message) request.getSession().getAttribute("msg");
        if(msg!=null){
            if(url.contains("/update")|| url.contains("/update.jsp")|| url.contains("/delete")){
                chain.doFilter(request, response);
                return;
            }
            request.getRequestDispatcher("/index.jsp").forward(request,response);

        }else{
            if(url.contains("/login.jsp")|| url.contains("/reg.jsp")){
                chain.doFilter(request, response);
                return;
            }
            if(url.contains("/login") || url.contains("/reg")){
                chain.doFilter(request, response);
                return;
            }
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }
}
