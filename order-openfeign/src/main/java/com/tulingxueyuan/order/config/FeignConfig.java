package com.tulingxueyuan.order.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//使用@Configuration 会将配置作用在所有的服务器
//如果只想针对某一个服务进行配置 就不要加@Configuration
//@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

    /**
     * 设置超时时间
     * @return
     */
    @Bean
    public Request.Options options(){
        return  new Request.Options(5000,10000);
    }

    /**
     * 自定义拦截器
     * @return
     */
   /* @Bean
    public FeignAuthRequestInterceptor feignAuthRequestInterceptor(){
        return new FeignAuthRequestInterceptor();
    }*/
}
