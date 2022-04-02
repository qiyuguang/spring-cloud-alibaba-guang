package com.tulingxueyuan.order.controller;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        return "hello world";
    }
    @SentinelResource(value = "flow",blockHandler = "flowBlockHandler")
    @RequestMapping("flow")
    public String flow(){
        return "正常访问";
    }

    public String flowBlockHandler(BlockException e){
        return "流控";
    }
    @SentinelResource(value = "flowThread",blockHandler = "flowBlockHandler")
    @RequestMapping("flowThread")
    public String flowThread() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return "正常访问";
    }

    public String flowThreadBlockHandler(BlockException e){
        return "流控";
    }

}
