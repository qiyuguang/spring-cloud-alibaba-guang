package com.tulingxueyuan.order.feign;

import com.tulingxueyuan.order.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//name指定调用rest接口对应的服务名 path 指定调用的接口所在的 @requestMapping
@FeignClient(name="stock-service",path = "/stock",configuration = FeignConfig.class)
public interface StockFeignService {

    //声明需要调用的rest接口对应的方法
    @RequestMapping("/reduce")
    String reduce();
}
