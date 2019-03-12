package xyz.ruankun.webone.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 这个类教你怎么配置拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getParameter("token") != null && request.getParameter("token") != ""){
            System.out.println("你输入了token，但不知道对不对");
        return true;
    }else{
            System.out.println("你没有登录");
            return true;
        }
    }
}
