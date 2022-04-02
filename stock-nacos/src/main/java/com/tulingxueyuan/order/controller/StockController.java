package com.tulingxueyuan.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/stock")
public class StockController {

   @Value("${server.port}")
   String port;

    @RequestMapping("/reduce")
    public String reduce(){
       System.out.println("库存减少");

       return "库存减少"+port;
   }
    @RequestMapping("/reduce2")
    public String reduce2(){
        int a = 1/0;
        System.out.println("库存减少");

        return "库存减少"+port;
    }

}
