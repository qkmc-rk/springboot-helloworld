package xyz.ruankun.webone.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.ruankun.webone.interceptor.LoginInterceptor;

/**
 * spring boot的配置类，该配置类用于配置webmvc的拦截器，还可以重写很多方法来配置其它的组件如视图解析器等
 */
@Configuration
public class IntercepterCofig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns("/login");
    }
}
