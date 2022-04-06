package com.tulingxueyuan.order.controller;

import com.tulingxueyuan.order.pojo.OrderTbl;
import com.tulingxueyuan.order.service.OrderTblService;
import org.apache.skywalking.apm.toolkit.trace.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderTblService orderTblService;
    @RequestMapping("add")
    public String add(){
        return "hello";
    }
    @RequestMapping("all")

    public List<OrderTbl> all(){
        return orderTblService.getAll();
    }
}
