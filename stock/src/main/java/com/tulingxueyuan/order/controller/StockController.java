package com.tulingxueyuan.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/stock")
public class StockController {
   @RequestMapping("/reduce")
    public String reduce(){
       System.out.println("库存减少");

       return "Hello World";
   }

}
