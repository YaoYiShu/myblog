package com.yys.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// url 过滤器 ,防止别人用url返回后台并且修改

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
//        检查是否有登录过
        if (request.getSession().getAttribute("user") == null) {
//            重定向到登录页面
            response.sendRedirect("/admin");
            return false;
        }
        return true;
    }
}
