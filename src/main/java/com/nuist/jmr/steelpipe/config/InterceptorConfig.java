package com.nuist.jmr.steelpipe.config;

import com.nuist.jmr.steelpipe.Interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    private TokenInterceptor tokenInterceptor;

    public InterceptorConfig(TokenInterceptor tokenInterceptor) {
        this.tokenInterceptor = tokenInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> excludePath = new ArrayList<>();
        String sysUserLogin = "/api/sysUser/login";
        String userLogin = "/api/user/login";
        excludePath.add(sysUserLogin);
        excludePath.add(userLogin);
        registry.addInterceptor(tokenInterceptor).excludePathPatterns(excludePath);
    }
}
