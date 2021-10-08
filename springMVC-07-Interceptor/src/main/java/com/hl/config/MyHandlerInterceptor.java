package com.hl.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyHandlerInterceptor implements HandlerInterceptor {

    //return true 就放行了 执行下一个拦截器
    //return false
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object userInfor = session.getAttribute("userInfor");

        if(userInfor == null){

            if(request.getRequestURI().contains("Login")){
                return true;
            }

            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return false;
        }
        if(request.getRequestURI().contains("goMain")){
            return true;
        }
        if(request.getRequestURI().contains("Login")){
            return true;
        }
        if(request.getRequestURI().contains("goLogin")){
            return true;
        }
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("============执行后============");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("=============请理============");
    }
}
